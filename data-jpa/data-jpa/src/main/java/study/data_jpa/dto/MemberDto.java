package study.data_jpa.dto;

import lombok.Data;

@Data
public class MemberDto {
    private Long id;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    private String username;
    private String teamName;

}

package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import webcast.data.FansDiscordGuildInfo;
import webcast.data.FansDiscordRoleInfo;

/* loaded from: classes17.dex */
public final class GetDiscordSettingsResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("guild_info")
        public FansDiscordGuildInfo guildInfo;

        @InterfaceC65349Pkn("role_info")
        public FansDiscordRoleInfo roleInfo;
    }
}

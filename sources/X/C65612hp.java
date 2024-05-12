package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApi;

/* renamed from: X.2hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65612hp {
    public static /* synthetic */ Object LIZ(TakoApi takoApi, int i, String str, Long l, String str2, Long l2, String str3, String str4, Long l3, Boolean bool, String str5, InterfaceC67352kd interfaceC67352kd, int i2) {
        Boolean bool2 = bool;
        Long l4 = l3;
        Long l5 = l;
        String str6 = str;
        String str7 = str2;
        Long l6 = l2;
        String str8 = str3;
        String str9 = str4;
        String str10 = null;
        if ((i2 & 2) != 0) {
            str6 = null;
        }
        if ((i2 & 4) != 0) {
            l5 = null;
        }
        if ((i2 & 8) != 0) {
            str7 = null;
        }
        if ((i2 & 16) != 0) {
            l6 = null;
        }
        if ((i2 & 32) != 0) {
            str8 = null;
        }
        if ((i2 & 64) != 0) {
            str9 = null;
        }
        if ((i2 & 128) != 0) {
            l4 = null;
        }
        if ((i2 & 256) != 0) {
            bool2 = null;
        }
        if ((i2 & 512) == 0) {
            str10 = str5;
        }
        return takoApi.getTakoSugList(i, str6, l5, str7, l6, str8, str9, l4, bool2, str10, interfaceC67352kd);
    }
}

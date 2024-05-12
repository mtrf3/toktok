package X;

import org.json.JSONObject;

/* renamed from: X.Tlh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75597Tlh {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C32169Cjt.LJLIL);
    public static boolean LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    public static InterfaceC20950rz LIZ() {
        return (InterfaceC20950rz) LIZ.getValue();
    }

    public static void LIZIZ() {
        C0NB.LIZIZ("LiveInteractFeatureCollector", "onCloseCoHostInvitingList");
        if (LIZIZ) {
            return;
        }
        LIZIZ = false;
        C20940ry.LIZ(LIZ(), "co_host_invite_from_list", new JSONObject().putOpt("result", 0), 2, 8);
    }

    public static void LIZJ(int i) {
        C012403c.LJ("onCoHostInvitedReply, status == ", i, "LiveInteractFeatureCollector");
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    return;
                }
                C20940ry.LIZ(LIZ(), "co_host_invited_reply_result", new JSONObject().putOpt("result", 2), 2, 8);
                return;
            }
            C20940ry.LIZ(LIZ(), "co_host_invited_reply_result", new JSONObject().putOpt("result", 0), 2, 8);
            return;
        }
        C20940ry.LIZ(LIZ(), "co_host_invited_reply_result", new JSONObject().putOpt("result", 1), 2, 8);
    }

    public static void LIZLLL(boolean z) {
        C10S.LIZ("onMatchReply, accepted == ", z, "LiveInteractFeatureCollector");
        if (z) {
            C20940ry.LIZ(LIZ(), "match_invited_reply_result", new JSONObject().putOpt("result", 1), 2, 8);
        } else {
            C20940ry.LIZ(LIZ(), "match_invited_reply_result", new JSONObject().putOpt("result", 0), 2, 8);
        }
    }

    public static void LJ(boolean z) {
        C10S.LIZ("onProposeMatch, isTwoMatch == ", z, "LiveInteractFeatureCollector");
        if (z) {
            LIZJ++;
        } else {
            LIZLLL++;
        }
        C20940ry.LIZ(LIZ(), "match_invite_during_co_host_result", new JSONObject().putOpt("proposed_two_match_times", Integer.valueOf(LIZJ)).putOpt("proposed_multi_match_times", Integer.valueOf(LIZLLL)), 2, 8);
    }
}

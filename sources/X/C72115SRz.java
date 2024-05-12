package X;

import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;

/* renamed from: X.SRz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72115SRz {
    public static ThirdMusicCoverItem LIZ;

    public static void LIZIZ(String str) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("message", str);
        C09900aA.LJ("third_music_json_parse_error", c198517qh.LJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.widget.TextView r4, com.ss.android.ugc.aweme.music.model.Music r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L3d
            java.util.List r1 = r5.getExternalMusicInfos()
        L7:
            boolean r0 = X.C79004UzY.LJJIFFI(r1)
            r3 = 0
            if (r0 == 0) goto L23
        Le:
            r2 = 0
        Lf:
            if (r4 != 0) goto L12
        L11:
            return
        L12:
            if (r2 <= 0) goto L21
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r0 = X.C17N.LJIILL(r0)
        L1a:
            r4.setCompoundDrawablePadding(r0)
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r2, r3)
            goto L11
        L21:
            r0 = 0
            goto L1a
        L23:
            if (r1 == 0) goto L31
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r3)
            com.ss.android.ugc.aweme.music.model.ExternalMusicInfo r0 = (com.ss.android.ugc.aweme.music.model.ExternalMusicInfo) r0
            if (r0 == 0) goto L31
            java.lang.String r2 = r0.getPartnerName()
        L31:
            java.lang.String r0 = "awa"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto Le
            r2 = 2131234303(0x7f080dff, float:1.8084768E38)
            goto Lf
        L3d:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72115SRz.LIZ(android.widget.TextView, com.ss.android.ugc.aweme.music.model.Music):void");
    }
}

package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.text.style.ReplacementSpan;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.84r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054984r {
    public static final float LJ() {
        if (((Number) C52689Km5.LIZ.getValue()).intValue() != 0) {
            return C32151Nz.LJIIZILJ(13);
        }
        if (C87026YDm.LIZJ()) {
            return C32151Nz.LJIIZILJ(15);
        }
        return C32151Nz.LJIIZILJ(Float.valueOf(13.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1 == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C2054684o r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            boolean r0 = r7.isPhotoMode()
            if (r0 != 0) goto L7
            return
        L7:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r7.getPhotoModeImageInfo()
            r5 = 0
            if (r0 == 0) goto L8b
            boolean r1 = r0.isTitleTruncated()
            r0 = 1
            if (r1 != r0) goto L8b
        L15:
            r3 = 0
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r7.getPhotoModeImageInfo()
            if (r0 == 0) goto L89
            java.lang.String r2 = r0.getTruncatedTitle()
        L22:
            boolean r0 = X.C78685UuP.LJJJZ(r2)
            if (r0 == 0) goto L7b
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r7.setPhotoModeTitleLine(r0)
            java.lang.String r0 = r7.getDesc()
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            r1 = 10
            if (r0 == 0) goto L40
            java.lang.String r2 = X.C42398GkU.LIZIZ(r2, r1)
        L40:
            X.850 r4 = new X.850
            X.853 r0 = X.AnonymousClass853.PURE
            r4.<init>(r2, r3, r0, r1)
            boolean r0 = X.C86T.LIZ()
            if (r0 == 0) goto L72
            android.content.Context r3 = X.EF7.LIZIZ()
            java.util.List<java.lang.Object> r2 = r4.LIZIZ
            X.T5U r1 = new X.T5U
            r0 = 23
            r1.<init>(r0, r5)
            r2.add(r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r0 = 2130968641(0x7f040041, float:1.7545941E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r3)
            if (r0 == 0) goto L7c
            int r0 = r0.intValue()
        L6c:
            r1.<init>(r0)
            r2.add(r1)
        L72:
            kotlin.jvm.internal.AqS153S0100000_3 r1 = new kotlin.jvm.internal.AqS153S0100000_3
            r0 = 1
            r1.<init>(r4, r7, r0)
            r6.LIZ(r1)
        L7b:
            return
        L7c:
            r0 = -1
            goto L6c
        L7e:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r7.getPhotoModeImageInfo()
            if (r0 == 0) goto L89
            java.lang.String r2 = r0.getTitle()
            goto L22
        L89:
            r2 = r3
            goto L22
        L8b:
            r0 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2054984r.LIZIZ(X.84o, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static final void LIZ(C2054684o c2054684o, String str, TuxTextLayoutView tuxTextLayoutView) {
        AqS57S1100000_3 aqS57S1100000_3 = new AqS57S1100000_3(tuxTextLayoutView, str, 0);
        List<AnonymousClass850> list = c2054684o.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<AnonymousClass850> it = list.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL((Iterable) aqS57S1100000_3.invoke(it.next()), arrayList);
        }
        c2054684o.LIZ = arrayList;
    }

    public static final C2054684o LIZJ(C2054684o c2054684o, Context context, Aweme aweme, VideoItemParams videoItemParams) {
        PlayListInfo playListInfo;
        o.LJIIIZ(context, "context");
        PlayListInfo playListInfo2 = aweme.playlist_info;
        BaseFeedPageParams baseFeedPageParams = null;
        if (playListInfo2 != null && playListInfo2.getMixId() != null && (playListInfo = aweme.playlist_info) != null && playListInfo.getIndex() != null) {
            if (videoItemParams != null) {
                baseFeedPageParams = videoItemParams.baseFeedPageParams;
            }
            if (C8P4.LIZ(aweme, baseFeedPageParams)) {
                AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(context, aweme, 1);
                List<AnonymousClass850> LLJILJILJ = ORZ.LLJILJILJ(c2054684o.LIZ);
                ((ArrayList) LLJILJILJ).addAll(0, (Collection) aqS150S0200000_3.invoke());
                c2054684o.LIZ = LLJILJILJ;
                return c2054684o;
            }
        }
        return c2054684o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ReplacementSpan LIZLLL(Context context, float f, TextExtraStruct textExtraStruct, String plainText, boolean z) {
        boolean z2;
        boolean z3;
        int LJIIIIZZ;
        boolean z4;
        float f2;
        C8F5 c8f5;
        boolean z5;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(plainText, "plainText");
        C62822Ol8 c62822Ol8 = C2058085w.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = 4;
        if (z2 && !z) {
            C8F4 c8f4 = new C8F4(context, f, AnonymousClass636.LJIIIIZZ(R.attr.dl, context), textExtraStruct);
            float LJIIZILJ = C32151Nz.LJIIZILJ(Double.valueOf(0.75d));
            float LJIIZILJ2 = C32151Nz.LJIIZILJ(4);
            if (c8f4.LJZI == LJIIZILJ) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                c8f4.LJLLLLLL.reset();
                c8f4.LJLLLLLL.addCircle(0.0f, 0.0f, LJIIZILJ, Path.Direction.CW);
                c8f4.LJZI = LJIIZILJ;
            }
            if (c8f4.LJZL != LJIIZILJ2) {
                c8f4.LJZL = LJIIZILJ2;
            }
            c8f4.LJZ = new PathDashPathEffect(c8f4.LJLLLLLL, c8f4.LJZL, 0.0f, PathDashPathEffect.Style.ROTATE);
            c8f4.LJLJLLL = C32151Nz.LJIIZILJ(8);
            c8f4.LJLJL = LJ();
            c8f4.LJLJLJ = C2055284u.LIZ(false);
            c8f4.LLD = true;
            c8f4.LJLLI = plainText;
            c8f5 = c8f4;
        } else {
            if (((Number) c62822Ol8.getValue()).intValue() == 1 && !z) {
                z3 = true;
            } else {
                z3 = false;
            }
            float LJJIIZ = O6R.LJJIIZ(f);
            int i2 = R.attr.da;
            if (z3) {
                LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.da, context);
            } else if (C87026YDm.LIZJ()) {
                LJIIIIZZ = 0;
            } else {
                if (((Boolean) C87026YDm.LIZIZ.getValue()).booleanValue()) {
                    i2 = R.attr.d1;
                }
                LJIIIIZZ = AnonymousClass636.LJIIIIZZ(i2, context);
            }
            if (C87026YDm.LIZJ() || z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            C8F5 c8f52 = r7;
            C8F5 c8f53 = new C8F5(context, LJJIIZ, LJIIIIZZ, -1, textExtraStruct, false, true, z4, z3, 32);
            c8f53.LJLLL = true;
            if (C87026YDm.LIZJ() || z3) {
                f2 = 8.0f;
            } else {
                f2 = 12.0f;
            }
            c8f52.LJLLI = KL2.LIZJ(context, f2);
            if (!z3) {
                i = 2;
            }
            c8f52.LJLLILLLL = C32151Nz.LJIIZILJ(Integer.valueOf(i));
            c8f52.LJLJLLL = LJ();
            c8f52.LJLL = C2055284u.LIZ(z);
            c8f52.LLF = true;
            c8f52.LLD = plainText;
            c8f5 = c8f52;
            if (z3) {
                c8f52.LLFF = C32151Nz.LJIIZILJ(13);
                c8f5 = c8f52;
            }
        }
        return c8f5;
    }

    public static final void LJFF(C2054684o c2054684o, Context context, int i, float f, Aweme aweme, String str) {
        o.LJIIIZ(context, "context");
        c2054684o.LJ(new C2054884q(aweme, i, context, f, str));
    }
}

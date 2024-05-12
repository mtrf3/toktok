package X;

import Y.ACListenerS27S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gds, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41988Gds implements InterfaceC45242HpG {
    public final Activity LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public List<? extends MediaModel> LIZLLL;
    public ShortVideoContext LJ;
    public ProgressDialog LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public volatile C5W8 LJIIIZ;
    public volatile XKQ LJIIJ;
    public CreativeInfo LJFF = new CreativeInfo(null, 0, null, 7, null);
    public final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 492));
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 491));

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
        ProgressDialog LIZJ;
        Activity activity = this.LIZ;
        if (activity != null && !activity.isFinishing()) {
            ProgressDialog progressDialog = this.LJI;
            if (progressDialog != null && progressDialog.isShowing()) {
                return;
            }
            if (((Boolean) this.LJIIL.getValue()).booleanValue()) {
                Activity activity2 = this.LIZ;
                LIZJ = ProgressDialogC173696rl.LIZIZ(activity2, activity2.getString(R.string.rjz));
                ACListenerS27S0100000_7 aCListenerS27S0100000_7 = new ACListenerS27S0100000_7(this, 92);
                TuxIconView tuxIconView = (TuxIconView) LIZJ.findViewById(R.id.eay);
                if (tuxIconView != null) {
                    C16880lQ.LJJJ(tuxIconView, aCListenerS27S0100000_7);
                }
                ((Handler) this.LJIIJJI.getValue()).postDelayed(new ARunnableS43S0100000_7(LIZJ, 105), 5000L);
                LJI(0);
            } else {
                Activity activity3 = this.LIZ;
                LIZJ = ProgressDialogC173686rk.LIZJ(activity3, activity3.getString(R.string.rjz));
                LIZJ.setIndeterminate(true);
            }
            this.LJI = LIZJ;
            C42303Gix.LIZ(1010, GGO.SHOW, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_VISIBLE_5S, null);
        }
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
        ProgressDialog progressDialog = this.LJI;
        if (progressDialog != null) {
            Boolean valueOf = Boolean.valueOf(progressDialog.isShowing());
            o.LJI(valueOf);
            if (valueOf.booleanValue()) {
                ProgressDialog progressDialog2 = this.LJI;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                }
                C42303Gix.LIZ(1010, GGO.DISMISS, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_VISIBLE_5S, null);
            }
        }
    }

    public final void LJI(int i) {
        if (!((Boolean) this.LJIIL.getValue()).booleanValue()) {
            return;
        }
        C43045Guv.LIZLLL(new AqS107S0101000_7(this, i, 6), 0L);
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        boolean z;
        String str;
        boolean z2;
        o.LJIIIZ(data, "data");
        if (i != 2) {
            return;
        }
        if (data.getIntExtra("key_choose_scene", -1) == 13) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = z;
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            return;
        }
        this.LIZLLL = parcelableArrayListExtra;
        if (data.hasExtra("creation_id")) {
            this.LJFF = C77412UZs.LJIJI(data);
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) data.getParcelableExtra("key_short_video_context");
        this.LJ = shortVideoContext;
        if (shortVideoContext != null) {
            CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "it.creativeInfo");
            this.LJFF = creativeInfo;
        }
        List<? extends MediaModel> list = this.LIZLLL;
        if (list != null) {
            OSJ LIZ = C41994Gdy.LIZ(this.LIZ, list, this.LIZIZ, this.LIZJ);
            boolean booleanValue = ((Boolean) LIZ.getFirst()).booleanValue();
            int intValue = ((Number) LIZ.getSecond()).intValue();
            long longValue = ((Number) LIZ.getThird()).longValue();
            if (!booleanValue) {
                return;
            }
            ShortVideoContext shortVideoContext2 = this.LJ;
            String str2 = "video";
            if (list.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            int size = list.size() - intValue;
            String LJJJJJ = C78977Uz7.LJJJJJ(intValue, list.size() - intValue);
            if (list.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            H9N h9n = new H9N(shortVideoContext2, str2, str, intValue, size, LJJJJJ, z2, C173606rc.LIZ(list), C79081V1x.LJIIZILJ(list));
            int i2 = (int) longValue;
            h9n.LIZ.LIZ(i2, "duration_ms");
            h9n.LIZ.LIZ(i2, "creation_duration");
            h9n.LIZ.LIZ(1, "is_add_more");
            h9n.LIZIZ(this.LJ);
            h9n.LIZ();
            this.LJIIIIZZ = 0;
            XKQ xkq = this.LJIIJ;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LJIIJ = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C41952GdI(this, list, null), 3);
            return;
        }
        o.LJIJI("selectedMediaData");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable, X.5W8] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0090 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r18, X.InterfaceC67352kd<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41988Gds.LJ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r3
      0x0024: PHI (r3v4 java.lang.Object) = (r3v3 java.lang.Object), (r3v0 java.lang.Object) binds: [B:20:0x00b3, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r9, X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C41987Gdr
            if (r0 == 0) goto Lcc
            r2 = r10
            X.Gdr r2 = (X.C41987Gdr) r2
            int r3 = r2.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lcc
            int r3 = r3 - r1
            r2.LJLJJL = r3
        L12:
            java.lang.Object r3 = r2.LJLJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r2.LJLJJL
            r5 = 0
            r7 = 1
            r4 = 2
            if (r0 == 0) goto L2f
            if (r0 == r7) goto L25
            if (r0 != r4) goto Ld3
            X.C141335gf.LIZJ(r3)
        L24:
            return r3
        L25:
            java.lang.Object r9 = r2.LJLILLLLZI
            java.util.List r9 = (java.util.List) r9
            X.Gds r1 = r2.LJLIL
            X.C141335gf.LIZJ(r3)
            goto L81
        L2f:
            X.C141335gf.LIZJ(r3)
            X.Gw5 r0 = X.C43117Gw5.LIZ
            r0.getClass()
            boolean r0 = X.C45771Hxn.LIZIZ
            if (r0 == 0) goto L45
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L4d
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L4d
        L45:
            r0 = 10
            r8.LJI(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L4d:
            java.util.Iterator r3 = r9.iterator()
        L51:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            X.Gw5 r1 = X.C43117Gw5.LIZ
            java.lang.String r0 = r0.fileLocalUriPath
            r1.getClass()
            boolean r0 = X.C43117Gw5.LJIIIZ(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L51
            X.XIF r1 = X.EXT.LIZ
            X.GdM r0 = new X.GdM
            r0.<init>(r8, r5)
            r2.LJLIL = r8
            r2.LJLILLLLZI = r9
            r2.LJLJJL = r7
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r2)
            if (r0 != r6) goto L80
            return r6
        L80:
            r1 = r8
        L81:
            r2.LJLIL = r1
            r2.LJLILLLLZI = r9
            r2.LJLJJL = r4
            X.XKg r4 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r2)
            r4.<init>(r0)
            X.Gw5 r0 = X.C43117Gw5.LIZ
            com.ss.android.ugc.aweme.creative.CreativeInfo r2 = r1.LJFF
            X.Gdu r3 = new X.Gdu
            r3.<init>(r1, r4)
            r0.getClass()
            java.lang.String r0 = "creativeInfo"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "mediaModelList"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            boolean r0 = X.C77413UZt.LJIILL(r9)
            if (r0 == 0) goto Lb6
            r3.LIZ()
        Laf:
            java.lang.Object r3 = r4.LIZ()
            if (r3 != r6) goto L24
            return r6
        Lb6:
            Y.ACallableS84S0200000_7 r1 = new Y.ACallableS84S0200000_7
            r0 = 0
            r1.<init>(r2, r9, r0)
            X.10K r2 = X.C10K.LIZJ(r1)
            Y.AgS124S0100000_7 r1 = new Y.AgS124S0100000_7
            r0 = 0
            r1.<init>(r3, r0)
            X.10C r0 = X.C10K.LJIIIIZZ
            r2.LJ(r1, r0, r5)
            goto Laf
        Lcc:
            X.Gdr r2 = new X.Gdr
            r2.<init>(r8, r10)
            goto L12
        Ld3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41988Gds.LJFF(java.util.List, X.2kd):java.lang.Object");
    }

    public C41988Gds(Activity activity, long j, long j2) {
        this.LIZ = activity;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}

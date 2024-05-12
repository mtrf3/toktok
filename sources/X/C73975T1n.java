package X;

import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectListApiResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.T1n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73975T1n implements InterfaceC60553Npd, InterfaceC42346Gje, InterfaceC48038ItG, OV6 {
    public static final C73975T1n LJLIL = new C73975T1n();

    @Override // X.OV6
    public void LIZ(MusicModel musicModel, String musicFile) {
        o.LJIIIZ(musicFile, "musicFile");
    }

    @Override // X.OV6
    public void LIZJ() {
    }

    @Override // X.OV6
    public void LIZLLL() {
    }

    @Override // X.InterfaceC42346Gje
    public void LJ(Bitmap bitmap) {
    }

    @Override // X.OV6
    public void LJFF(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
    }

    @Override // X.InterfaceC60553Npd
    public void LIZIZ(JSONObject jSONObject) {
        InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIJ(jSONObject);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        boolean z;
        SoundEffectListApiResponse it = (SoundEffectListApiResponse) obj;
        o.LJIIIZ(it, "it");
        ArrayList<SoundEffect> arrayList = it.list;
        if (arrayList != null) {
            Iterator<SoundEffect> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                SoundEffect next = it2.next();
                String LJIIJJI = C78934UyQ.LJLIL.getMusicService().LJIIJJI(C141315gd.LIZ(next));
                o.LJIIIZ(LJIIJJI, "<set-?>");
                next.fileLocalPath = LJIIJJI;
                if (C78685UuP.LJJJZ(LJIIJJI) && TEVideoUtils.nativeCheckAudioFile(next.fileLocalPath) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                next.isLocalFileExist = z;
            }
        }
        return it;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r2 = ((java.util.concurrent.atomic.AtomicInteger) r12.LJLIL).addAndGet(-r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r2 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(X.InterfaceC73767SxH r9, X.InterfaceC116954iR r10, X.InterfaceC92693kP r11, X.AbstractC73936T0a r12) {
        /*
            r2 = 1
        L1:
            r8 = r12
            boolean r3 = r8.LJLJJL
            r6 = r9
            boolean r4 = r6.isEmpty()
            r5 = r10
            r7 = r11
            boolean r0 = LJI(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L12
            return
        L12:
            boolean r3 = r8.LJLJJL
            java.lang.Object r1 = r6.poll()
            if (r1 != 0) goto L34
            r4 = 1
        L1b:
            boolean r0 = LJI(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L22
            return
        L22:
            if (r4 == 0) goto L30
            int r1 = -r2
            java.lang.Object r0 = r8.LJLIL
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r2 = r0.addAndGet(r1)
            if (r2 != 0) goto L1
            return
        L30:
            r8.LIZLLL(r5, r1)
            goto L12
        L34:
            r4 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73975T1n.LJII(X.SxH, X.4iR, X.3kP, X.T0a):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        if (r3 == X.C24500xi.LIZIZ) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIIIIZZ(java.lang.Object[] r6, X.C1HY r7, X.InterfaceC65784Pro r8, X.InterfaceC24520xk r9, int r10) {
        /*
            java.lang.String r0 = "inputs"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "init"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r0 = 441892779(0x1a56bfab, float:4.440899E-23)
            r9.LJJIIJ(r0)
            r0 = r10 & 2
            if (r0 == 0) goto L1b
            X.1HY r7 = X.C0MJ.LIZ
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>"
            kotlin.jvm.internal.o.LJII(r7, r0)
        L1b:
            r0 = 1059366469(0x3f24a645, float:0.6431621)
            r9.LJJIIJ(r0)
            int r1 = r9.LJJIJ()
            r0 = 36
            X.C17N.LJIIJ(r0)
            java.lang.String r5 = java.lang.Integer.toString(r1, r0)
            java.lang.String r0 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            r9.LJJIJIIJIL()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"
            kotlin.jvm.internal.o.LJII(r7, r0)
            X.1o7 r0 = X.C0MH.LIZ
            java.lang.Object r4 = r9.LJIILLIIL(r0)
            X.0MG r4 = (X.C0MG) r4
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            r0 = -568225417(0xffffffffde219177, float:-2.9105543E18)
            r9.LJJIIJ(r0)
            int r3 = r6.length
            r2 = 0
            r1 = 0
        L51:
            if (r2 >= r3) goto L5d
            r0 = r6[r2]
            boolean r0 = r9.LJIJJ(r0)
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L51
        L5d:
            java.lang.Object r3 = r9.LJIILL()
            if (r1 != 0) goto L6c
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r3 != r0) goto L83
        L6c:
            if (r4 == 0) goto L7c
            java.lang.Object r1 = r4.LJFF(r5)
            if (r1 == 0) goto L7c
            X.Yns<java.lang.Object, java.lang.Object> r0 = r7.LIZIZ
            java.lang.Object r3 = r0.invoke(r1)
            if (r3 != 0) goto L80
        L7c:
            java.lang.Object r3 = r8.invoke()
        L80:
            r9.LJJIII(r3)
        L83:
            r9.LJJIJIIJIL()
            if (r4 == 0) goto L98
            X.1ar r2 = X.C78966Uyw.LJJJJIZL(r7, r9)
            X.1ar r1 = X.C78966Uyw.LJJJJIZL(r3, r9)
            X.1u0 r0 = new X.1u0
            r0.<init>(r4, r5, r2, r1)
            X.C24610xt.LIZ(r4, r5, r0, r9)
        L98:
            r9.LJJIJIIJIL()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73975T1n.LJIIIIZZ(java.lang.Object[], X.1HY, X.Pro, X.0xk, int):java.lang.Object");
    }

    public static boolean LJI(boolean z, boolean z2, InterfaceC116954iR interfaceC116954iR, InterfaceC73570Su6 interfaceC73570Su6, InterfaceC92693kP interfaceC92693kP, AbstractC73936T0a abstractC73936T0a) {
        if (abstractC73936T0a.LJLJJI) {
            interfaceC73570Su6.clear();
            interfaceC92693kP.dispose();
            return true;
        }
        if (z && z2) {
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            interfaceC116954iR.onComplete();
            return true;
        }
        return false;
    }
}

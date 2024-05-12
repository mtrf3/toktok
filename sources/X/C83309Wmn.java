package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import djb.IDaS27S0000000_14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Wmn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83309Wmn {
    public static final C41435GNz LIZLLL = new C41435GNz();
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C64962gm LIZJ;

    public C83309Wmn(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        this.LIZ = C221108m2.LIZIZ(new AqS157S0100000_7(owner, 731));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C83194Wkw.LJLIL);
        this.LIZIZ = LIZIZ;
        C83310Wmo c83310Wmo = (C83310Wmo) LIZIZ.getValue();
        c83310Wmo.getClass();
        c83310Wmo.LJIIIIZZ(new C83311Wmp(c83310Wmo));
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        this.LIZJ = C48841JEv.LIZ(EXT.LIZ.plus(LJIILIIL).plus(new IDaS27S0000000_14(CoroutineExceptionHandler.LJJJJIZL, 1)));
    }

    public final Object LIZIZ(List list, C41434GNy c41434GNy) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c41434GNy));
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((StickerItemModel) it.next()).stickerId;
            o.LJIIIIZZ(str, "stickerItemModel.stickerId");
            arrayList.add(str);
        }
        ((InterfaceC84498XEg) this.LIZ.getValue()).LJ(arrayList, false, null, new IFetchEffectListListener() { // from class: X.5ZO
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult e) {
                o.LJIIIZ(e, "e");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DraftBoxFragment : updateEffect , effectIdList --- : ");
                LIZ.append(arrayList);
                H7B.LIZJ(X1D.LIZIZ(LIZ));
                InterfaceC67352kd<List<Effect>> interfaceC67352kd = c84654XKg;
                Exception exception = e.getException();
                o.LJIIIIZZ(exception, "e.exception");
                C3C4 LIZ2 = C141335gf.LIZ(exception);
                C3C5.m7constructorimpl(LIZ2);
                interfaceC67352kd.resumeWith(LIZ2);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list2) {
                List<Effect> effectList = list2;
                o.LJIIIZ(effectList, "effectList");
                XKX.LIZLLL(C83309Wmn.this.LIZJ, null, null, new C67312kZ(effectList, c84654XKg, arrayList, null), 3);
            }
        });
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        r3 = ((java.util.concurrent.ConcurrentLinkedQueue) r7.LJFF).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r3.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        r1 = r3.next();
        r0 = ((X.AbstractC83312Wmq) r1).LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r0 == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r0.equals(r8) != true) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        r3 = ((java.util.concurrent.ConcurrentLinkedQueue) r7.LJI).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r3.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        r1 = r3.next();
        r0 = ((X.AbstractC83312Wmq) r1).LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (r0 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        if (r0.equals(r8) != true) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        r1 = r7.LJIIL;
        r3 = r1.LIZ(r8, r1.LIZ.LIZJ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        ((java.util.concurrent.ConcurrentLinkedQueue) r7.LJ).offer(r3);
        r7.LIZLLL = true;
        r1 = X.X1D.LIZ();
        r1.append("download enqueued, info: ");
        r1.append(r8);
        X.C83310Wmo.LJII(X.X1D.LIZIZ(r1));
        r7.LJIIIIZZ(new kotlin.jvm.internal.AqS74S0400000_14(r7, r8, r9, new kotlin.jvm.internal.AqS161S0200000_14(r7, r3, 34), 2));
        r7.LJIIIZ();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(X.C83309Wmn r12, java.util.List r13, X.C41434GNy r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83309Wmn.LIZ(X.Wmn, java.util.List, X.GNy):java.lang.Object");
    }
}

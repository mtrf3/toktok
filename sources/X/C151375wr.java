package X;

import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.utils.VeImageCacheManagerHelper$replacePathList$1", f = "VeImageCacheManagerHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151375wr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<SrcImageInfo> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C151375wr(List<SrcImageInfo> list, InterfaceC67352kd<? super C151375wr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C151375wr(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<SrcImageInfo> list = this.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (SrcImageInfo srcImageInfo : list) {
            int LIZ = C151105wQ.LIZ();
            int LIZ2 = C151105wQ.LIZ();
            if (srcImageInfo.getHeight() > srcImageInfo.getWidth()) {
                LIZ = (int) (LIZ2 * 0.5625f);
            } else {
                LIZ2 = (int) (LIZ2 * 0.5625f);
            }
            C151705xO c151705xO = new C151705xO();
            c151705xO.LIZJ = srcImageInfo.getPath();
            c151705xO.LIZIZ = LIZ2;
            c151705xO.LIZ = LIZ;
            arrayList.add(c151705xO);
        }
        C151705xO[] c151705xOArr = (C151705xO[]) arrayList.toArray(new C151705xO[0]);
        C151595xD c151595xD = C151365wq.LIZ;
        if (c151595xD != null) {
            synchronized (c151595xD) {
                c151595xD.LIZ.replacePathList(c151705xOArr);
            }
        }
        C151595xD c151595xD2 = C151365wq.LIZ;
        if (c151595xD2 != null) {
            c151595xD2.LIZ(c151705xOArr[0].LIZJ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

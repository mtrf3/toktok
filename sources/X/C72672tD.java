package X;

import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.utils.VEUtils$getWaveArray$2", f = "VEUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2tD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72672tD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super float[]>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72672tD(String str, int i, InterfaceC67352kd<? super C72672tD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72672tD(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        float[] fArr;
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(this.LJLILLLLZI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        HashMap<String, float[]> hashMap = C72682tE.LIZIZ;
        if (hashMap.get(LIZIZ) != null) {
            float[] fArr2 = hashMap.get(LIZIZ);
            o.LJI(fArr2);
            return fArr2;
        }
        VEMusicWaveBean musicWaveData = VEUtils.getMusicWaveData(this.LJLIL, 2, this.LJLILLLLZI);
        if (musicWaveData == null || (fArr = musicWaveData.getWaveBean()) == null) {
            fArr = new float[0];
        }
        hashMap.put(LIZIZ, fArr);
        return fArr;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super float[]> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

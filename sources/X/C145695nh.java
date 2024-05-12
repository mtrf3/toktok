package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.utils.ImageModeUtils$processDataForImageMode$1$4", f = "ImageModeUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145695nh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<ArrayList<MediaModel>, C76800UCe> LJLIL;
    public final /* synthetic */ ArrayList<MediaModel> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C145695nh(InterfaceC88472Yns<? super ArrayList<MediaModel>, C76800UCe> interfaceC88472Yns, ArrayList<MediaModel> arrayList, long j, InterfaceC67352kd<? super C145695nh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C145695nh(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke(this.LJLILLLLZI);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(System.currentTimeMillis() - this.LJLJI, "duration");
        c145995oB.LIZ(this.LJLILLLLZI.size(), "pic_cnt");
        java.util.Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
        C42318GjC.LIZIZ("tool_performance_edit_photo_mode_decode_duration", map);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import fjb.a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.newplayer.CutPlayerActivity$launchCompile$1", f = "CutPlayerActivity.kt", l = {LiveBroadcastUploadVideoImageHeightSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.6ol, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171836ol extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractActivityC171766oe LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171836ol(AbstractActivityC171766oe abstractActivityC171766oe, InterfaceC67352kd<? super C171836ol> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractActivityC171766oe;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C171836ol(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C68322mC LIZ = C793239k.LIZ(obj);
            new C34K();
            int i2 = 5;
            do {
                i2--;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("compile_");
                LIZ2.append((Object) new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()));
                LIZ2.append(".mp4");
                String LIZIZ = X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(C172056p7.LIZ(this.LJLILLLLZI, EnumC45262Hpa.OUTPUT));
                LIZ3.append('/');
                LIZ3.append(LIZIZ);
                LIZ.element = X1D.LIZIZ(LIZ3);
                boolean exists = new File((String) LIZ.element).exists();
                z = !exists;
                if (!exists) {
                    break;
                }
            } while (i2 > 0);
            if (z) {
                XIA xia = C78613UtF.LIZJ;
                C171826ok c171826ok = new C171826ok(this.LJLILLLLZI, LIZ, null);
                this.LJLIL = 1;
                if (XKX.LJI(xia, c171826ok, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                this.LJLILLLLZI.LLIIIZ(-1, "can not create file for compile");
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

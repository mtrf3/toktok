package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.MuteCheckHandler$handleData$2", f = "MuteCheckHandler.kt", l = {22}, m = "invokeSuspend")
/* renamed from: X.6fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166166fc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C166396fz LJLILLLLZI;
    public final /* synthetic */ C166186fe LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166166fc(C166396fz c166396fz, C166186fe c166186fe, InterfaceC67352kd<? super C166166fc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c166396fz;
        this.LJLJI = c166186fe;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166166fc(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LIZ;
        String LIZ2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C166396fz c166396fz = this.LJLILLLLZI;
            List<C166116fX> list = c166396fz.LIZLLL;
            C166186fe c166186fe = this.LJLJI;
            AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(c166396fz, 422);
            C166176fd c166176fd = C166176fd.LJLIL;
            this.LJLIL = 1;
            c166186fe.getClass();
            obj = C48841JEv.LJI(new C65372hR(list, aqS168S0100000_2, c166176fd, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ArrayList arrayList = new ArrayList();
        C166396fz c166396fz2 = this.LJLILLLLZI;
        C166186fe c166186fe2 = this.LJLJI;
        int i2 = 0;
        for (Object obj2 : (List) obj) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C166126fY c166126fY = (C166126fY) obj2;
                C166116fX c166116fX = (C166116fX) ListProtector.get(c166396fz2.LIZLLL, i2);
                if (c166116fX.LIZIZ == null) {
                    c166396fz2.LJIIJ.LJFF = true;
                } else {
                    c166396fz2.LJIIJ.LJ = true;
                }
                if (c166126fY != null && c166126fY.LIZ) {
                    arrayList.add(c166116fX);
                    C166246fk c166246fk = c166396fz2.LJIIIZ;
                    if (c166246fk != null && (LIZ2 = C166246fk.LIZ(c166116fX)) != null) {
                        c166246fk.LIZ.put(LIZ2, Boolean.TRUE);
                    }
                } else {
                    c166116fX.LJIIL = "muted_video";
                    c166116fX.LJIIJJI = -1;
                    c166186fe2.getClass();
                    c166116fX.LJIILIIL = 1;
                    C166386fy c166386fy = c166396fz2.LJIIJ;
                    c166386fy.LJI = c166116fX.LJIIJJI;
                    String str = c166116fX.LJIIL;
                    o.LJIIIZ(str, "<set-?>");
                    c166386fy.LJII = str;
                    C166246fk c166246fk2 = c166396fz2.LJIIIZ;
                    if (c166246fk2 != null && (LIZ = C166246fk.LIZ(c166116fX)) != null) {
                        c166246fk2.LIZ.put(LIZ, Boolean.FALSE);
                    }
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        this.LJLILLLLZI.LJFF = arrayList;
        return Boolean.valueOf(!arrayList.isEmpty());
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

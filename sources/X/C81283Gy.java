package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81283Gy extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC80883Fk> {
    public static final C81283Gy LJLIL = new C81283Gy();

    public C81283Gy() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3Fj] */
    @Override // X.InterfaceC65784Pro
    public final InterfaceC80883Fk invoke() {
        final C88156Yim c88156Yim = new C88156Yim(new YW2(C86443aK.LIZIZ(EF7.LIZIZ()).LJIJI()), new C40679Fxr(C39696Fi0.LJLIL));
        return new C86503aQ(new InterfaceC80883Fk(c88156Yim) { // from class: X.3Fj
            public final InterfaceC80883Fk LIZ;
            public final InterfaceC65784Pro<Boolean> LIZIZ;
            public final InterfaceC75532xp LIZJ;
            public final InterfaceC65784Pro<java.util.Map<String, String>> LIZLLL;

            public final void LJIJI() {
                if (this.LIZIZ.invoke().booleanValue()) {
                    this.LIZJ.LIZIZ("SIMPLE_USER_MAIN_THREAD", this.LIZLLL.invoke());
                }
            }

            {
                C80233Cx isMainThread = C80233Cx.INSTANCE;
                C85323Wm onEventV3 = C772831o.LIZ();
                C84373Sv data = C84373Sv.LJLIL;
                o.LJIIIZ(isMainThread, "isMainThread");
                o.LJIIIZ(onEventV3, "onEventV3");
                o.LJIIIZ(data, "data");
                this.LIZ = c88156Yim;
                this.LIZIZ = isMainThread;
                this.LIZJ = onEventV3;
                this.LIZLLL = data;
            }

            @Override // X.InterfaceC80883Fk
            public final Object LIZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                LJIJI();
                Object LIZ = this.LIZ.LIZ(interfaceC67352kd);
                if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LIZ;
                }
                return C76800UCe.LIZ;
            }

            @Override // X.InterfaceC80883Fk
            public final Object LIZIZ(InterfaceC67352kd<? super List<String>> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LIZIZ(interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LIZJ(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LIZJ(interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LIZLLL(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LIZLLL(interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final List<IMUser> LJ(String str) {
                LJIJI();
                return this.LIZ.LJ(str);
            }

            @Override // X.InterfaceC80883Fk
            public final IMUser LJII(String secUid) {
                o.LJIIIZ(secUid, "secUid");
                LJIJI();
                return this.LIZ.LJII(secUid);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIIJJI(InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJIIJJI(interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final IMUser LJIIL(String uid) {
                o.LJIIIZ(uid, "uid");
                return this.LIZ.LJIIL(uid);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIILIIL(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJIILIIL(interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIILL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJIILL(interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJFF(int i, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJFF(i, interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJI(int i, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJI(i, interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIIIIZZ(List<? extends IMUser> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                LJIJI();
                Object LJIIIIZZ = this.LIZ.LJIIIIZZ(list, interfaceC67352kd);
                if (LJIIIIZZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LJIIIIZZ;
                }
                return C76800UCe.LIZ;
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIILJJIL(String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                LJIJI();
                Object LJIILJJIL = this.LIZ.LJIILJJIL(str, interfaceC67352kd);
                if (LJIILJJIL == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LJIILJJIL;
                }
                return C76800UCe.LIZ;
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIJ(List<? extends IMUser> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                LJIJI();
                Object LJIJ = this.LIZ.LJIJ(list, interfaceC67352kd);
                if (LJIJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LJIJ;
                }
                return C76800UCe.LIZ;
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIIJ(int i, List<String> list, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJIIJ(i, list, interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIILLIIL(List<String> list, int i, int i2, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJIILLIIL(list, i, i2, interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIIZILJ(List<String> list, int i, int i2, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJIIZILJ(list, i, i2, interfaceC67352kd);
            }

            @Override // X.InterfaceC80883Fk
            public final Object LJIIIZ(List<String> list, int i, int i2, String str, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
                LJIJI();
                return this.LIZ.LJIIIZ(list, i, i2, str, interfaceC67352kd);
            }
        });
    }
}

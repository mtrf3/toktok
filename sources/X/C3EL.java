package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.share.ShareButtonFlipHelper$showMostSharedChannelIcon$1", f = "ShareButtonFlipHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3EL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3EN LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3EL(C3EN c3en, InterfaceC67352kd<? super C3EL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3en;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3EL(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC66332iz enumC66332iz;
        C66342j0 c66342j0;
        C141335gf.LIZJ(obj);
        boolean LIZIZ = C78966Uyw.LJJIJ().LIZIZ();
        List<C66342j0> LJIIIIZZ = IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIIIZZ();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            AnonymousClass804.LIZIZ = null;
            this.LJLIL.LIZ();
            return C76800UCe.LIZ;
        }
        if (LIZIZ) {
            if (LJIIIIZZ != null && (c66342j0 = (C66342j0) ListProtector.get(LJIIIIZZ, 0)) != null) {
                enumC66332iz = c66342j0.LIZ;
            } else {
                enumC66332iz = null;
            }
            if (enumC66332iz == EnumC66332iz.EXTERNAL) {
                AnonymousClass804.LIZIZ = null;
                this.LJLIL.LIZ();
            } else {
                AnonymousClass804.LIZIZ = null;
                this.LJLIL.LIZ();
            }
            return C76800UCe.LIZ;
        }
        if (LJIIIIZZ != null && !LJIIIIZZ.isEmpty()) {
            if (((C66342j0) ListProtector.get(LJIIIIZZ, 0)).LIZ == EnumC66332iz.INTERNAL) {
                ArrayList arrayList = new ArrayList();
                Iterator<C66342j0> it = LJIIIIZZ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C66342j0 next = it.next();
                    IMUser LJIIL = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIL(next.LIZIZ);
                    if (LJIIL == null || LJIIL.getUid() == null || LJIIL.isBlock() || LJIIL.getFollowStatus() != 2) {
                        arrayList.add(next.LIZIZ);
                    } else {
                        AnonymousClass804.LIZIZ = LJIIL.getUid();
                        C3EN c3en = this.LJLIL;
                        UrlModel displayAvatar = LJIIL.getDisplayAvatar();
                        o.LJIIIIZZ(displayAvatar, "imContact.displayAvatar");
                        String uid = LJIIL.getUid();
                        o.LJIIIIZZ(uid, "imContact.uid");
                        c3en.LIZIZ(uid, displayAvatar);
                        break;
                    }
                }
                if (!arrayList.isEmpty()) {
                    IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIILL(arrayList);
                }
                if (arrayList.size() == LJIIIIZZ.size()) {
                    AnonymousClass804.LIZIZ = null;
                    this.LJLIL.LIZ();
                }
            } else {
                AnonymousClass804.LIZIZ = null;
                this.LJLIL.LIZ();
            }
        } else {
            try {
                InterfaceC98123tA relationService = IMService.createIIMServicebyMonsterPlugin(false).getRelationService();
                final C3EN c3en2 = this.LJLIL;
                relationService.LJII(10, new InterfaceC80183Cs() { // from class: X.3EM
                    @Override // X.InterfaceC80183Cs
                    public final void LIZ(List<IMContact> list) {
                        ArrayList arrayList2 = (ArrayList) list;
                        Iterator it2 = arrayList2.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            int i2 = i + 1;
                            IMContact iMContact = (IMContact) it2.next();
                            if (iMContact instanceof IMUser) {
                                IMUser iMUser = (IMUser) iMContact;
                                if (iMUser.getUid() != null && iMUser.getFollowStatus() == 2 && iMUser.getDisplayAvatar() != null && !IMUser.isSelf(iMUser.getUid())) {
                                    AnonymousClass804.LIZIZ = iMUser.getUid();
                                    C3EN c3en3 = C3EN.this;
                                    UrlModel displayAvatar2 = iMUser.getDisplayAvatar();
                                    o.LJIIIIZZ(displayAvatar2, "contact.displayAvatar");
                                    String uid2 = iMUser.getUid();
                                    o.LJIIIIZZ(uid2, "contact.uid");
                                    c3en3.LIZIZ(uid2, displayAvatar2);
                                    break;
                                }
                            }
                            if (i == arrayList2.size() - 1) {
                                AnonymousClass804.LIZIZ = null;
                                C3EN.this.LIZ();
                            }
                            i = i2;
                        }
                        if (arrayList2.isEmpty()) {
                            AnonymousClass804.LIZIZ = null;
                            C3EN.this.LIZ();
                        }
                    }

                    @Override // X.InterfaceC80183Cs
                    public final void Y8(Throwable t) {
                        o.LJIIIZ(t, "t");
                        AnonymousClass804.LIZIZ = null;
                        C3EN.this.LIZ();
                    }
                }, null);
            } catch (CancellationException unused) {
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

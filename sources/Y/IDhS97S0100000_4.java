package Y;

import X.AYT;
import X.AbstractC65743Pr9;
import X.AbstractC73672Svk;
import X.C244459ib;
import X.C251629uA;
import X.C35794E3a;
import X.C76800UCe;
import X.C77404UZk;
import X.C8IC;
import X.InterfaceC238119Wd;
import X.InterfaceC48038ItG;
import X.InterfaceC86003Zc;
import X.OSZ;
import android.content.Context;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcMainActivity;
import com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.aweme.service.PaidContentPaymentServiceImpl;
import com.ss.android.ugc.feed.platform.panel.paidcontent.PaidContentPreviewComponent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class IDhS97S0100000_4 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            default:
                return null;
        }
    }

    public IDhS97S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS97S0100000_4 iDhS97S0100000_4, Object obj) {
        C244459ib it = (C244459ib) obj;
        o.LJIIIZ(it, "it");
        ((ProfileAigcMainActivity) iDhS97S0100000_4.l0).LLFII(it);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.9Vk] */
    public static final Object apply$1(IDhS97S0100000_4 iDhS97S0100000_4, Object obj) {
        AbstractC65743Pr9 it = (AbstractC65743Pr9) obj;
        o.LJIIIZ(it, "it");
        C8IC c8ic = ((ProfileEditNicknameFragment) iDhS97S0100000_4.l0).LLIIIJ;
        if (c8ic != null) {
            c8ic.setVisibility(8);
        }
        if (it.isPresent()) {
            final ProfileEditNicknameFragment profileEditNicknameFragment = (ProfileEditNicknameFragment) iDhS97S0100000_4.l0;
            Object obj2 = it.get();
            o.LJIIIIZZ(obj2, "it.get()");
            String str = (String) obj2;
            Context context = profileEditNicknameFragment.getContext();
            if (context != null) {
                ((ProfileNameSyncService) profileEditNicknameFragment.LLIIIL.getValue()).LJFF(context, str, new InterfaceC238119Wd() { // from class: X.9Vk
                    @Override // X.InterfaceC238119Wd
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC238119Wd
                    public final void LIZIZ(String nameToSync, boolean z) {
                        o.LJIIIZ(nameToSync, "nameToSync");
                        if (z) {
                            ProfileEditNicknameFragment.this.LLIIJLIL = new C237939Vl(true, false, nameToSync);
                        }
                        ProfileEditNicknameFragment.this.Ol();
                    }
                });
            }
        } else {
            ((ProfileEditNicknameFragment) iDhS97S0100000_4.l0).Vl();
        }
        return C76800UCe.LIZ;
    }

    public static final Object apply$2(IDhS97S0100000_4 iDhS97S0100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return ((PaidContentPreviewComponent) iDhS97S0100000_4.l0).LJLJJL;
    }

    public static final Object apply$3(IDhS97S0100000_4 iDhS97S0100000_4, Object obj) {
        final String it = (String) obj;
        o.LJIIIZ(it, "it");
        ((C251629uA) iDhS97S0100000_4.l0).getClass();
        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.9o0
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<Integer> interfaceC73573Su9) {
                try {
                    if (ujb.o.LJJJJ(it, ".zip", false)) {
                        int LJJLIIJ = s.LJJLIIJ(it, ".zip", 6);
                        String str = it;
                        if (str != null) {
                            String substring = str.substring(0, LJJLIIJ);
                            o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            C31817CeD.LIZ(new File(it), new File(substring));
                            interfaceC73573Su9.onNext(1);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    interfaceC73573Su9.onError(new Throwable("file Path not ended with .zip!"));
                } catch (Exception e) {
                    interfaceC73573Su9.onError(e);
                }
            }
        });
    }

    public static final Object apply$4(IDhS97S0100000_4 iDhS97S0100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return ((PaidContentPaymentServiceImpl) iDhS97S0100000_4.l0).LIZ;
    }

    public static final Object apply$5(IDhS97S0100000_4 iDhS97S0100000_4, Object obj) {
        final String it = (String) obj;
        o.LJIIIZ(it, "it");
        ((C77404UZk) iDhS97S0100000_4.l0).getClass();
        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.9o1
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<Integer> interfaceC73573Su9) {
                try {
                    if (ujb.o.LJJJJ(it, ".zip", false)) {
                        String substring = it.substring(0, s.LJJLIIJ(it, ".zip", 6));
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        C38978FRm.LIZLLL(new File(it), new File(substring));
                        interfaceC73573Su9.onNext(1);
                    } else {
                        interfaceC73573Su9.onError(new Throwable("file Path not ended with .zip!"));
                    }
                } catch (Exception e) {
                    interfaceC73573Su9.onError(e);
                }
            }
        });
    }

    public static final Object apply$6(IDhS97S0100000_4 iDhS97S0100000_4, Object obj) {
        C35794E3a it = (C35794E3a) obj;
        o.LJIIJ(it, "it");
        return new OSZ(iDhS97S0100000_4.l0, it.LIZ());
    }

    public static final Object apply$7(IDhS97S0100000_4 iDhS97S0100000_4, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        AYT ayt = (AYT) iDhS97S0100000_4.l0;
        int i = ayt.LJLIL;
        ayt.LJLIL = i + 1;
        if (i < ayt.LJLILLLLZI) {
            return AbstractC73672Svk.LJJLIIIJLJLI(ayt.LJLJI, TimeUnit.MILLISECONDS);
        }
        return AbstractC73672Svk.LJJI(throwable);
    }
}

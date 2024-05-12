package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.pkg.VideoCollectionSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7qS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198367qS extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ C68322mC<TuxSheet> LJLILLLLZI;
    public final /* synthetic */ C193627io LJLJI;
    public final /* synthetic */ VideoCollectionSharePackage LJLJJI;
    public final /* synthetic */ C68322mC<InterfaceC62486Ofi> LJLJJL;
    public final /* synthetic */ C68322mC<C62387Oe7> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198367qS(Context context, C68322mC<TuxSheet> c68322mC, C193627io c193627io, VideoCollectionSharePackage videoCollectionSharePackage, C68322mC<InterfaceC62486Ofi> c68322mC2, C68322mC<C62387Oe7> c68322mC3) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c193627io;
        this.LJLJJI = videoCollectionSharePackage;
        this.LJLJJL = c68322mC2;
        this.LJLJJLL = c68322mC3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = this.LJLIL.getString(R.string.hzi);
        o.LJIIIIZZ(string, "context.getString(R.stri…make_public_pop_up_cta_2)");
        final C68322mC<TuxSheet> c68322mC = this.LJLILLLLZI;
        final C193627io c193627io = this.LJLJI;
        final VideoCollectionSharePackage videoCollectionSharePackage = this.LJLJJI;
        final C68322mC<InterfaceC62486Ofi> c68322mC2 = this.LJLJJL;
        final Context context = this.LJLIL;
        actionGroup.LJFF(string, new InterfaceC88472Yns<ARN, C76800UCe>() { // from class: X.7qR
            @Override // X.InterfaceC88472Yns
            public final C76800UCe invoke(ARN eventArgs) {
                o.LJIIIZ(eventArgs, "eventArgs");
                TuxSheet tuxSheet = c68322mC.element;
                if (tuxSheet != null) {
                    tuxSheet.dismissAllowingStateLoss();
                }
                FMX.LJIIL("click_make_public_popup", C113554cx.LJJLIIIIJ(new OSZ("collection_id", c193627io.LIZ), new OSZ("collection_name", c193627io.LIZJ), new OSZ("public_status", "on"), new OSZ("enter_from", c193627io.LJII)));
                videoCollectionSharePackage.extras.putBoolean("need_reopen_panel", true);
                InterfaceC62486Ofi interfaceC62486Ofi = c68322mC2.element;
                if (interfaceC62486Ofi != null) {
                    interfaceC62486Ofi.LJJ(context, videoCollectionSharePackage);
                }
                return C76800UCe.LIZ;
            }
        });
        String string2 = this.LJLIL.getString(R.string.hzh);
        o.LJIIIIZZ(string2, "context.getString(R.stri…make_public_pop_up_cta_1)");
        final C68322mC<TuxSheet> c68322mC3 = this.LJLILLLLZI;
        final Context context2 = this.LJLIL;
        final C68322mC<C62387Oe7> c68322mC4 = this.LJLJJLL;
        final C193627io c193627io2 = this.LJLJI;
        actionGroup.LJII(string2, new InterfaceC88472Yns<ARN, C76800UCe>() { // from class: X.7qQ
            /* JADX WARN: Type inference failed for: r0v7, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet] */
            @Override // X.InterfaceC88472Yns
            public final C76800UCe invoke(ARN eventArgs) {
                o.LJIIIZ(eventArgs, "eventArgs");
                C68322mC<TuxSheet> c68322mC5 = c68322mC3;
                ShareDependService.LIZ.getClass();
                ShareDependService LIZ = C44498HdG.LIZ();
                Activity LJIJJ = C45804HyK.LJIJJ(context2);
                if (LJIJJ != null) {
                    C62387Oe7 c62387Oe7 = c68322mC4.element;
                    if (c62387Oe7 != null) {
                        c68322mC5.element = OQA.LIZLLL(LIZ, LJIJJ, c62387Oe7, Integer.valueOf(R.style.a6u), null, false, 24);
                        FMX.LJIIL("click_make_public_popup", C113554cx.LJJLIIIIJ(new OSZ("collection_id", c193627io2.LIZ), new OSZ("collection_name", c193627io2.LIZJ), new OSZ("public_status", "off"), new OSZ("enter_from", c193627io2.LJII)));
                        return C76800UCe.LIZ;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        return C76800UCe.LIZ;
    }
}

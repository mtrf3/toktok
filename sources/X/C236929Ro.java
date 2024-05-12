package X;

import Y.IDDListenerS144S0100000_4;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetComponent;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C236929Ro extends AbstractC65781Prl implements InterfaceC88471Ynr<C3C8, C43I<? extends EnumC236939Rp>, C76800UCe> {
    public final /* synthetic */ OfflineModeSheetComponent LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C236929Ro(OfflineModeSheetComponent offlineModeSheetComponent) {
        super(2);
        this.LJLIL = offlineModeSheetComponent;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C3C8 selectSubscribe, C43I<? extends EnumC236939Rp> c43i) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        TuxSheet tuxSheet;
        TuxSheet tuxSheet2;
        C43I<? extends EnumC236939Rp> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            C9Q1 c9q1 = this.LJLIL.v3().getState().LJLJL;
            Integer num = null;
            if (c9q1 == null) {
                OfflineModeSheetComponent.LJLJJI.LIZ(null, "sheet dismiss");
                TuxSheet tuxSheet3 = this.LJLIL.LJLILLLLZI;
                if (tuxSheet3 != null) {
                    tuxSheet3.dismiss();
                }
                this.LJLIL.LJLILLLLZI = null;
            } else {
                EnumC236939Rp LIZ = c43i2.LIZ();
                if (LIZ != null) {
                    C26222AQw c26222AQw = OfflineModeSheetComponent.LJLJJI;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("show/trans TuxSheet ");
                    LIZ2.append(c9q1);
                    c26222AQw.LIZ(null, X1D.LIZIZ(LIZ2));
                    OfflineModeSheetPageFragment offlineModeSheetPageFragment = new OfflineModeSheetPageFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("page_name", c9q1.getPageName());
                    bundle.putBoolean("with_back", c9q1.getWithBack());
                    offlineModeSheetPageFragment.setArguments(bundle);
                    TuxSheet tuxSheet4 = this.LJLIL.LJLILLLLZI;
                    boolean z = false;
                    if (tuxSheet4 == null || tuxSheet4.isDetached() || ((tuxSheet2 = this.LJLIL.LJLILLLLZI) != null && !tuxSheet2.isResumed())) {
                        OfflineModeSheetComponent offlineModeSheetComponent = this.LJLIL;
                        ASL asl = new ASL();
                        asl.LIZ.LJLLILLLL = offlineModeSheetPageFragment;
                        Context context = this.LJLIL.getContext();
                        if (context != null) {
                            num = C79045V0n.LJI(R.attr.c9, context);
                        }
                        asl.LIZ.LJLJL = num;
                        asl.LJI(4);
                        TuxSheet tuxSheet5 = asl.LIZ;
                        tuxSheet5.LJLLJ = true;
                        OfflineModeSheetComponent offlineModeSheetComponent2 = this.LJLIL;
                        tuxSheet5.LJLILLLLZI = new IDDListenerS144S0100000_4(offlineModeSheetComponent2, 5);
                        offlineModeSheetComponent.LJLILLLLZI = tuxSheet5;
                        Context context2 = offlineModeSheetComponent2.getContext();
                        if (context2 != null && (LJJIFFI = C45804HyK.LJJIFFI(context2)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (tuxSheet = this.LJLIL.LJLILLLLZI) != null) {
                            tuxSheet.show(supportFragmentManager, "offline_mode_sheet_tag");
                        }
                    } else {
                        TuxSheet tuxSheet6 = this.LJLIL.LJLILLLLZI;
                        if (tuxSheet6 != null) {
                            int LJJJJIZL = tuxSheet6.getChildFragmentManager().LJJJJIZL() + 1;
                            if (!c9q1.getWithBack() || LJJJJIZL < 2) {
                                String LJ = KMP.LJ("sheet_content_fragment", LJJJJIZL);
                                FragmentManager childFragmentManager = tuxSheet6.getChildFragmentManager();
                                C1B3 LIZ3 = C1B6.LIZ(childFragmentManager, childFragmentManager);
                                Context context3 = tuxSheet6.getContext();
                                if (context3 != null && C26338AVi.LIZJ(context3)) {
                                    z = true;
                                }
                                if (z) {
                                    LIZ3.LJIIJJI(R.anim.fm, R.anim.fp, R.anim.fn, R.anim.fo);
                                } else {
                                    LIZ3.LJIIJJI(R.anim.fn, R.anim.fo, R.anim.fm, R.anim.fp);
                                }
                                if (c9q1.getWithBack()) {
                                    LIZ3.LJIIIIZZ(R.id.jvy, 1, offlineModeSheetPageFragment, LJ);
                                    LIZ3.LJ(LJ);
                                } else {
                                    LIZ3.LJIIJ(offlineModeSheetPageFragment, LJ, R.id.jvy);
                                }
                                LIZ3.LJI();
                            }
                        }
                    }
                    C26218AQs.LIZ(c9q1.getShowEventName(), "offline_mode_page", LIZ.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388600);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}

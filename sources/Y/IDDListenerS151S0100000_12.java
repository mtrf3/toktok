package Y;

import X.C188727au;
import X.C66647QDr;
import X.ED5;
import X.FMX;
import X.ORS;
import X.SGY;
import X.SLJ;
import X.SN1;
import android.content.DialogInterface;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.PrivacySettingSheet;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingItemViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingSheet;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.page.VideoVisibilitySelectFragment;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDDListenerS151S0100000_12 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS151S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS151S0100000_12 iDDListenerS151S0100000_12, DialogInterface dialogInterface) {
        SN1 sn1;
        VM vm;
        SLJ slj = ((PrivacySettingSheet) iDDListenerS151S0100000_12.l0).LJLIL;
        if (slj != null) {
            if ((slj instanceof SN1) && (sn1 = (SN1) slj) != null && (vm = sn1.LJLL) != 0) {
                ORS.LJJZ(vm.LJLIL);
                return;
            }
            return;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public static final void onDismiss$1(IDDListenerS151S0100000_12 iDDListenerS151S0100000_12, DialogInterface dialogInterface) {
        String str;
        PermissionSettingSheet permissionSettingSheet = (PermissionSettingSheet) iDDListenerS151S0100000_12.l0;
        permissionSettingSheet.getClass();
        Integer num = permissionSettingSheet.LJLJI;
        int i = permissionSettingSheet.LJLJJL;
        PermissionSettingItemViewModel permissionSettingItemViewModel = permissionSettingSheet.LJLJJI;
        if (permissionSettingItemViewModel != null) {
            Integer value = permissionSettingItemViewModel.LJLJI.getValue();
            if (value == null) {
                value = 0;
            }
            int intValue = value.intValue();
            if (num != null) {
                if (num.intValue() == 1) {
                    str = "comment_filter_offensive_exit";
                } else if (num.intValue() == 2) {
                    str = "comment_filter_profanity_exit";
                } else if (num.intValue() == 3) {
                    str = "comment_filter_advertisements_exit";
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("original_level", C66647QDr.LIZ(i));
                c188727au.LJIIIZ("final_level", C66647QDr.LIZ(intValue));
                FMX.LJIIL(str, c188727au.LIZ);
            }
            PermissionSettingItemViewModel permissionSettingItemViewModel2 = permissionSettingSheet.LJLJJI;
            if (permissionSettingItemViewModel2 != null) {
                ORS.LJJZ(permissionSettingItemViewModel2.LJLIL);
                return;
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public static final void onDismiss$2(IDDListenerS151S0100000_12 iDDListenerS151S0100000_12, DialogInterface dialogInterface) {
        ORS.LJJZ(((VideoVisibilitySelectFragment) iDDListenerS151S0100000_12.l0).vl().LJLIL);
    }

    public static final void onDismiss$3(IDDListenerS151S0100000_12 iDDListenerS151S0100000_12, DialogInterface dialogInterface) {
        CompletionBlock completionBlock = (CompletionBlock) iDDListenerS151S0100000_12.l0;
        XBaseModel LIZJ = ED5.LIZJ(SGY.class, null);
        ((SGY) LIZJ).setClickEventParams(null);
        completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
    }

    public static final void onDismiss$4(IDDListenerS151S0100000_12 iDDListenerS151S0100000_12, DialogInterface dialogInterface) {
        ((MusicFavoriteButtonAssem) iDDListenerS151S0100000_12.l0).LJLZ = false;
    }
}

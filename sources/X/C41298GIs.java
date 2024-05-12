package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.editpost.BizExpiration;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.GIs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41298GIs implements InterfaceC62486Ofi {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final List<Integer> LJLJJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_pen;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_pen_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.fqr;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "edit_post";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        if (this.LJLJI == EnumC41101GBd.SHOW.getValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    public final void LIZJ(String str) {
        String str2;
        int i;
        int i2 = this.LJLJI;
        String str3 = "";
        if (i2 == EnumC41101GBd.GRAYED_OUT_FOR_FREQ_CONTROL.getValue()) {
            str2 = "beyond_edit_cnt";
        } else if (i2 == EnumC41101GBd.GRAYED_OUT_FOR_MODERATION.getValue()) {
            str2 = "under_review";
        } else if (i2 == EnumC41101GBd.GRAYED_OUT_FOR_TIME_EXPIRATION.getValue()) {
            str2 = "beyond_edit_days";
        } else if (i2 != EnumC41101GBd.GRAYED_OUT_FOR_IN_PROCESS.getValue()) {
            str2 = "";
        } else {
            str2 = "in_process";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        String aid = this.LJLIL.getAid();
        if (aid != null) {
            str3 = aid;
        }
        c188727au.LJIIIZ("group_id", str3);
        c188727au.LJ(((IAVPublishService) C41379GLv.LIZIZ.getValue()).passedDaysAfterPost(this.LJLIL.getCreateTime()), "after_post_days");
        c188727au.LJIIIZ("grey_reason", str2);
        if (str2.length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_grey_status");
        c188727au.LIZLLL(this.LJLIL.getAwemeType(), "aweme_type");
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        String str;
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        LIZJ("click_edit_post_show");
        if (!enable() && LJIJJ != null) {
            int i2 = this.LJLJI;
            if (i2 == EnumC41101GBd.GRAYED_OUT_FOR_FREQ_CONTROL.getValue()) {
                str = context.getString(R.string.fqg);
            } else if (i2 == EnumC41101GBd.GRAYED_OUT_FOR_MODERATION.getValue() || i2 == EnumC41101GBd.GRAYED_OUT_FOR_IN_PROCESS.getValue()) {
                str = context.getString(R.string.fqo);
            } else if (i2 == EnumC41101GBd.GRAYED_OUT_FOR_TIME_EXPIRATION.getValue()) {
                Object[] objArr = new Object[1];
                BizExpiration[] editPostBizExPiration = ((IAVPublishService) C41379GLv.LIZIZ.getValue()).getEditPostBizExPiration();
                if (editPostBizExPiration != null) {
                    ArrayList arrayList = new ArrayList();
                    for (BizExpiration bizExpiration : editPostBizExPiration) {
                        int i3 = bizExpiration.bizType;
                        EnumC41099GBb.Companion.getClass();
                        if (i3 < EnumC41099GBb.values().length && this.LJLJJI.contains(Integer.valueOf(bizExpiration.bizType))) {
                            arrayList.add(bizExpiration);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            i = ((BizExpiration) it.next()).expirationDay;
                            while (it.hasNext()) {
                                int i4 = ((BizExpiration) it.next()).expirationDay;
                                if (i < i4) {
                                    i = i4;
                                }
                            }
                            objArr[0] = Integer.valueOf(i);
                            str = context.getString(R.string.fqf, objArr);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("null gray value with gray toast; setting value: ");
                LIZ.append(((IAVPublishService) C41379GLv.LIZIZ.getValue()).getEditPostBizExPiration());
                C36922EeM.LIZLLL(6, "EditPostAction", X1D.LIZIZ(LIZ));
                i = 0;
                objArr[0] = Integer.valueOf(i);
                str = context.getString(R.string.fqf, objArr);
            } else {
                str = "";
            }
            o.LJIIIIZZ(str, "when (permission) {\n    … else -> \"\"\n            }");
            if (str.length() > 0) {
                C31811Ce7.LIZIZ(LJIJJ, str);
                return;
            }
            return;
        }
        IAVPublishService iAVPublishService = (IAVPublishService) C41379GLv.LIZIZ.getValue();
        if (LJIJJ != null) {
            iAVPublishService.startEditPostPublishPage(LJIJJ, this.LJLIL, 1996, this.LJLILLLLZI);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public C41298GIs(int i, String enterFrom, Aweme aweme) {
        ?? r2;
        List<EditPostBizPermissionStruct> bizPermission;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = i;
        EditPostPermission editPostPermission = aweme.getEditPostPermission();
        if (editPostPermission != null && (bizPermission = editPostPermission.getBizPermission()) != null) {
            ArrayList arrayList = new ArrayList();
            for (EditPostBizPermissionStruct editPostBizPermissionStruct : bizPermission) {
                if (editPostBizPermissionStruct.getBizStatus() == EnumC41101GBd.GRAYED_OUT_FOR_TIME_EXPIRATION.getValue()) {
                    arrayList.add(editPostBizPermissionStruct);
                }
            }
            r2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r2.add(Integer.valueOf(((EditPostBizPermissionStruct) it.next()).getBizType()));
            }
        } else {
            r2 = C61878OQg.INSTANCE;
        }
        this.LJLJJI = r2;
        LIZJ("edit_post_show");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}

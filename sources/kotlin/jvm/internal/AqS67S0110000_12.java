package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1810678s;
import X.C227678wd;
import X.C2U8;
import X.C32151Nz;
import X.C72207SVn;
import X.C76800UCe;
import X.C78897Uxp;
import X.EnumC42934Gt8;
import X.FRW;
import X.InterfaceC65784Pro;
import X.OUP;
import X.S09;
import X.SY4;
import X.T29;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.VideoVisibilityViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.PdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.question.QuestionDetailFragment;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class AqS67S0110000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS67S0110000_12 aqS67S0110000_12) {
        FRW.LIZ("cd_start_activity_to_request_net_duration");
        ((ChallengeDetailJediViewModel) ((ChallengeDetailFragment) aqS67S0110000_12.l0).LLIIIJ.getValue()).Hv0(((ChallengeDetailFragment) aqS67S0110000_12.l0).Hl().getCid(), ((ChallengeDetailFragment) aqS67S0110000_12.l0).Hl().getClickReason(), ((ChallengeDetailFragment) aqS67S0110000_12.l0).Hl().getPreviewToken(), ((ChallengeDetailFragment) aqS67S0110000_12.l0).Hl().isHashTag(), aqS67S0110000_12.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS67S0110000_12 aqS67S0110000_12) {
        AnchorCommonStruct anchorCommonStruct;
        String str;
        VideoVisibilityViewModel videoVisibilityViewModel = (VideoVisibilityViewModel) aqS67S0110000_12.l0;
        boolean z = aqS67S0110000_12.z1;
        videoVisibilityViewModel.getClass();
        try {
            List<AnchorCommonStruct> anchors = videoVisibilityViewModel.nv0().getAnchors();
            o.LJIIIIZZ(anchors, "aweme.anchors");
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorCommonStruct = it.next();
                    if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                        break;
                    }
                } else {
                    anchorCommonStruct = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2 != null) {
                JSONObject jSONObject = new JSONObject(anchorCommonStruct2.getExtra());
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_hide", str);
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
                anchorCommonStruct2.setExtra(jSONObject2);
            }
        } catch (Exception unused) {
        }
        ((VideoVisibilityViewModel) aqS67S0110000_12.l0).LJLL = true;
        C2U8.LIZ(new C227678wd());
        C2U8.LIZ(new C1810678s(((VideoVisibilityViewModel) aqS67S0110000_12.l0).nv0()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS67S0110000_12 aqS67S0110000_12) {
        PdpViewModel viewModel = ((PdpInfoViewHolder) aqS67S0110000_12.l0).getViewModel();
        View itemView = ((PdpInfoViewHolder) aqS67S0110000_12.l0).itemView;
        o.LJIIIIZZ(itemView, "itemView");
        viewModel.Qv0(itemView, aqS67S0110000_12.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS67S0110000_12 aqS67S0110000_12) {
        ((C72207SVn) aqS67S0110000_12.l0).LJ(aqS67S0110000_12.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS67S0110000_12 aqS67S0110000_12) {
        String id = ((QuestionDetailFragment) aqS67S0110000_12.l0).Al().getId();
        if (id != null) {
            long parseLong = CastLongProtector.parseLong(id);
            QuestionDetailFragment questionDetailFragment = (QuestionDetailFragment) aqS67S0110000_12.l0;
            ((QuestionDetailJediViewModel) questionDetailFragment.LLFFF.getValue()).Hv0(parseLong, aqS67S0110000_12.z1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS67S0110000_12 aqS67S0110000_12) {
        if (aqS67S0110000_12.z1) {
            ((T29) aqS67S0110000_12.l0).LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS67S0110000_12 aqS67S0110000_12) {
        if (aqS67S0110000_12.z1) {
            View anchor_buy_button = ((S09) aqS67S0110000_12.l0).LIZ(R.id.a1y);
            o.LJIIIIZZ(anchor_buy_button, "anchor_buy_button");
            OUP.LJJLIIIJ(anchor_buy_button);
            ((SY4) ((S09) aqS67S0110000_12.l0).LIZ(R.id.a1y)).setButtonVariant(0);
            View anchor_buy_button2 = ((S09) aqS67S0110000_12.l0).LIZ(R.id.a1y);
            o.LJIIIIZZ(anchor_buy_button2, "anchor_buy_button");
            float LJIIZILJ = C32151Nz.LJIIZILJ(4);
            Drawable background = anchor_buy_button2.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(LJIIZILJ);
                C78897Uxp.LJJJJJL(anchor_buy_button2, LJIIZILJ);
            }
        } else {
            View anchor_buy_button3 = ((S09) aqS67S0110000_12.l0).LIZ(R.id.a1y);
            o.LJIIIIZZ(anchor_buy_button3, "anchor_buy_button");
            OUP.LJIJJLI(anchor_buy_button3);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0110000_12(S09 s09, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = s09;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0110000_12(C72207SVn c72207SVn, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c72207SVn;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0110000_12(ChallengeDetailFragment challengeDetailFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = challengeDetailFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0110000_12(VideoVisibilityViewModel videoVisibilityViewModel, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoVisibilityViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0110000_12(PdpInfoViewHolder pdpInfoViewHolder, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpInfoViewHolder;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0110000_12(QuestionDetailFragment questionDetailFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = questionDetailFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0110000_12(boolean z, T29 t29, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = t29;
    }
}

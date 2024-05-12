package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.live.settings.PromoteLiveSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKQ extends AbstractC71225RxN {
    public final Context LJLJJL;
    public IIconSlot.SlotViewModel LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public final OKX LJLJLLL;
    public A72 LJLL;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "promote";
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_BROADCAST_PREVIEW_PROMOTE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKQ(Context context) {
        super(0);
        o.LJIIIZ(context, "context");
        this.LJLJJL = context;
        this.LJLJLJ = "";
        this.LJLJLLL = new OKX(new OKS(this));
    }

    public final ActivityC45651qj LJIIL(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            return LJIIL(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLJJLL = viewModel2;
        this.LJLL = slotGate;
        MutableLiveData<Boolean> mutableLiveData = viewModel2.LJLILLLLZI;
        o.LJIIIIZZ(mutableLiveData, "this.visible");
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            mutableLiveData.setValue(Boolean.TRUE);
        } else {
            mutableLiveData.postValue(Boolean.TRUE);
        }
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(this.LJLJJL, R.drawable.b95));
        viewModel2.LJLLI.setValue(this.LJLJJL.getString(R.string.phc));
        String version = this.LJLJLJ;
        o.LJIIIZ(version, "version");
        MutableLiveData<String> mutableLiveData2 = viewModel2.LJLJJLL;
        o.LJIIIIZZ(mutableLiveData2, "this.hasRedpointVersion");
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            mutableLiveData2.setValue(version);
        } else {
            mutableLiveData2.postValue(version);
        }
        boolean z = this.LJLJL;
        MutableLiveData<Boolean> mutableLiveData3 = viewModel2.LJLJJL;
        o.LJIIIIZZ(mutableLiveData3, "this.hasRedpoint");
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            mutableLiveData3.setValue(Boolean.valueOf(z));
        } else {
            mutableLiveData3.postValue(Boolean.valueOf(z));
        }
        if (C59406NTe.LJIILL()) {
            String LJFF = C59406NTe.LJFF(null, "", "before_live");
            if (NQA.LIZIZ.LIZ()) {
                android.net.Uri parse = UriProtector.parse(LJFF);
                o.LJIIIIZZ(parse, "parse(schema)");
                String builder = C78939UyV.LJJJJJ(parse, C47261Igj.LJJIJIL("enable_prefetch", "enable_pending_js_task")).buildUpon().appendQueryParameter("use_spark", "1").toString();
                o.LJIIIIZZ(builder, "tempUri.buildUpon()\n    …              .toString()");
                C59406NTe.LJIIJ(this.LJLJJL, builder);
            } else {
                android.net.Uri parse2 = UriProtector.parse(LJFF);
                o.LJIIIIZZ(parse2, "parse(schema)");
                String builder2 = C78939UyV.LJJJJJ(parse2, C47261Igj.LJJIJIL("enable_prefetch")).buildUpon().appendQueryParameter("enable_pending_js_task", "1").appendQueryParameter("enable_prefetch", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("use_spark", "1").toString();
                o.LJIIIIZZ(builder2, "tempUri.buildUpon()\n    …              .toString()");
                C59406NTe.LJIIJJI(builder2);
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", OKW.LIZJ());
        c188727au.LIZLLL(OKW.LIZ(), "promote_version");
        c188727au.LIZLLL(OKW.LIZIZ(), "user_account_type");
        c188727au.LJIIIZ("enter_from", "before_live");
        FMX.LJIIL("Promote_live_entrance_show", c188727au.LIZ);
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, ? extends Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Boolean bool;
        boolean z;
        Object obj;
        Object obj2;
        Boolean bool2;
        o.LJIIIZ(params, "params");
        Object obj3 = params.get("param_broadcast_preview_promote_bool");
        if (obj3 instanceof Boolean) {
            bool = (Boolean) obj3;
        } else {
            bool = null;
        }
        boolean z2 = false;
        if (bool != null && bool.booleanValue()) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            PromoteLiveSetting.PromoteLiveSwitch promoteLiveSwitch = PromoteLiveSetting.LIZ;
            PromoteLiveSetting.PromoteLiveSwitch promoteLiveSwitch2 = (PromoteLiveSetting.PromoteLiveSwitch) LIZLLL.LJIIIIZZ("promote_for_live_switch", PromoteLiveSetting.PromoteLiveSwitch.class, promoteLiveSwitch);
            if (promoteLiveSwitch2 != null) {
                promoteLiveSwitch = promoteLiveSwitch2;
            }
            if (promoteLiveSwitch.promoteBeforeLive) {
                z = true;
                obj = params.get("param_broadcast_preview_promote_dot_badge_bool");
                if ((obj instanceof Boolean) && (bool2 = (Boolean) obj) != null) {
                    z2 = bool2.booleanValue();
                }
                this.LJLJL = z2;
                obj2 = params.get("param_broadcast_preview_promote_dot_badge_version_string");
                if ((obj2 instanceof String) || (r1 = (String) obj2) == null) {
                    String str = "";
                }
                this.LJLJLJ = str;
                interfaceC25704A6y.LIZ(z);
            }
        }
        z = false;
        obj = params.get("param_broadcast_preview_promote_dot_badge_bool");
        if (obj instanceof Boolean) {
            z2 = bool2.booleanValue();
        }
        this.LJLJL = z2;
        obj2 = params.get("param_broadcast_preview_promote_dot_badge_version_string");
        if (obj2 instanceof String) {
        }
        String str2 = "";
        this.LJLJLJ = str2;
        interfaceC25704A6y.LIZ(z);
    }
}

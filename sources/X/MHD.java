package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MHD extends AbstractC225718tT {
    public final MGV LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;
    public NewFaceStickerBean faceStickerBean;

    @Override // X.AbstractC225718tT, X.MGV
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C220408ku.LIZ(this, str);
    }

    public MHD(MGV singleDelegate) {
        o.LJIIIZ(singleDelegate, "singleDelegate");
        this.LJLIL = singleDelegate;
        this.LJLILLLLZI = "tool_performance_prop_detail_pre_load_item_view_count";
        this.LJLJI = true;
    }

    public final void setFaceStickerBean(NewFaceStickerBean facestickerbean) {
        o.LJIIIZ(facestickerbean, "facestickerbean");
        this.faceStickerBean = facestickerbean;
    }

    @Override // X.AbstractC225718tT
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        if (aweme instanceof MHU) {
            return 110002;
        }
        if (aweme instanceof YW0) {
            return 110004;
        }
        return super.getDetailAwemeViewType(i, aweme);
    }

    @Override // X.AbstractC225718tT, X.MGV
    public MGX getJumpToVideoParam(MGX mgx, Aweme aweme) {
        MGX jumpToVideoParam = this.LJLIL.getJumpToVideoParam(mgx, aweme);
        o.LJIIIIZZ(jumpToVideoParam, "singleDelegate.getJumpToVideoParam(param, aweme)");
        return jumpToVideoParam;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i, ActivityC45651qj activityC45651qj) {
        C51031K1b<? extends AbstractC51036K1g<?, ?>> presenter = this.LJLIL.getPresenter(i, activityC45651qj);
        o.LJIIIIZZ(presenter, "singleDelegate.getPresenter(type, activity)");
        return presenter;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
        return this.LJLIL.sendCustomRequest(c51031K1b, i);
    }

    @Override // X.AbstractC225718tT
    public AbstractC208678Gx onCreateDetailAwemeViewHolder(ViewGroup parent, int i, String eventLabel, MH9 awemeClickListener) {
        View LIZ;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(eventLabel, "eventLabel");
        o.LJIIIZ(awemeClickListener, "awemeClickListener");
        if (i == 110002) {
            return new MHE(C1FL.LIZIZ(parent, R.layout.ako, parent, false, "from(parent.context)\n   …ail_aweme, parent, false)"), eventLabel, awemeClickListener);
        }
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (FV9.LIZJ && LJIJJ != null) {
            if (this.LJLJI) {
                int LIZIZ = C39057FUn.LIZIZ(LJIJJ, "Prop_Sticker_detail_base_item_detail_aweme");
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("type", this.LJLILLLLZI);
                c145995oB.LIZ(0, "totaltime");
                c145995oB.LIZ(LIZIZ, "totalstep");
                FMX.LJIIL("tool_performance_operation_cost_time", c145995oB.LIZ);
                this.LJLJI = false;
            }
            LIZ = C39057FUn.LIZJ(LJIJJ, "Prop_Sticker_detail_base_item_detail_aweme", new AqS159S0100000_9(parent, 973));
        } else {
            LIZ = C28289B8j.LIZ(parent, R.layout.ako, parent, false);
        }
        return new MH8(LIZ, eventLabel, awemeClickListener, new MHH(this));
    }
}

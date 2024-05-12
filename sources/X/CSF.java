package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenAvatarHiddenSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreNameMaxLengthSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreUserNameColorSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceIntervalSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDebugEnabledSetting;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import uw.s;

/* loaded from: classes6.dex */
public abstract class CSF<MODEL extends s> extends RecyclerView.ViewHolder {
    public final C2G0 LJLIL;
    public CQQ LJLILLLLZI;
    public MODEL LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;

    public abstract void L(CQQ cqq, MODEL model);

    public void LJJJJIZL() {
    }

    public void onViewAttachedToWindow() {
        MODEL model = this.LJLJI;
        if (model != null) {
            model.onAttach();
        }
    }

    public void onViewDetachedFromWindow() {
        MODEL model = this.LJLJI;
        if (model != null) {
            model.LJII(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSF(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = (C2G0) itemView.findViewById(R.id.ff3);
        this.LJLJJI = LivePublicScreenAvatarHiddenSetting.getValue() == 1;
        this.LJLJJL = LivePublicScreenSpaceExploreSetting.INSTANCE.optEnable();
        this.LJLJJLL = LivePublicScreenSpaceIntervalSetting.getInterval();
        this.LJLJL = LivePublicScreenSpaceExploreUserNameColorSetting.INSTANCE.getNameColor();
        this.LJLJLJ = LivePublicScreenSpaceExploreNameMaxLengthSetting.INSTANCE.getNameMaxLength();
    }

    public void M(CQQ cqq, MODEL model, List<Object> payloads) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(payloads, "payloads");
        this.LJLILLLLZI = cqq;
        this.LJLJI = model;
        L(cqq, model);
        if (LivePublicScreenDebugEnabledSetting.INSTANCE.getValue()) {
            C2G0 c2g0 = this.LJLIL;
            if (c2g0 != null) {
                c2g0.setText(String.valueOf(getAdapterPosition()));
            }
            C2G0 c2g02 = this.LJLIL;
            if (c2g02 == null) {
                return;
            }
            c2g02.setVisibility(0);
        }
    }
}

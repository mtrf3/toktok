package com.bytedance.android.livesdk.broadcast.preview.widget.livevoice;

import X.AbstractC029409q;
import X.B83;
import X.C0NB;
import X.C221108m2;
import X.C28323B9r;
import X.C29306Beo;
import X.C29374Bfu;
import X.C62822Ol8;
import X.OSZ;
import X.X1D;
import Y.IDLListenerS193S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class PreviewLiveVoiceMicListWidget extends PreviewWidget {
    public RecyclerView LJLJI;
    public LiveMode LJLJL;
    public OSZ<Integer, Integer> LJLJJI = new OSZ<>(0, 0);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, UserLevelGeckoUpdateSetting.DEFAULT));
    public final List<C28323B9r> LJLJJLL = new ArrayList();
    public OSZ<Integer, Integer> LJLJLJ = new OSZ<>(0, 0);
    public final IDLListenerS193S0100000_5 LJLJLLL = new IDLListenerS193S0100000_5(this, 1);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq9;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final List<C28323B9r> LL() {
        if (((ArrayList) this.LJLJJLL).size() > 0) {
            return this.LJLJJLL;
        }
        ((ArrayList) this.LJLJJLL).add(new C28323B9r(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb()));
        int i = 0;
        do {
            ((ArrayList) this.LJLJJLL).add(new C28323B9r(null));
            i++;
        } while (i < 8);
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        ViewTreeObserver viewTreeObserver;
        super.LJZL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, LiveModeChannel.class, new AqS171S0100000_5(this, 209));
        }
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.LJLJLLL);
        }
        RecyclerView recyclerView = (RecyclerView) getView();
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new GridLayoutManager() { // from class: com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget$onWidgetCreated$2$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final boolean LJIL() {
                    return false;
                }
            });
        } else {
            recyclerView = null;
        }
        this.LJLJI = recyclerView;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        ViewTreeObserver viewTreeObserver;
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJLJLLL);
        }
        super.onDetachWidget();
    }

    public final void LLF(LiveMode liveMode) {
        boolean z;
        RecyclerView recyclerView;
        Integer first;
        if (liveMode == null) {
            return;
        }
        RecyclerView recyclerView2 = this.LJLJI;
        if (liveMode == LiveMode.LIVE_VOICE) {
            z = true;
        } else {
            z = false;
        }
        C29306Beo.LJJLIIIJJI(recyclerView2, z);
        RecyclerView recyclerView3 = this.LJLJI;
        if (recyclerView3 != null && C29306Beo.LJJIIJ(recyclerView3) && (recyclerView = this.LJLJI) != null && (first = this.LJLJLJ.getFirst()) != null) {
            int intValue = first.intValue();
            Integer second = this.LJLJLJ.getSecond();
            if (second != null) {
                int intValue2 = second.intValue();
                if (intValue == 0 || intValue2 == 0) {
                    C0NB.LIZIZ("voice_chat", "updateList return size don't measure yet");
                    return;
                }
                this.LJLJJI = new OSZ<>(Integer.valueOf(intValue / 3), Integer.valueOf(intValue2 / 3));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateList recyclerViewSize :");
                LIZ.append(this.LJLJLJ);
                LIZ.append(" size:");
                LIZ.append(this.LJLJJI);
                C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.width = intValue;
                layoutParams.height = intValue2;
                recyclerView.setLayoutParams(layoutParams);
                recyclerView.setAdapter((AbstractC029409q) this.LJLJJL.getValue());
            }
        }
    }
}

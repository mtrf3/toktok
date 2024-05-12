package com.bytedance.android.livesdk.widget;

import X.B35;
import X.B55;
import X.BQO;
import X.C15650jR;
import X.C16880lQ;
import X.C1Q4;
import X.C259910h;
import X.C29306Beo;
import X.C30770C5u;
import X.C47061t0;
import X.C78720Uuy;
import X.KL2;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class LiveReportMaskWidget extends LiveWidget {
    public static final Set<Long> LJLJJLL = new LinkedHashSet();
    public Room LJLIL;
    public B35 LJLILLLLZI;
    public int LJLJI;
    public C47061t0 LJLJJI;
    public View LJLJJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqa;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        List<String> list;
        ImageModel cover;
        int i = this.LJLJI;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C47061t0 c47061t0 = this.LJLJJI;
            if (c47061t0 != null) {
                c47061t0.setVisibility(0);
            }
            View view = this.LJLJJL;
            if (view != null) {
                view.setVisibility(0);
            }
            float LJIIJJI = KL2.LJIIJJI(getContext()) / KL2.LJIIIZ(getContext());
            BQO LIZ = C15650jR.LIZ();
            Room room = this.LJLIL;
            if (room != null && (cover = room.getCover()) != null) {
                list = cover.getUrls();
            } else {
                list = null;
            }
            C78720Uuy LIZ2 = LIZ.LIZ(list);
            LIZ2.LJIILL = LJIIJJI;
            LIZ2.LJIILLIIL = 5;
            LIZ2.LJIIJJI(this.LJLJJI);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 254), findViewById(R.id.au4));
            return;
        }
        C47061t0 c47061t02 = this.LJLJJI;
        if (c47061t02 != null) {
            c47061t02.setVisibility(8);
        }
        View view2 = this.LJLJJL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        B35 b35 = this.LJLILLLLZI;
        if (b35 != null) {
            b35.start();
        }
        if (C29306Beo.LJIJJ(this.LJLIL)) {
            C30770C5u.LJII = true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ImageView imageView;
        C1Q4 LIZLLL;
        super.onCreate();
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(B55.LJLIL, view);
        }
        this.LJLJJI = (C47061t0) findViewById(R.id.ix7);
        this.LJLJJL = findViewById(R.id.ix8);
        View findViewById = findViewById(R.id.ix9);
        if ((findViewById instanceof ImageView) && (imageView = (ImageView) findViewById) != null && (LIZLLL = C259910h.LIZLLL(R.attr.avp, imageView.getContext())) != null) {
            LIZLLL.setTint(C259910h.LIZIZ(R.attr.awp, imageView.getContext()));
            imageView.setImageDrawable(LIZLLL);
        }
        LJLZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        B35 b35 = this.LJLILLLLZI;
        if (b35 != null) {
            b35.stop(false);
        }
        C30770C5u.LJII = false;
    }

    public LiveReportMaskWidget(Room room, B35 b35, int i) {
        this.LJLIL = room;
        this.LJLILLLLZI = b35;
        this.LJLJI = i;
    }
}

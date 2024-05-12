package com.bytedance.android.livesdk.widget;

import X.BL8;
import X.BZI;
import X.C05170If;
import X.C06510Nj;
import X.C0N3;
import X.C15380j0;
import X.C28329B9x;
import X.C29374Bfu;
import X.C47061t0;
import X.C47121t6;
import X.C79004UzY;
import X.TTL;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes6.dex */
public final class LiveLccMaskLayerWidget extends LiveWidget {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public Room LJLIL;
    public List<String> LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public C47061t0 LJLJL;
    public C47121t6 LJLJLJ;
    public LiveIconView LJLJLLL;
    public C47121t6 LJLL;
    public boolean LJLLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dp3;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        List<String> list;
        List<String> list2;
        ImageModel imageModel;
        ImageModel imageModel2;
        C47061t0 c47061t0 = this.LJLJL;
        User user = null;
        if (c47061t0 != null) {
            Room room = this.LJLIL;
            if (room != null && room.blurredCover != null) {
                if (room != null && (imageModel2 = room.blurredCover) != null) {
                    list = imageModel2.getUrls();
                } else {
                    list = null;
                }
                if (!C79004UzY.LJJIFFI(list)) {
                    Room room2 = this.LJLIL;
                    if (room2 != null && (imageModel = room2.blurredCover) != null) {
                        list2 = imageModel.getUrls();
                    } else {
                        list2 = null;
                    }
                    BL8.LIZJ(c47061t0, list2);
                }
            }
            List<String> list3 = this.LJLILLLLZI;
            if (list3 != null) {
                BL8.LIZ(c47061t0, list3, this.context);
            }
        }
        C47121t6 c47121t6 = this.LJLJLJ;
        if (c47121t6 != null && this.LJLJI) {
            if (C28329B9x.LIZJ(this.context)) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.m8l));
            }
            c47121t6.setVisibility(0);
            LiveIconView liveIconView = this.LJLJLLL;
            if (liveIconView != null) {
                liveIconView.setVisibility(0);
            }
        }
        C47121t6 c47121t62 = this.LJLL;
        if (c47121t62 != null) {
            if (1 == this.LJLJJLL) {
                if (TextUtils.equals("in_live", this.LJLJJI)) {
                    Object[] objArr = new Object[1];
                    Room room3 = this.LJLIL;
                    if (room3 != null) {
                        user = room3.getOwner();
                    }
                    objArr[0] = C05170If.LIZ(user);
                    c47121t62.setText(C15380j0.LJIILL(R.string.jyj, objArr));
                    return;
                }
                c47121t62.setText(C15380j0.LJIILJJIL(R.string.jyh));
                return;
            }
            if (TextUtils.equals("in_live", this.LJLJJI)) {
                Object[] objArr2 = new Object[1];
                Room room4 = this.LJLIL;
                if (room4 != null) {
                    user = room4.getOwner();
                }
                objArr2[0] = C05170If.LIZ(user);
                c47121t62.setText(C15380j0.LJIILL(R.string.m8b, objArr2));
                return;
            }
            c47121t62.setText(C15380j0.LJIILJJIL(R.string.m84));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LJLJL = (C47061t0) findViewById(R.id.fo4);
        this.LJLL = (C47121t6) findViewById(R.id.jis);
        this.LJLJLLL = (LiveIconView) findViewById(R.id.jcl);
        this.LJLJLJ = (C47121t6) findViewById(R.id.jcp);
        LJLZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LJLLI) {
            LJZ("close");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        LJZ("show");
    }

    public final void LJZ(String str) {
        String str2;
        BZI LIZIZ = C0N3.LIZIZ("live_unavailable", str, "action_type");
        LIZIZ.LJIJJ(this.LJLJJL, "record_id");
        C06510Nj.LIZ((C29374Bfu) TTL.LIZJ(LIZIZ, this.LJLJJI, "scene_type"), LIZIZ, "user_id");
        int i = this.LJLJJLL;
        if (1 == i) {
            str2 = "regional_block";
        } else if (i == 0) {
            str2 = "lcc";
        } else {
            str2 = "";
        }
        LIZIZ.LJIJJ(str2, "violation_type");
        LIZIZ.LJJIIJZLJL();
    }
}

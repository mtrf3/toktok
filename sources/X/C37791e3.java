package X;

import Y.IDfS292S0100000;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1e3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37791e3 extends CUB {
    public final Context LJLILLLLZI;
    public final C12U LJLJI;
    public final boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final ImageView LJLJLJ;
    public final ImageView LJLJLLL;
    public final C30001Fs LJLL;
    public final C73318Sq2 LJLLI;
    public int LJLLILLLL;
    public DataChannel LJLLJ;
    public final java.util.Map<Integer, View> LJLLL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Context getActivity() {
        return this.LJLILLLLZI;
    }

    public final int getIconWidth() {
        return this.LJLJJL;
    }

    public final int getLeftPadding() {
        return this.LJLJL;
    }

    public final int getSmallHeight() {
        return this.LJLJJLL;
    }

    public final void LIZIZ(int i) {
        GradientDrawable LIZIZ = T28.LIZIZ(0);
        LIZIZ.setCornerRadius(C87277YNd.LJIIJJI(15));
        LIZIZ.setColor(i);
        LIZ(R.id.k5u).setBackground(LIZIZ);
        Drawable LJI = C15380j0.LJI(R.drawable.cha);
        if (LJI != null) {
            LJI.setTint(i);
        }
    }

    public final void setDataChannel(DataChannel dataChannel) {
        Integer num;
        this.LJLLJ = dataChannel;
        if (dataChannel != null) {
            dataChannel.mv0(NewMessageNumChannel.class, this, new IDqS416S0100000(this, 353));
        }
        DataChannel dataChannel2 = this.LJLLJ;
        if (dataChannel2 != null) {
            dataChannel2.mv0(NetworkStatus.class, this, new IDqS416S0100000(this, 351));
        }
        if (!this.LJLJJI) {
            return;
        }
        DataChannel dataChannel3 = this.LJLLJ;
        if (dataChannel3 != null && (num = (Integer) dataChannel3.kv0(GameBackgroundColorChannel.class)) != null) {
            LIZIZ(num.intValue());
        }
        DataChannel dataChannel4 = this.LJLLJ;
        if (dataChannel4 == null) {
            return;
        }
        dataChannel4.mv0(GameBackgroundColorChannel.class, this, new IDqS416S0100000(this, 349));
    }

    public final void setIconWidth(int i) {
        this.LJLJJL = i;
    }

    public final void setLeftPadding(int i) {
        this.LJLJL = i;
    }

    public final void setSmallHeight(int i) {
        this.LJLJJLL = i;
    }

    public C37791e3(Context context, C12U c12u) {
        super(context);
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        ImageModel avatarLarge;
        this.LJLILLLLZI = context;
        this.LJLJI = c12u;
        boolean isExperimentGroup = BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup();
        this.LJLJJI = isExperimentGroup;
        this.LJLJJL = 16;
        this.LJLJJLL = 24;
        this.LJLJL = 6;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLLI = c73318Sq2;
        if (isExperimentGroup) {
            this.LJLJJL = 24;
            this.LJLJJLL = 30;
            this.LJLJL = 3;
            C16880lQ.LLLZIIL(R.layout.dl1, C0YG.LIZJ(C16880lQ.LLZIL(context), C259710f.LIZ.LIZLLL()), this);
        } else if (CCJ.LIZ(context)) {
            View.inflate(context, R.layout.dl2, this);
        } else {
            View.inflate(context, R.layout.dl0, this);
        }
        ImageView imageView = (ImageView) findViewById(R.id.f7n);
        this.LJLJLLL = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.f51);
        this.LJLJLJ = imageView2;
        C30001Fs c30001Fs = (C30001Fs) findViewById(R.id.e35);
        this.LJLL = c30001Fs;
        ((TextView) LIZ(R.id.m34)).setText(CardStruct.IStatusCode.DEFAULT);
        c73318Sq2.LIZ(CUB.LJLIL.LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(this, 47), BTJ.LIZ));
        if (isExperimentGroup) {
            if (imageView2 != null) {
                C87277YNd.LJJIIZ(imageView2);
            }
            B83 LIZ = B83.LIZ();
            if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null && (avatarLarge = interfaceC05190Ih.getAvatarLarge()) != null) {
                C15640jQ.LJIIIIZZ(c30001Fs, avatarLarge);
            } else {
                if (c30001Fs != null) {
                    C87277YNd.LJJIIZ(c30001Fs);
                }
                if (imageView2 != null) {
                    C87277YNd.LJJIJ(imageView2);
                }
            }
        } else if (c30001Fs != null) {
            C87277YNd.LJJIIZ(c30001Fs);
        }
        if (!C15380j0.LJIIZILJ() || imageView == null) {
            return;
        }
        imageView.setScaleX(-1.0f);
    }
}

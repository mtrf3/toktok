package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.container.config.base.CardConfig;
import com.bytedance.android.livesdk.container.type.HColor;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CNV extends AbstractC31219CNb implements CNR {
    public CardConfig LJLJJI;
    public String LJLJJL;
    public final CNW LJLJJLL;

    @Override // X.AbstractC31219CNb
    public final void LIZ() {
    }

    public Fragment getFragment() {
        return null;
    }

    @Override // X.AbstractC31219CNb
    public final void LIZIZ() {
        this.LJLJJLL.LJLJJL.release();
    }

    @Override // X.CNR
    public final void close() {
        ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(UOS.ID, this.LJLJJL);
    }

    @Override // X.AbstractC31219CNb
    public String getCardContainerId() {
        return this.LJLJJL;
    }

    public final CardConfig getConfig() {
        return this.LJLJJI;
    }

    public final String getContainerId() {
        return this.LJLJJL;
    }

    @Override // X.CNR
    public String getHybridContainerId() {
        return this.LJLJJL;
    }

    public final CNW getHybridView() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC31219CNb
    public final void LIZJ(java.util.Map<String, ? extends Object> map) {
        View re = this.LJLJJLL.getComponent().re();
        if (re instanceof VNS) {
            ((VNS) re).updateData(map);
        }
    }

    public final void setConfig(CardConfig cardConfig) {
        o.LJIIIZ(cardConfig, "<set-?>");
        this.LJLJJI = cardConfig;
    }

    public final void setContainerId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJL = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CNV(Context context, android.net.Uri uri, String str) {
        super(context);
        String LIZIZ;
        Integer num;
        Integer num2;
        C38113ExZ c38113ExZ;
        o.LJIIIZ(uri, "uri");
        new LinkedHashMap();
        CardConfig cardConfig = new CardConfig(CNI.LIZJ.contains(uri.getHost()) ? uri.buildUpon().appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis())).build() : uri);
        this.LJLJJI = cardConfig;
        if (cardConfig.getEngineType() == CNK.LYNX) {
            LIZIZ = CNM.LIZ();
        } else {
            LIZIZ = CNM.LIZIZ();
        }
        this.LJLJJL = LIZIZ;
        setName(str == null ? "" : str);
        CNW cnw = new CNW(context, this.LJLJJL, this.LJLJJI);
        this.LJLJJLL = cnw;
        cnw.setBackgroundColor(cnw.getContext().getResources().getColor(R.color.cz));
        CVT cvt = new CVT(cnw.getContext(), null);
        cvt.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cvt.setBackgroundColor(cvt.getContext().getResources().getColor(R.color.cz));
        cvt.setVisibility(0);
        cnw.LJLJI = cvt;
        cnw.LJLJJL.LJ();
        cnw.setHybridLoadListener(new CNY(this));
        C31886CfK c31886CfK = cnw.getComponent().LJLJJLL;
        if (c31886CfK != null && (c38113ExZ = c31886CfK.LJLILLLLZI) != null) {
            c38113ExZ.LIZLLL("close", new C30937CCf(this));
        }
        HColor containerBgColor = cnw.LJLILLLLZI.getContainerBgColor();
        if (containerBgColor != null) {
            num = Integer.valueOf(containerBgColor.getColor(cnw.getContext()));
        } else {
            num = null;
        }
        int color = cnw.getContext().getResources().getColor(R.color.ar);
        if (num != null && num.intValue() != color) {
            cnw.setBackgroundColor(num.intValue());
        }
        View re = cnw.LJLJJL.re();
        if (re != null) {
            cnw.addView(re, 0);
            cnw.LJLJJL.loadUrl(cnw.LJLILLLLZI.getUrl());
        }
        HColor loadingBgColor = cnw.LJLILLLLZI.getLoadingBgColor();
        if (loadingBgColor != null) {
            num2 = Integer.valueOf(loadingBgColor.getColor(cnw.getContext()));
        } else {
            num2 = null;
        }
        int color2 = cnw.getContext().getResources().getColor(R.color.ar);
        if (num2 != null && num2.intValue() == color2) {
            num2 = null;
        }
        if (num2 != null) {
            int intValue = num2.intValue();
            CVT cvt2 = cnw.LJLJI;
            if (cvt2 != null) {
                cvt2.setBackgroundColor(intValue);
            } else {
                o.LJIJI("loadingView");
                throw null;
            }
        }
        if (cnw.LJLILLLLZI.getHideLoading()) {
            CVT cvt3 = cnw.LJLJI;
            if (cvt3 != null) {
                cvt3.setVisibility(8);
            } else {
                o.LJIJI("loadingView");
                throw null;
            }
        }
        CVT cvt4 = cnw.LJLJI;
        if (cvt4 != null) {
            cnw.addView(cvt4, 1);
            addView(cnw);
        } else {
            o.LJIJI("loadingView");
            throw null;
        }
    }
}

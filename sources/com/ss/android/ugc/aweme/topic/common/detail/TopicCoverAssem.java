package com.ss.android.ugc.aweme.topic.common.detail;

import X.C278817o;
import X.C32151Nz;
import X.C7MY;
import X.O6R;
import X.W5U;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.detail.prefab.DetailCoverAssem;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class TopicCoverAssem extends DetailCoverAssem {
    public TopicCoverAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailCoverAssem
    public final void L3() {
        SmartImageView smartImageView;
        Integer num;
        int i;
        int i2;
        Integer num2;
        Integer num3;
        String str;
        Integer num4;
        View x3 = x3();
        if (!(x3 instanceof SmartImageView) || (smartImageView = (SmartImageView) x3) == null) {
            return;
        }
        Map<String, Object> map = getConfig().LJ;
        Object obj = map.get("width_dp");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 75;
        }
        Object obj2 = map.get("height_dp");
        if ((obj2 instanceof Integer) && (num4 = (Integer) obj2) != null) {
            i2 = num4.intValue();
        } else {
            i2 = LiveTryModeCountDownThresholdSetting.DEFAULT;
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        Object obj3 = map.get("img_width");
        if (obj3 instanceof Integer) {
            num2 = (Integer) obj3;
        } else {
            num2 = null;
        }
        Object obj4 = map.get("img_height");
        if (obj4 instanceof Integer) {
            num3 = (Integer) obj4;
        } else {
            num3 = null;
        }
        if (num2 != null && num3 != null && num2.intValue() != 0 && num3.intValue() != 0) {
            float intValue = num2.intValue() / num3.intValue();
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (intValue >= f3) {
                    marginLayoutParams.width = C7MY.LIZIZ(i);
                    marginLayoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(f / intValue)));
                } else {
                    marginLayoutParams.height = C7MY.LIZIZ(i2);
                    float f4 = f2 * intValue;
                    marginLayoutParams.width = C278817o.LIZ(f4);
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf((75 - f4) / 2)));
                    marginLayoutParams.setMargins(LJJIIZ, marginLayoutParams.topMargin, LJJIIZ, marginLayoutParams.bottomMargin);
                }
                smartImageView.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C7MY.LIZIZ(i);
                layoutParams2.height = C7MY.LIZIZ(i2);
                smartImageView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Object obj5 = map.get("img_url");
        if ((obj5 instanceof String) && (str = (String) obj5) != null) {
            smartImageView.LIZ(W5U.LJIIIIZZ(str).LIZ());
        }
    }
}

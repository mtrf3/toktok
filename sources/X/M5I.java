package X;

import Y.ACListenerS29S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M5I extends DialogC26391AXj {
    public String LJLIL;
    public String LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public Activity LJLJL;
    public View LJLJLJ;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    public M5I(Activity activity, PopupSetting popupSetting) {
        super((Context) activity, R.style.a95, false, true);
        String str;
        String str2;
        String str3;
        this.LJLJL = activity;
        String str4 = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.amg, C16880lQ.LLZIL(activity), null);
        this.LJLJLJ = LLLZIIL;
        setContentView(LLLZIIL);
        this.LJLJI = (TextView) this.LJLJLJ.findViewById(R.id.mo6);
        this.LJLJJI = (TextView) this.LJLJLJ.findViewById(R.id.m4n);
        this.LJLJJL = this.LJLJLJ.findViewById(R.id.aww);
        this.LJLJJLL = this.LJLJLJ.findViewById(R.id.av8);
        Activity activity2 = this.LJLJL;
        if (activity2 != null) {
            this.LJLIL = activity2.getString(R.string.ie2);
            this.LJLILLLLZI = this.LJLJL.getString(R.string.ie0);
        }
        if (popupSetting != null) {
            if (!TextUtils.isEmpty(popupSetting.LJI())) {
                this.LJLIL = popupSetting.LJI();
            }
            if (!TextUtils.isEmpty(popupSetting.LJ())) {
                this.LJLILLLLZI = popupSetting.LJ();
            }
            try {
                PopupSetting.PopupText popupText = popupSetting.popupText;
                o.LJI(popupText);
                str = popupText.title;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                this.LJLJI.setText(str);
            }
            try {
                PopupSetting.PopupText popupText2 = popupSetting.popupText;
                o.LJI(popupText2);
                str2 = popupText2.context;
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.LJLJJI.setText(str2);
            }
            try {
                PopupSetting.PopupText popupText3 = popupSetting.popupText;
                o.LJI(popupText3);
                List<PopupSetting.ButtonStruct> list = popupText3.buttons;
                o.LJI(list);
                str3 = ((PopupSetting.ButtonStruct) ListProtector.get(list, 0)).text;
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
                str3 = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                this.LJLJJL.setContentDescription(str3);
            }
            try {
                PopupSetting.PopupText popupText4 = popupSetting.popupText;
                o.LJI(popupText4);
                List<PopupSetting.ButtonStruct> list2 = popupText4.buttons;
                o.LJI(list2);
                str4 = ((PopupSetting.ButtonStruct) ListProtector.get(list2, 1)).text;
            } catch (Exception e4) {
                C16880lQ.LLLLIIL(e4);
            }
            if (!TextUtils.isEmpty(str4)) {
                this.LJLJJLL.setContentDescription(str4);
            }
        }
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 56), this.LJLJJL);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 57), this.LJLJJLL);
    }
}

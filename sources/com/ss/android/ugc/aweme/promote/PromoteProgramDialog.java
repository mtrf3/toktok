package com.ss.android.ugc.aweme.promote;

import X.C03880Dg;
import X.C110614Vt;
import X.C16880lQ;
import X.C1FJ;
import X.C26045AKb;
import X.C32151Nz;
import X.C38333F2r;
import X.C39557Ffl;
import X.C40270FrG;
import X.C56215M4l;
import X.C65300Pk0;
import X.C78703Uuh;
import X.C78704Uui;
import X.DialogC25756A8y;
import X.DialogC26391AXj;
import X.InterfaceC39559Ffn;
import X.KL2;
import X.QD3;
import X.SJM;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import Y.ARunnableS19S0110000_13;
import Y.IDTListenerS113S0100000_3;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.promote.PromoteProgramDialog;
import com.ss.android.ugc.aweme.views.TextClickable;
import com.zhiliaoapp.musically.R;
import java.util.regex.Matcher;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes14.dex */
public class PromoteProgramDialog extends DialogC26391AXj implements WeakHandler.IHandler {
    public View mBtnJoin;
    public View mBtnNext;
    public Activity mContext;
    public DialogC25756A8y mDialog;
    public WeakHandler mHandler;
    public String mLinkUrl;
    public InterfaceC39559Ffn mPromoteProgramPresenter;
    public View mRootView;
    public String mShowPosition;
    public String mStrRegular;
    public TextView mTvMsg;
    public TextView mTvProtocol;
    public TextView mTvTitle;
    public View mView;

    public static void com_ss_android_ugc_aweme_promote_PromoteProgramDialog_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "4136303025133840706")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    public static void com_ss_android_ugc_aweme_promote_PromoteProgramDialog_com_ss_android_ugc_aweme_views_ResizableDialog_show_super(DialogC26391AXj dialogC26391AXj) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", dialogC26391AXj, new Object[0], "void", new C65300Pk0(false, "()V", "4136303025133840706")).LIZ) {
            return;
        }
        super.show();
    }

    private void initProtocolText() {
        TextClickable textClickable = new TextClickable();
        textClickable.LIZJ = PatternProtector.compile(this.mStrRegular);
        textClickable.LIZ = 0;
        TextView textView = this.mTvProtocol;
        if (textView != null) {
            SpannableString spannableString = new SpannableString(textView.getText());
            String obj = spannableString.toString();
            Matcher matcher = textClickable.LIZJ.matcher(obj);
            Matcher matcher2 = textClickable.LIZLLL.matcher(obj);
            boolean z = false;
            while (matcher2.find()) {
                spannableString.setSpan(new C78703Uuh(textClickable, matcher2.group(1), 1), matcher2.start(), matcher2.end(), 33);
                matcher2.start();
                matcher2.end();
                z = true;
            }
            while (matcher.find()) {
                spannableString.setSpan(new C78703Uuh(textClickable, matcher.group(textClickable.LIZ), 0), matcher.start(), matcher.end(), 33);
                matcher.start();
                matcher.end();
                z = true;
            }
            if (z) {
                textView.setText(spannableString);
                textView.setOnTouchListener(new IDTListenerS113S0100000_3(spannableString, 14));
            }
        }
        textClickable.LIZIZ = new C78704Uui(this);
    }

    public void initView() {
        this.mHandler = new WeakHandler(this);
        Integer LIZ = SharePrefCache.inst().getPromoteDialogPopupClickType().LIZ();
        C16880lQ.LJIIJ(new ACListenerS47S0200000_13(LIZ, this, 8), this.mBtnJoin);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(2.0f)));
        this.mBtnJoin.setBackground(c110614Vt.LIZ(this.mContext));
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 102), this.mBtnNext);
        String LIZ2 = SharePrefCache.inst().getPromoteDialogPopupPopupTitle().LIZ();
        String LIZ3 = SharePrefCache.inst().getPromoteDialogPopupPopupMsg().LIZ();
        String LIZ4 = SharePrefCache.inst().getPromoteDialogPopupPopupContent().LIZ();
        if (!TextUtils.isEmpty(LIZ2)) {
            this.mTvTitle.setText(LIZ2);
        }
        if (this.mTvTitle.getText() != null) {
            if (LIZ.intValue() == 0) {
                TextView textView = this.mTvTitle;
                textView.setText(textView.getText().toString().replaceAll("!", "").replaceAll("！", ""));
            }
            TextView textView2 = this.mTvTitle;
            textView2.setText(textView2.getText().toString().replaceAll("\\\\n", "\n"));
        }
        if (!TextUtils.isEmpty(LIZ3)) {
            this.mTvMsg.setText(LIZ3);
        } else {
            this.mTvMsg.setVisibility(8);
        }
        if (!TextUtils.isEmpty(LIZ4)) {
            this.mTvProtocol.setText(LIZ4);
        }
        initProtocolText();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        showLoadDialog(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        com_ss_android_ugc_aweme_promote_PromoteProgramDialog_com_ss_android_ugc_aweme_views_ResizableDialog_show_super(this);
        viewAnim(true, this.mRootView);
    }

    @QD3
    public void closeKrCopyright(C40270FrG c40270FrG) {
        dismiss();
    }

    public void create(Context context) {
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.amv, C16880lQ.LLZIL(context), null);
        this.mView = LLLZIIL;
        setContentView(LLLZIIL);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.5f;
        window.addFlags(2);
        window.setAttributes(attributes);
        window.setWindowAnimations(0);
        attributes.width = (int) KL2.LIZJ(getContext(), 280.0f);
        this.mStrRegular = this.mView.getContext().getString(R.string.phj);
        this.mTvTitle = (TextView) this.mView.findViewById(R.id.mo6);
        this.mTvMsg = (TextView) this.mView.findViewById(R.id.mbf);
        this.mTvProtocol = (TextView) this.mView.findViewById(R.id.mfj);
        this.mBtnJoin = this.mView.findViewById(R.id.aww);
        this.mBtnNext = this.mView.findViewById(R.id.axf);
        this.mRootView = this.mView.findViewById(R.id.j71);
        this.mPromoteProgramPresenter = new C39557Ffl();
        String LIZ = SharePrefCache.inst().getPromoteDialogPopupPopupUrl().LIZ();
        if (TextUtils.isEmpty(LIZ)) {
            LIZ = "";
        }
        this.mLinkUrl = LIZ;
        String LIZ2 = SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().LIZ();
        if (TextUtils.isEmpty(LIZ2)) {
            LIZ2 = this.mStrRegular;
        }
        this.mStrRegular = LIZ2;
        initView();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        showLoadDialog(false);
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof C38333F2r) {
            C1FJ.LJI((C38333F2r) obj, new C26045AKb(this.mContext));
            return;
        }
        if (obj instanceof Exception) {
            C26045AKb c26045AKb = new C26045AKb(this.mContext);
            c26045AKb.LJIIIZ(getContext().getResources().getString(R.string.imh));
            c26045AKb.LJIIJ();
        } else if ((obj instanceof PromoteProgramResponse) && i == 1 && ((PromoteProgramResponse) obj).isConfirmedSuccess()) {
            dismiss();
            SharedPreferences.Editor edit = C56215M4l.LIZ().edit();
            edit.putBoolean("joined", true);
            edit.apply();
        }
    }

    public void showLoadDialog(boolean z) {
        if (z) {
            if (this.mDialog == null) {
                DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(this.mContext);
                this.mDialog = dialogC25756A8y;
                dialogC25756A8y.LIZIZ(R.string.h30);
            }
            com_ss_android_ugc_aweme_promote_PromoteProgramDialog_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(this.mDialog);
            return;
        }
        DialogC25756A8y dialogC25756A8y2 = this.mDialog;
        if (dialogC25756A8y2 == null) {
            return;
        }
        dialogC25756A8y2.dismiss();
    }

    private void init(Activity activity, String str) {
        this.mContext = activity;
        this.mShowPosition = str;
        setCancelable(false);
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(this)) {
            LIZJ.LJIILJJIL(this);
        }
        create(activity);
    }

    public static /* synthetic */ void lambda$viewAnim$1(final View view, final boolean z) {
        long j;
        float f;
        final int height = (int) (view.getHeight() * 0.075f);
        if (z) {
            j = 300;
        } else {
            j = 100;
        }
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.Uuj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PromoteProgramDialog.lambda$viewAnim$0(height, view, z, valueAnimator);
            }
        });
        ofFloat.setInterpolator(new SJM());
        ofFloat.start();
    }

    private void viewAnim(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.post(new ARunnableS19S0110000_13(view, z, 0));
    }

    public PromoteProgramDialog(Activity activity, String str, int i) {
        super(activity, R.style.a95, false, true, true);
        init(activity, str);
    }

    public static /* synthetic */ void lambda$viewAnim$0(int i, View view, boolean z, ValueAnimator valueAnimator) {
        float f;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f2 = i;
        int i2 = (int) (f2 - (f2 * animatedFraction));
        if (z) {
            f = i2;
        } else {
            f = (-i) * animatedFraction;
        }
        view.setTranslationY(f);
    }
}

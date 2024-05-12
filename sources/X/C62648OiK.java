package X;

import Y.ACListenerS26S0101000_8;
import Y.ACListenerS28S0101000_10;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.OiK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62648OiK extends G5I {
    public static final /* synthetic */ int LJLLLL = 0;
    public final int LJLJI;
    public RadioGroup LJLJJI;
    public C63046Ook LJLJJL;
    public C63046Ook LJLJJLL;
    public C63046Ook LJLJL;
    public TextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final IAVPublishService LJLLL;

    @Override // X.G5I
    public final void LIZLLL() {
    }

    @Override // X.G5I
    public final void LJFF() {
    }

    @Override // X.G5I
    public DialogC25756A8y getLemon8AuthLoadingHUD() {
        return null;
    }

    @Override // X.G5I
    public TuxIconView getLemon8ButtonView() {
        return null;
    }

    private InterfaceC62671Oih getActivityProvider() {
        return new InterfaceC62671Oih() { // from class: X.OiR
            @Override // X.InterfaceC62671Oih
            public final Activity get() {
                C62648OiK c62648OiK = C62648OiK.this;
                if (c62648OiK.getContext() != null && (c62648OiK.getContext() instanceof Activity)) {
                    return (Activity) c62648OiK.getContext();
                }
                return C84763XOl.LJIIIIZZ();
            }
        };
    }

    @Override // X.G5I
    public final boolean LJ() {
        C63046Ook c63046Ook = this.LJLJJL;
        if (c63046Ook != null && c63046Ook.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.G5I
    public final String LJII() {
        ArrayList arrayList = new ArrayList();
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C30581Hy.LJJIIZ(arrayList);
    }

    public int getLayoutResId() {
        if (this.LJLJI == 0) {
            return R.layout.cmm;
        }
        return R.layout.cll;
    }

    @Override // X.G5I
    public int getSaveUploadType() {
        RadioGroup radioGroup = this.LJLJJI;
        if (radioGroup == null) {
            return 0;
        }
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.ayr) {
            return 1;
        }
        if (checkedRadioButtonId == R.id.ax2) {
            return 11;
        }
        if (checkedRadioButtonId != R.id.ax7) {
            return 0;
        }
        return 7;
    }

    @Override // X.G5I
    public Boolean getLemon8ButtonStatus() {
        return Boolean.FALSE;
    }

    public C62648OiK(Context context) {
        super(context);
        boolean z;
        boolean z2;
        this.LJLLILLLL = 44;
        this.LJLLJ = 30;
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        this.LJLLL = publishService;
        this.LJLJI = 0;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), getLayoutResId(), this, true);
        LLLLIILL.findViewById(R.id.fgp);
        this.LJLJJI = (RadioGroup) LLLLIILL.findViewById(R.id.ilv);
        this.LJLJJL = (C63046Ook) LLLLIILL.findViewById(R.id.ayr);
        this.LJLJJLL = (C63046Ook) LLLLIILL.findViewById(R.id.ax2);
        this.LJLJL = (C63046Ook) LLLLIILL.findViewById(R.id.ax7);
        this.LJLJLLL = (TuxTextView) LLLLIILL.findViewById(R.id.lti);
        if (publishService.isEnablePutSettingsIntoMoreOption() && publishService.isEnableChangeShareToCell()) {
            View findViewById = LLLLIILL.findViewById(R.id.jtc);
            View findViewById2 = LLLLIILL.findViewById(R.id.jv6);
            if (findViewById instanceof TuxIconView) {
                ((TuxIconView) findViewById).setTintColorRes(R.attr.go);
            }
            if (findViewById2 instanceof TuxTextView) {
                TuxTextView tuxTextView = (TuxTextView) findViewById2;
                tuxTextView.setTuxFont(42);
                tuxTextView.setTextColorRes(R.attr.go);
            }
        }
        LJIIJJI(LLLLIILL);
        setSilentShareChannelDrawable(context);
        C62629Oi1.LIZLLL = false;
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableSaveUploadVideo()) {
            if (!C19N.LJ("disable_save_at_post", false)) {
                InterfaceC62225ObV LIZIZ = C62324Od6.LIZIZ("line", null);
                if (LIZIZ != null && LIZIZ.LIZLLL(getContext())) {
                    z = true;
                } else {
                    this.LJLJJLL.setVisibility(8);
                    z = false;
                }
                InterfaceC62225ObV LIZIZ2 = C62324Od6.LIZIZ("messenger", new C62297Ocf(getActivityProvider(), null));
                if (LIZIZ2 != null && LIZIZ2.LIZLLL(getContext())) {
                    z2 = true;
                } else {
                    this.LJLJL.setVisibility(8);
                    z2 = false;
                }
                C54293LSn c54293LSn = C235779Nd.LIZ;
                int intValue = c54293LSn.LIZIZ().LIZ().intValue();
                if (intValue != 1) {
                    if (intValue != 7) {
                        if (intValue != 11) {
                            RadioGroup radioGroup = this.LJLJJI;
                            if (radioGroup != null) {
                                radioGroup.clearCheck();
                            }
                        } else if (!z) {
                            c54293LSn.LIZIZ().LIZLLL(0);
                        } else {
                            C63046Ook c63046Ook = this.LJLJJLL;
                            if (c63046Ook != null) {
                                c63046Ook.setChecked(true);
                            }
                        }
                    } else if (!z2) {
                        c54293LSn.LIZIZ().LIZLLL(0);
                    } else {
                        C63046Ook c63046Ook2 = this.LJLJL;
                        if (c63046Ook2 != null) {
                            c63046Ook2.setChecked(true);
                        }
                    }
                } else if (this.LJLJJL != null) {
                    boolean turnOffSaveLocalOptionByDefault = AVExternalServiceImpl.LIZ().publishService().turnOffSaveLocalOptionByDefault();
                    C62822Ol8 c62822Ol8 = C79493Ab.LIZ;
                    Keva keva = (Keva) c62822Ol8.getValue();
                    C62822Ol8 c62822Ol82 = C79493Ab.LIZJ;
                    boolean z3 = keva.getBoolean((String) c62822Ol82.getValue(), false);
                    if (turnOffSaveLocalOptionByDefault && !z3) {
                        ((Keva) c62822Ol8.getValue()).storeBoolean((String) c62822Ol82.getValue(), true);
                        c54293LSn.LIZIZ().LIZLLL(0);
                    } else {
                        this.LJLJJL.setChecked(true);
                        LJIIJ(true);
                    }
                }
                if (SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                    LJIIIZ(true);
                }
                LJIILIIL(this.LJLJJI.getCheckedRadioButtonId());
            } else {
                C63046Ook c63046Ook3 = this.LJLJJL;
                if (c63046Ook3 != null) {
                    c63046Ook3.setVisibility(8);
                }
                C235779Nd.LIZ.LIZIZ().LIZLLL(0);
            }
        } else {
            C63046Ook c63046Ook4 = this.LJLJJL;
            if (c63046Ook4 != null) {
                c63046Ook4.setVisibility(8);
            }
            C235779Nd.LIZ.LIZIZ().LIZLLL(0);
        }
        C63046Ook c63046Ook5 = this.LJLJJLL;
        if (c63046Ook5 != null) {
            c63046Ook5.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS26S0101000_8(3, this, 0)));
        }
        C63046Ook c63046Ook6 = this.LJLJL;
        if (c63046Ook6 != null) {
            c63046Ook6.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS26S0101000_8(3, this, 1)));
        }
        C63046Ook c63046Ook7 = this.LJLJJL;
        if (c63046Ook7 != null) {
            c63046Ook7.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0101000_10(1, this, 5)));
        }
        RadioGroup radioGroup2 = this.LJLJJI;
        if (radioGroup2 != null) {
            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: X.OiP
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup3, int i) {
                    C62648OiK c62648OiK = C62648OiK.this;
                    TuxTextView tuxTextView2 = c62648OiK.LJLJLLL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setVisibility(8);
                    }
                    if (i == R.id.ayr) {
                        C235779Nd.LIZ.LIZIZ().LIZLLL(1);
                        c62648OiK.LJIIIIZZ("sync_share_save_local");
                        SharePrefCache.inst().getAutoSaveVideo().LIZLLL(Boolean.TRUE);
                    } else if (i == R.id.ax2) {
                        C235779Nd.LIZ.LIZIZ().LIZLLL(11);
                        c62648OiK.LJIIIIZZ("sync_share_save_line");
                        SharePrefCache.inst().getAutoSaveVideo().LIZLLL(Boolean.TRUE);
                    } else if (i == R.id.ax7) {
                        C235779Nd.LIZ.LIZIZ().LIZLLL(7);
                        c62648OiK.LJIIIIZZ("sync_share_save_messenger");
                        SharePrefCache.inst().getAutoSaveVideo().LIZLLL(Boolean.TRUE);
                    } else if (!SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                        C235779Nd.LIZ.LIZIZ().LIZLLL(0);
                        SharePrefCache.inst().getAutoSaveVideo().LIZLLL(Boolean.FALSE);
                    }
                    c62648OiK.LJIILIIL(i);
                }
            });
        }
    }

    public static final String LJIILJJIL(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // X.G5I
    public final void LIZ(C40945G5d c40945G5d) {
        C63046Ook c63046Ook = this.LJLJJL;
        if (c63046Ook != null) {
            ((ArrayList) c63046Ook.LJLJJLL).add(c40945G5d);
        }
    }

    @Override // X.G5I
    public final void LIZIZ(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        SharePrefCache.inst().getIsAwemePrivate().LIZLLL(Boolean.valueOf(z));
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIJI(getContext(), z);
        LJIIIZ(z);
    }

    @Override // X.G5I
    public final void LJI(boolean z) {
        C63046Ook c63046Ook = this.LJLJJL;
        if (c63046Ook != null) {
            c63046Ook.setChecked(z);
        }
        RadioGroup radioGroup = this.LJLJJI;
        if (radioGroup != null) {
            if (z) {
                radioGroup.check(R.id.ayr);
            } else {
                if (radioGroup.getCheckedRadioButtonId() != R.id.ayr) {
                    return;
                }
                this.LJLJJI.clearCheck();
            }
        }
    }

    public final void LJIIIIZZ(String str) {
        if (!this.LJLL) {
            this.LJLL = true;
            this.LJLLL.cancelSynthesis(getContext(), str);
        }
    }

    public final void LJIIIZ(boolean z) {
        C63046Ook c63046Ook;
        if (z) {
            RadioGroup radioGroup = this.LJLJJI;
            if (radioGroup != null) {
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                C63046Ook c63046Ook2 = this.LJLJJLL;
                if (c63046Ook2 != null) {
                    c63046Ook2.setCanChecked(false);
                }
                C63046Ook c63046Ook3 = this.LJLJL;
                if (c63046Ook3 != null) {
                    c63046Ook3.setCanChecked(false);
                }
                C63046Ook c63046Ook4 = this.LJLJJLL;
                if (c63046Ook4 != null && this.LJLJL != null && (checkedRadioButtonId == c63046Ook4.getId() || checkedRadioButtonId == this.LJLJL.getId())) {
                    this.LJLJJI.check(-1);
                }
            }
        } else if (this.LJLJJI != null) {
            int intValue = C235779Nd.LIZ.LIZIZ().LIZ().intValue();
            C63046Ook c63046Ook5 = this.LJLJJLL;
            if (c63046Ook5 != null) {
                c63046Ook5.setCanChecked(true);
            }
            C63046Ook c63046Ook6 = this.LJLJL;
            if (c63046Ook6 != null) {
                c63046Ook6.setCanChecked(true);
            }
            C63046Ook c63046Ook7 = this.LJLJJLL;
            if (c63046Ook7 != null && (c63046Ook = this.LJLJL) != null) {
                if (intValue == 11) {
                    c63046Ook7.setChecked(true);
                } else if (intValue == 7) {
                    c63046Ook.setChecked(true);
                }
            }
        }
        LJIILIIL(this.LJLJJI.getCheckedRadioButtonId());
    }

    public final void LJIIJ(boolean z) {
        TuxTextView tuxTextView;
        if (this.LJLLI) {
            return;
        }
        int i = ((Keva) C79493Ab.LIZ.getValue()).getInt((String) C79493Ab.LIZIZ.getValue(), 0);
        boolean turnOffSaveLocalAfterModeration = AVExternalServiceImpl.LIZ().publishService().turnOffSaveLocalAfterModeration();
        if (i < 3 && z && turnOffSaveLocalAfterModeration && (tuxTextView = this.LJLJLLL) != null) {
            tuxTextView.setVisibility(0);
            this.LJLLI = true;
            C62629Oi1.LIZLLL = true;
        }
    }

    public void LJIIJJI(View view) {
        this.LJLJLJ = (TextView) view.findViewById(R.id.ky1);
    }

    public void LJIILIIL(int i) {
        if (C53316KwC.LIZ()) {
            if (i == R.id.ax2) {
                this.LJLJLJ.setText(getContext().getString(R.string.rdi, "Line"));
            } else if (i == R.id.ax7) {
                this.LJLJLJ.setText(getContext().getString(R.string.rdi, "Messenger"));
            } else {
                this.LJLJLJ.setText(getContext().getString(R.string.r3g));
            }
        }
    }

    @Override // X.G5I
    public void setSaveLocalEnabled(boolean z) {
        int i;
        C63046Ook c63046Ook = this.LJLJJL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        c63046Ook.setVisibility(i);
    }

    public void setSilentShareChannelDrawable(Context context) {
        this.LJLJJL.setBackground(C62417Oeb.LIZ(context, R.raw.icon_arrow_to_down, R.raw.icon_color_download_circle, this.LJLLILLLL, this.LJLLJ));
        this.LJLJJLL.setBackground(C62417Oeb.LIZ(context, R.raw.icon_line, R.raw.icon_color_line_circle, this.LJLLILLLL, this.LJLLJ));
        this.LJLJL.setBackground(C62417Oeb.LIZ(context, R.raw.icon_messenger, R.raw.icon_color_messenger_circle, this.LJLLILLLL, this.LJLLJ));
    }

    @Override // X.G5I
    public void setSyncIconSize(int i) {
        C63046Ook c63046Ook = this.LJLJJLL;
        if (c63046Ook != null) {
            ViewGroup.LayoutParams layoutParams = c63046Ook.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
        }
        C63046Ook c63046Ook2 = this.LJLJL;
        if (c63046Ook2 != null) {
            ViewGroup.LayoutParams layoutParams2 = c63046Ook2.getLayoutParams();
            layoutParams2.width = i;
            layoutParams2.height = i;
        }
        C63046Ook c63046Ook3 = this.LJLJJL;
        if (c63046Ook3 != null) {
            ViewGroup.LayoutParams layoutParams3 = c63046Ook3.getLayoutParams();
            layoutParams3.width = i;
            layoutParams3.height = i;
        }
    }

    @Override // X.G5I
    public void setSyncShareViewTextColor(int i) {
        TextView textView = this.LJLJLJ;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // X.G5I
    public void setSyncShareViewTextSize(float f) {
        TextView textView = this.LJLJLJ;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    @Override // X.G5I
    public void setSyncShareViewTitle(String str) {
        TextView textView = this.LJLJLJ;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void LJIIL(String str, boolean z) {
        String str2;
        String str3;
        Object tag = getTag();
        if (!(tag instanceof java.util.Map)) {
            return;
        }
        java.util.Map map = (java.util.Map) tag;
        if (z) {
            str2 = "publish_share_confirm";
        } else {
            str2 = "publish_share_cancel";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", LJIILJJIL(map.get("creation_id")));
        c188727au.LJIIIZ("enter_from", LJIILJJIL(map.get("enter_from")));
        c188727au.LJIIIZ("content_type", LJIILJJIL(map.get("content_type")));
        c188727au.LJIIIZ("shoot_way", LJIILJJIL(map.get("shoot_way")));
        c188727au.LJIIIZ("share_to", str);
        FMX.LJIIL(str2, c188727au.LIZ);
        if ("download".equals(str)) {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("creation_id", LJIILJJIL(map.get("creation_id")));
            c188727au2.LJIIIZ("enter_from", LJIILJJIL(map.get("enter_from")));
            c188727au2.LJIIIZ("shoot_way", LJIILJJIL(map.get("shoot_way")));
            if (z) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            c188727au2.LJIIIZ("to_status", str3);
            c188727au2.LIZLLL(-1, "save_with_captions");
            FMX.LJIIL("click_react_download_control", c188727au2.LIZ);
        }
        if (z) {
            LIZJ();
        }
    }
}

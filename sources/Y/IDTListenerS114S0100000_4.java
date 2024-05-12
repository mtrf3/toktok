package Y;

import X.AKF;
import X.AKM;
import X.AKR;
import X.ASB;
import X.ATD;
import X.C26045AKb;
import X.C45804HyK;
import X.C78924UyG;
import X.C9UE;
import X.InterfaceC243979hp;
import X.T5T;
import android.app.Activity;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.fragment.AddOrModifyKeywordFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptTextEditFragment;
import com.ss.android.ugc.aweme.paidcontent.assem.SeriesPostUIAssem;
import com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.ProfileAdvancedFeaturesCell;
import com.ss.android.ugc.aweme.profile.widgets.signature.MineProfileSignatureAssem;
import com.ss.android.ugc.aweme.profile.widgets.signature.UserProfileSignatureAssem;
import com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDTListenerS114S0100000_4 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            case 10:
                return onTouch$10(this, view, motionEvent);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case 12:
                return onTouch$12(this, view, motionEvent);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return onTouch$16(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS114S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 0) {
            AKM akm = (AKM) iDTListenerS114S0100000_4.l0;
            View view2 = akm.LIZLLL;
            if (view2 != null) {
                akm.LJI = ((AKF) view2.findViewById(R.id.h42)).LIZLLL(rawX, rawY);
            } else {
                o.LJIJI("root");
                throw null;
            }
        }
        AKM akm2 = (AKM) iDTListenerS114S0100000_4.l0;
        boolean z = false;
        if (!akm2.LJI) {
            int[] iArr = new int[2];
            View view3 = akm2.LIZLLL;
            if (view3 != null) {
                view3.getLocationOnScreen(iArr);
                z = true;
                motionEvent.offsetLocation(iArr[0], iArr[1]);
                Activity LJIJJ = C45804HyK.LJIJJ(((AKM) iDTListenerS114S0100000_4.l0).LIZ);
                if (LJIJJ != null) {
                    LJIJJ.dispatchTouchEvent(motionEvent);
                }
            } else {
                o.LJIJI("root");
                throw null;
            }
        }
        return z;
    }

    public static final boolean onTouch$1(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        boolean z;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 0) {
            AKR akr = (AKR) iDTListenerS114S0100000_4.l0;
            int[] iArr = new int[2];
            View view2 = akr.LJII;
            if (view2 != null) {
                view2.findViewById(R.id.btt).getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                View view3 = akr.LJII;
                if (view3 != null) {
                    int measuredWidth = view3.findViewById(R.id.btt).getMeasuredWidth() + i;
                    View view4 = akr.LJII;
                    if (view4 != null) {
                        int measuredHeight = view4.findViewById(R.id.btt).getMeasuredHeight() + i2;
                        if (i2 <= rawY && rawY <= measuredHeight && i <= rawX && rawX <= measuredWidth) {
                            z = true;
                        } else {
                            z = false;
                        }
                        akr.LJIIIIZZ = z;
                    } else {
                        o.LJIJI("root");
                        throw null;
                    }
                } else {
                    o.LJIJI("root");
                    throw null;
                }
            } else {
                o.LJIJI("root");
                throw null;
            }
        }
        AKR akr2 = (AKR) iDTListenerS114S0100000_4.l0;
        if (akr2.LJIIIIZZ) {
            return false;
        }
        int[] iArr2 = new int[2];
        View view5 = akr2.LJII;
        if (view5 != null) {
            view5.getLocationOnScreen(iArr2);
            motionEvent.offsetLocation(iArr2[0], iArr2[1]);
            AKR akr3 = (AKR) iDTListenerS114S0100000_4.l0;
            View view6 = akr3.LJI.LJLJLLL;
            if (view6 != null) {
                view6.dispatchTouchEvent(motionEvent);
                return true;
            }
            Activity LJIJJ = C45804HyK.LJIJJ(akr3.LJ);
            if (LJIJJ == null) {
                return true;
            }
            LJIJJ.dispatchTouchEvent(motionEvent);
            return true;
        }
        o.LJIJI("root");
        throw null;
    }

    public static final boolean onTouch$10(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        LinkAnchorAddActivity linkAnchorAddActivity = (LinkAnchorAddActivity) iDTListenerS114S0100000_4.l0;
        C9UE.LIZ(linkAnchorAddActivity, linkAnchorAddActivity._$_findCachedViewById(R.id.a2z));
        return true;
    }

    public static final boolean onTouch$11(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                ((ProfileAdvancedFeaturesCell) iDTListenerS114S0100000_4.l0).LJLJJI = false;
                view.performClick();
            }
        } else {
            ProfileAdvancedFeaturesCell profileAdvancedFeaturesCell = (ProfileAdvancedFeaturesCell) iDTListenerS114S0100000_4.l0;
            profileAdvancedFeaturesCell.LJLJJI = true;
            InterfaceC243979hp interfaceC243979hp = (InterfaceC243979hp) profileAdvancedFeaturesCell.LJLJJL.LIZ(profileAdvancedFeaturesCell, ProfileAdvancedFeaturesCell.LJLJJLL[0]);
            if (interfaceC243979hp != null) {
                interfaceC243979hp.sh((ProfileAdvancedFeaturesCell) iDTListenerS114S0100000_4.l0);
            }
        }
        return true;
    }

    public static final boolean onTouch$12(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        TuxTextView tuxTextView;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 3) {
                return false;
            }
            ProfileHeaderSignatureTranslationComponent profileHeaderSignatureTranslationComponent = (ProfileHeaderSignatureTranslationComponent) iDTListenerS114S0100000_4.l0;
            if (profileHeaderSignatureTranslationComponent.LJLLILLLL || (tuxTextView = profileHeaderSignatureTranslationComponent.LJLJL) == null) {
                return false;
            }
            tuxTextView.setTextColorRes(R.attr.go);
            return false;
        }
        TuxTextView tuxTextView2 = ((ProfileHeaderSignatureTranslationComponent) iDTListenerS114S0100000_4.l0).LJLJL;
        if (tuxTextView2 == null) {
            return false;
        }
        tuxTextView2.setTextColorRes(R.attr.gx);
        return false;
    }

    public static final boolean onTouch$13(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        CharSequence charSequence;
        if (motionEvent.getActionMasked() != 1) {
            return true;
        }
        Iterator<View> it = C78924UyG.LIZLLL(((ATD) iDTListenerS114S0100000_4.l0).LJLIL).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (!iDObjectS0S0101000.hasNext()) {
                return true;
            }
            View view2 = (View) iDObjectS0S0101000.next();
            Rect rect = new Rect();
            view2.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                TuxTextView tuxTextView = (TuxTextView) view2;
                CharSequence text = tuxTextView.getText();
                TuxTextView tuxTextView2 = ((ATD) iDTListenerS114S0100000_4.l0).LJLILLLLZI;
                if (tuxTextView2 != null) {
                    charSequence = tuxTextView2.getText();
                } else {
                    charSequence = null;
                }
                if (text.equals(charSequence)) {
                    return true;
                }
                ATD atd = (ATD) iDTListenerS114S0100000_4.l0;
                TuxTextView tuxTextView3 = atd.LJLILLLLZI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColor(atd.getContext().getResources().getColor(R.color.cu));
                }
                ATD atd2 = (ATD) iDTListenerS114S0100000_4.l0;
                atd2.LJLILLLLZI = tuxTextView;
                tuxTextView.setTextColor(atd2.getContext().getResources().getColor(R.color.ck));
                view2.setBackgroundColor(((ATD) iDTListenerS114S0100000_4.l0).getContext().getResources().getColor(R.color.ay));
                ASB asb = ((ATD) iDTListenerS114S0100000_4.l0).LJLJI;
                if (asb != null) {
                    asb.LIZIZ(view2);
                } else {
                    o.LJIJI("optionAction");
                    throw null;
                }
            }
        }
    }

    public static final boolean onTouch$14(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        C26045AKb c26045AKb = new C26045AKb((BaWelcomeMessageEditActivity) iDTListenerS114S0100000_4.l0);
        c26045AKb.LJIIIIZZ(R.string.tdb);
        c26045AKb.LJIIJ();
        return true;
    }

    public static final boolean onTouch$15(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C26045AKb c26045AKb = new C26045AKb((BaAutoReplyEditActivity) iDTListenerS114S0100000_4.l0);
            c26045AKb.LJIIIIZZ(R.string.tdb);
            c26045AKb.LJIIJ();
        }
        return true;
    }

    public static final boolean onTouch$16(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && ((PromptTextEditFragment) iDTListenerS114S0100000_4.l0).LJLJJI > 5) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 2 && ((PromptTextEditFragment) iDTListenerS114S0100000_4.l0).LJLJJI > 5) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                ((LandscapeVideoViewCell) iDTListenerS114S0100000_4.l0).LLJILLL.removeCallbacksAndMessages(null);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                LandscapeVideoViewCell landscapeVideoViewCell = (LandscapeVideoViewCell) iDTListenerS114S0100000_4.l0;
                landscapeVideoViewCell.LLJILLL.postDelayed(new ARunnableS40S0100000_4(landscapeVideoViewCell, 14), 3000L);
            }
        }
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        ((AddOrModifyKeywordFragment) iDTListenerS114S0100000_4.l0)._$_findCachedViewById(R.id.eno).clearFocus();
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        ((DistrictPage) iDTListenerS114S0100000_4.l0).LJLJJLL = false;
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        ((GestureDetector) iDTListenerS114S0100000_4.l0).onTouchEvent(motionEvent);
        return true;
    }

    public static final boolean onTouch$6(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 3) {
                return false;
            }
            MineProfileSignatureAssem mineProfileSignatureAssem = (MineProfileSignatureAssem) iDTListenerS114S0100000_4.l0;
            if (mineProfileSignatureAssem.LJLJLJ) {
                return false;
            }
            mineProfileSignatureAssem.K3();
            return false;
        }
        ((MineProfileSignatureAssem) iDTListenerS114S0100000_4.l0).L3();
        return false;
    }

    public static final boolean onTouch$7(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 3) {
                return false;
            }
            UserProfileSignatureAssem userProfileSignatureAssem = (UserProfileSignatureAssem) iDTListenerS114S0100000_4.l0;
            if (userProfileSignatureAssem.LJLJLJ) {
                return false;
            }
            userProfileSignatureAssem.K3();
            return false;
        }
        ((UserProfileSignatureAssem) iDTListenerS114S0100000_4.l0).L3();
        return false;
    }

    public static final boolean onTouch$8(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        T5T t5t = ((SeriesPostUIAssem) iDTListenerS114S0100000_4.l0).LJLIL;
        if (t5t != null) {
            t5t.clearFocus();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$9(IDTListenerS114S0100000_4 iDTListenerS114S0100000_4, View view, MotionEvent motionEvent) {
        T5T t5t;
        T5T t5t2 = ((SeriesPostUIAssem) iDTListenerS114S0100000_4.l0).LJLIL;
        if (t5t2 != null && t5t2.isFocused() && (t5t = ((SeriesPostUIAssem) iDTListenerS114S0100000_4.l0).LJLIL) != null) {
            t5t.clearFocus();
        }
        return false;
    }
}

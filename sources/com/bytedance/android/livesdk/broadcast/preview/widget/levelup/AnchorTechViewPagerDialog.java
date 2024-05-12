package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.AnonymousClass898;
import X.B83;
import X.BQP;
import X.BQQ;
import X.BQR;
import X.BZI;
import X.C06510Nj;
import X.C15380j0;
import X.C16880lQ;
import X.C23010vJ;
import X.C25600zU;
import X.C259710f;
import X.C28507BGt;
import X.C28787BRn;
import X.C29374Bfu;
import X.C2A7;
import X.C47261Igj;
import X.C80261Vej;
import X.InterfaceC30442Bx8;
import Y.ACListenerS25S0100000_5;
import Y.IDCSpanS31S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.AnchorLevelUpDialogCloseEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcaseAnchorOnboardGuideModeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class AnchorTechViewPagerDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLLL = 0;
    public View LJLIL;
    public ViewPager LJLILLLLZI;
    public BQR LJLJI;
    public C2A7 LJLJJI;
    public C2A7 LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public List<BQQ> LJLJLLL;
    public List<BQQ> LJLL;
    public boolean LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final int LJLJLJ = 1;
    public final String LJLLI = "sslocal";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cvr);
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LIZJ = R.style.aao;
        return c28507BGt;
    }

    public final void vl() {
        BZI LIZ = C28787BRn.LIZ("livesdk_get_full_live_experience_learn_page_show");
        LIZ.LJIIZILJ();
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        LIZ.LJIJJ(this.LJLJJLL, "enter_from");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJL + this.LJLJLJ), "page_index");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(AnchorLevelUpDialogCloseEvent.class, Boolean.TRUE);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_get_full_live_experience_learn_page_leave");
        LIZ.LJIIZILJ();
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        LIZ.LJIJJ(this.LJLJJLL, "enter_from");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJL + this.LJLJLJ), "page_index");
        LIZ.LJJIIJZLJL();
        super.onDismiss(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(new C25600zU(getContext(), C259710f.LIZ.LIZJ()));
        o.LJIIIIZZ(cloneInContext, "super.onGetLayoutInflate…ance().darkThemeOverlay))");
        return cloneInContext;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        List<BQQ> list;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setStatusBarColor(C15380j0.LIZIZ(R.color.ey));
        }
        this.LJLIL = view;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("ENTER_FROM_PARAM");
        } else {
            str = null;
        }
        this.LJLJJLL = str;
        BQQ bqq = new BQQ(R.string.kou, R.string.kot, "ttlive_internet_connection.png", "");
        BQQ bqq2 = new BQQ(R.string.kow, R.string.kov, "ttlive_good_use_of_lighting.png", "");
        BQQ bqq3 = new BQQ(R.string.koy, R.string.kox, "ttlive_raise_effects.png", "");
        BQQ bqq4 = new BQQ(R.string.kp0, R.string.koz, "ttlive_new_viewers_greet.png", "");
        BQQ bqq5 = new BQQ(R.string.kp2, R.string.kp1, "ttlive_share_your_live.png", "");
        this.LJLJLLL = C47261Igj.LJJIJIIJI(bqq, bqq2, bqq3, bqq4, bqq5);
        this.LJLL = C47261Igj.LJJIJIIJI(bqq3, bqq5, new BQQ(R.string.nkm, R.string.nkn, "ttlive_minor_safety.png", "minor"), new BQQ(R.string.nki, R.string.nkj, "ttlive_personal_data.png", "PII"), new BQQ(R.string.nkk, R.string.nkl, "ttlive_dangerous_driving_behavior.png", "dangerous_driving"));
        View view2 = this.LJLIL;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.a4j);
            o.LJIIIIZZ(findViewById, "rootView.findViewById<Vi…or_tech_image_view_pager)");
            this.LJLILLLLZI = (ViewPager) findViewById;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            if (LiveBroadcaseAnchorOnboardGuideModeSetting.INSTANCE.showMode1()) {
                list = this.LJLJLLL;
                if (list == null) {
                    o.LJIJI("mode1ItemDataList");
                    throw null;
                }
            } else {
                list = this.LJLL;
                if (list == null) {
                    o.LJIJI("mode2ItemDataList");
                    throw null;
                }
            }
            BQR bqr = new BQR(context, list);
            this.LJLJI = bqr;
            ViewPager viewPager = this.LJLILLLLZI;
            if (viewPager != null) {
                viewPager.setAdapter(bqr);
                View view3 = this.LJLIL;
                if (view3 != null) {
                    C80261Vej c80261Vej = (C80261Vej) view3.findViewById(R.id.bbq);
                    ViewPager viewPager2 = this.LJLILLLLZI;
                    if (viewPager2 != null) {
                        c80261Vej.setupWithViewPager(viewPager2);
                        ViewPager viewPager3 = this.LJLILLLLZI;
                        if (viewPager3 != null) {
                            viewPager3.addOnPageChangeListener(new BQP(this));
                            String downloadYourData = C15380j0.LJIILJJIL(R.string.nz6);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C15380j0.LJIILL(R.string.nkc, downloadYourData));
                            o.LJIIIIZZ(downloadYourData, "downloadYourData");
                            int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, downloadYourData, 0, false, 6);
                            int length = downloadYourData.length() + LJJLIIIJL;
                            spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(this, 7), LJJLIIIJL, length, 18);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.bc)), LJJLIIIJL, length, 18);
                            C23010vJ.LJFF(spannableStringBuilder, LJJLIIIJL, length, 18, 600);
                            ((TextView) _$_findCachedViewById(R.id.a4i)).setText(spannableStringBuilder);
                            ((TextView) _$_findCachedViewById(R.id.a4i)).setMovementMethod(AnonymousClass898.LIZ);
                            ViewPager viewPager4 = this.LJLILLLLZI;
                            if (viewPager4 != null) {
                                if (viewPager4.getAdapter() != null) {
                                    View view4 = this.LJLIL;
                                    if (view4 != null) {
                                        View findViewById2 = view4.findViewById(R.id.auv);
                                        o.LJIIIIZZ(findViewById2, "rootView.findViewById<LiveButton>(R.id.btn_back)");
                                        this.LJLJJI = (C2A7) findViewById2;
                                        View view5 = this.LJLIL;
                                        if (view5 != null) {
                                            View findViewById3 = view5.findViewById(R.id.axf);
                                            o.LJIIIIZZ(findViewById3, "rootView.findViewById<LiveButton>(R.id.btn_next)");
                                            this.LJLJJL = (C2A7) findViewById3;
                                            View view6 = this.LJLIL;
                                            if (view6 != null) {
                                                LiveIconView liveIconView = (LiveIconView) view6.findViewById(R.id.a4h);
                                                C2A7 c2a7 = this.LJLJJI;
                                                if (c2a7 != null) {
                                                    c2a7.setEnabled(false);
                                                    C2A7 c2a72 = this.LJLJJI;
                                                    if (c2a72 != null) {
                                                        C16880lQ.LJJIII(c2a72, new ACListenerS25S0100000_5(this, 296));
                                                        C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 297));
                                                        C2A7 c2a73 = this.LJLJJL;
                                                        if (c2a73 != null) {
                                                            C16880lQ.LJJIII(c2a73, new ACListenerS25S0100000_5(this, 298));
                                                        } else {
                                                            o.LJIJI("btnNext");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("btnBack");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("btnBack");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("rootView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("rootView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("rootView");
                                        throw null;
                                    }
                                }
                                Double LIZ = InterfaceC30442Bx8.x1.LIZ();
                                if (LIZ != null) {
                                    double doubleValue = LIZ.doubleValue();
                                    if (this.LJLJI != null) {
                                        if (doubleValue < r0.getCount()) {
                                            ViewPager viewPager5 = this.LJLILLLLZI;
                                            if (viewPager5 != null) {
                                                viewPager5.setCurrentItem((int) LIZ.doubleValue());
                                            } else {
                                                o.LJIJI("viewPager");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        o.LJIJI("adapter");
                                        throw null;
                                    }
                                }
                                DataChannel dataChannel = this.dataChannel;
                                if (dataChannel != null) {
                                    dataChannel.qv0(AnchorLevelUpDialogCloseEvent.class, Boolean.FALSE);
                                }
                                vl();
                                return;
                            }
                            o.LJIJI("viewPager");
                            throw null;
                        }
                        o.LJIJI("viewPager");
                        throw null;
                    }
                    o.LJIJI("viewPager");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }
}

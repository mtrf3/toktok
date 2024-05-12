package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BH7;
import X.C07810Sj;
import X.C07840Sm;
import X.C13760gO;
import X.C15380j0;
import X.C16880lQ;
import X.C1Q4;
import X.C259910h;
import X.C26338AVi;
import X.C279017q;
import X.C29306Beo;
import X.C32207CkV;
import X.C5H3;
import X.C78996UzQ;
import X.CCJ;
import X.InterfaceC31781Cdd;
import X.ViewOnClickListenerC28501BGn;
import Y.ACListenerS40S0200000_5;
import Y.IDCListenerS158S0200000_5;
import Y.IDObjectS178S0100000_5;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.LiveCoverControllerChannel;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewLiveDetailWidget extends PreviewWidget {
    public LiveEditText LJLJJI;
    public LiveIconView LJLJJL;
    public View LJLJJLL;
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 136));
    public String LJLJL = "";
    public long LJLJLJ = -1;
    public final IDObjectS178S0100000_5 LJLJLLL = new IDObjectS178S0100000_5(this, 0);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq8;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final ImageSpan LLF() {
        C1Q4 LIZLLL;
        BitmapDrawable bitmapDrawable;
        int i;
        boolean LIZ = CCJ.LIZ(this.context);
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        boolean LIZIZ = BH7.LIZIZ(dataChannel);
        if (LIZIZ) {
            LIZLLL = C259910h.LIZLLL(R.attr.aso, this.context);
            if (LIZLLL == null) {
                return null;
            }
            LIZLLL.setTint(C15380j0.LIZIZ(R.color.bc));
        } else {
            LIZLLL = C259910h.LIZLLL(R.attr.aus, this.context);
            if (LIZLLL == null) {
                return null;
            }
            LIZLLL.setTint(C15380j0.LIZIZ(R.color.be));
            LIZLLL.LIZLLL(0.6666667f);
        }
        if (LIZIZ) {
            if (LIZ) {
                C07840Sm.LIZJ(LIZLLL, 1);
                C07810Sj.LJ(LIZLLL, true);
            }
            LIZLLL.setBounds(0, 0, C15380j0.LIZ(12.0f), C15380j0.LIZ(12.0f));
        } else {
            LIZLLL.setBounds(0, 0, C15380j0.LIZ(24.0f), C15380j0.LIZ(16.0f));
        }
        if ((LIZLLL instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) LIZLLL) != null) {
            if (LIZ) {
                i = 3;
            } else {
                i = 5;
            }
            bitmapDrawable.setGravity(i);
        }
        if (LivePreviewComponentsSimplifyTypeSetting.INSTANCE.needShadowForTitle()) {
            float LIZ2 = C15380j0.LIZ(1.0f);
            LiveIconView liveIconView = this.LJLJJL;
            if (liveIconView != null) {
                int LIZIZ2 = C15380j0.LIZIZ(R.color.aap);
                liveIconView.LJLJLJ = LIZ2;
                liveIconView.LJLL = 0.0f;
                liveIconView.LJLLI = LIZ2;
                liveIconView.LJLJLLL = LIZIZ2;
                liveIconView.LIZJ();
            } else {
                o.LJIJI("editIcon");
                throw null;
            }
        }
        LiveIconView liveIconView2 = this.LJLJJL;
        if (liveIconView2 != null) {
            liveIconView2.setIcon(LIZLLL);
            return new C32207CkV(LIZLLL);
        }
        o.LJIJI("editIcon");
        throw null;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        this.dataChannel.ov0(this, PreviewTitleChannel.class, new AqS171S0100000_5(this, 175));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        Fragment fragment;
        BaseFragment baseFragment;
        super.LJZL();
        View findViewById = findViewById(R.id.las);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.title_view)");
        this.LJLJJI = (LiveEditText) findViewById;
        View findViewById2 = findViewById(R.id.cov);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.edit_icon)");
        this.LJLJJL = (LiveIconView) findViewById2;
        View findViewById3 = findViewById(R.id.l_h);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.title_click_mask)");
        this.LJLJJLL = findViewById3;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, PreviewHideKeyboardEvent.class, new AqS171S0100000_5(this, 176));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, LiveModeChannel.class, new AqS171S0100000_5(this, 177));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 178));
        }
        LivePreviewComponentsSimplifyTypeSetting livePreviewComponentsSimplifyTypeSetting = LivePreviewComponentsSimplifyTypeSetting.INSTANCE;
        if (livePreviewComponentsSimplifyTypeSetting.inExperiment()) {
            LiveIconView liveIconView = this.LJLJJL;
            if (liveIconView != null) {
                liveIconView.setVisibility(0);
                LLF();
                InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
                if (interfaceC31781Cdd != null) {
                    fragment = interfaceC31781Cdd.getFragment();
                } else {
                    fragment = null;
                }
                if ((fragment instanceof BaseFragment) && (baseFragment = (BaseFragment) fragment) != null && baseFragment.isViewValid()) {
                    ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn = new ViewOnClickListenerC28501BGn(getView(), baseFragment, this.dataChannel);
                    DataChannel dataChannel4 = this.dataChannel;
                    if (dataChannel4 != null) {
                        dataChannel4.rv0(LiveCoverControllerChannel.class, viewOnClickListenerC28501BGn);
                    }
                }
                if (livePreviewComponentsSimplifyTypeSetting.showFullLiveGoalBtn()) {
                    LiveEditText liveEditText = this.LJLJJI;
                    if (liveEditText != null) {
                        C26338AVi.LJI(liveEditText, Integer.valueOf(C15380j0.LIZ(12.0f)), 0, 0, 0, false, 16);
                    } else {
                        o.LJIJI("mTitleView");
                        throw null;
                    }
                }
                View view = this.LJLJJLL;
                if (view != null) {
                    C29306Beo.LJJJLL(view, 500L, new AqS171S0100000_5(this, 179));
                    LiveEditText liveEditText2 = this.LJLJJI;
                    if (liveEditText2 != null) {
                        liveEditText2.setMinHeight(0);
                        LiveEditText liveEditText3 = this.LJLJJI;
                        if (liveEditText3 != null) {
                            liveEditText3.setMaxLines(1);
                            if (livePreviewComponentsSimplifyTypeSetting.needShadowForTitle()) {
                                float LIZ = C15380j0.LIZ(1.0f);
                                LiveEditText liveEditText4 = this.LJLJJI;
                                if (liveEditText4 != null) {
                                    liveEditText4.setShadowLayer(LIZ, 0.0f, LIZ, C15380j0.LIZIZ(R.color.aap));
                                    return;
                                } else {
                                    o.LJIJI("mTitleView");
                                    throw null;
                                }
                            }
                            return;
                        }
                        o.LJIJI("mTitleView");
                        throw null;
                    }
                    o.LJIJI("mTitleView");
                    throw null;
                }
                o.LJIJI("mMask");
                throw null;
            }
            o.LJIJI("editIcon");
            throw null;
        }
        LiveEditText liveEditText5 = this.LJLJJI;
        if (liveEditText5 != null) {
            liveEditText5.setMinHeight(C15380j0.LIZ(70.0f));
            LiveEditText liveEditText6 = this.LJLJJI;
            if (liveEditText6 != null) {
                liveEditText6.setMaxLines(3);
                return;
            } else {
                o.LJIJI("mTitleView");
                throw null;
            }
        }
        o.LJIJI("mTitleView");
        throw null;
    }

    public final void LL(boolean z) {
        if (z) {
            LiveEditText liveEditText = this.LJLJJI;
            if (liveEditText != null) {
                liveEditText.setHint(R.string.lpq);
                return;
            } else {
                o.LJIJI("mTitleView");
                throw null;
            }
        }
        LiveEditText liveEditText2 = this.LJLJJI;
        if (liveEditText2 != null) {
            liveEditText2.setHint("");
        } else {
            o.LJIJI("mTitleView");
            throw null;
        }
    }

    public final void LLFF(String str) {
        C279017q.LJ("Title Receive: ", str, "SimplifySheet");
        if (str == null) {
            return;
        }
        LL(ujb.o.LJJJJJL(str));
        LiveEditText liveEditText = this.LJLJJI;
        if (liveEditText != null) {
            if (liveEditText.isFocused()) {
                LiveEditText liveEditText2 = this.LJLJJI;
                if (liveEditText2 != null) {
                    if (!TextUtils.isEmpty(String.valueOf(liveEditText2.getText()))) {
                        LiveEditText liveEditText3 = this.LJLJJI;
                        if (liveEditText3 != null) {
                            liveEditText3.setText(str);
                            return;
                        } else {
                            o.LJIJI("mTitleView");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("mTitleView");
                    throw null;
                }
            }
            SpannableString spannableString = new SpannableString(str);
            LiveEditText liveEditText4 = this.LJLJJI;
            if (liveEditText4 != null) {
                liveEditText4.setText(spannableString);
                return;
            } else {
                o.LJIJI("mTitleView");
                throw null;
            }
        }
        o.LJIJI("mTitleView");
        throw null;
    }

    public final void LLFFF(RoomCreateInfo roomCreateInfo, LiveMode liveMode) {
        String title;
        String str;
        LiveEditText liveEditText = this.LJLJJI;
        Context context = null;
        if (liveEditText != null) {
            liveEditText.setTextSize(1, 17.0f);
            if (BH7.LIZ(roomCreateInfo)) {
                title = roomCreateInfo.mLiveEventInfo.title;
            } else {
                title = "";
            }
            o.LJIIIIZZ(title, "title");
            if (title.length() > 0) {
                liveEditText.setClickable(false);
                liveEditText.setFocusable(false);
                liveEditText.setFocusableInTouchMode(false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                View view = getView();
                if (view != null) {
                    context = view.getContext();
                }
                if (CCJ.LIZ(context)) {
                    if (C13760gO.LIZLLL.LIZ(title.length(), title)) {
                        spannableStringBuilder.append((CharSequence) title).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                    } else {
                        spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) title);
                    }
                } else if (C13760gO.LIZJ.LIZ(title.length(), title)) {
                    spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) title);
                } else {
                    spannableStringBuilder.append((CharSequence) title).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                }
                liveEditText.setText(spannableStringBuilder);
                C16880lQ.LJJIIJ(liveEditText, new ACListenerS40S0200000_5(roomCreateInfo, this, 7));
                return;
            }
            liveEditText.setTextDirection(2);
            liveEditText.addTextChangedListener(this.LJLJLLL);
            liveEditText.setOnFocusChangeListener(new IDCListenerS158S0200000_5(this, liveEditText, 0));
            LL(true);
            if (liveMode == LiveMode.LIVE_VOICE && C29306Beo.LJIJJLI(roomCreateInfo.voiceTitle)) {
                str = roomCreateInfo.voiceTitle;
            } else {
                str = roomCreateInfo.mTitle;
            }
            LLFF(str);
            return;
        }
        o.LJIJI("mTitleView");
        throw null;
    }
}

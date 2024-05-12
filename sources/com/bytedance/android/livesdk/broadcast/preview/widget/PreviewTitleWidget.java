package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BH7;
import X.C13760gO;
import X.C16880lQ;
import X.C42398GkU;
import X.C5H3;
import X.C78934UyQ;
import X.C78996UzQ;
import X.CCJ;
import X.X1D;
import Y.ACListenerS40S0200000_5;
import Y.IDCListenerS158S0200000_5;
import Y.IDObjectS178S0100000_5;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivesdkPreviewCoverFixCombineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewTitleWidget extends PreviewWidget {
    public LiveEditText LJLJJI;
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 138));
    public String LJLJJL = "";
    public final IDObjectS178S0100000_5 LJLJJLL = new IDObjectS178S0100000_5(this, 1);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq6;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        String str;
        LiveMode liveMode;
        if (LivesdkPreviewCoverFixCombineSetting.INSTANCE.getValue()) {
            Map map = (Map) this.dataChannel.kv0(PreviewLiveModeTitleChannel.class);
            if (map != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || (liveMode = C78934UyQ.LJIL(dataChannel)) == null) {
                    liveMode = LiveMode.VIDEO;
                }
                str = (String) map.get(liveMode);
            } else {
                str = null;
            }
            LLFF(str);
        } else if (this.dataChannel.kv0(PreviewTitleChannel.class) != null) {
            LLFF((String) this.dataChannel.kv0(PreviewTitleChannel.class));
        }
        super.LJZ();
    }

    public final void LL() {
        LiveEditText liveEditText = this.LJLJJI;
        if (liveEditText != null) {
            liveEditText.setHint(R.string.k4m);
            LiveEditText liveEditText2 = this.LJLJJI;
            if (liveEditText2 != null) {
                CharSequence hint = liveEditText2.getHint();
                if (hint != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append((Object) hint);
                    LIZ.append(' ');
                    SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ));
                    spannableString.setSpan(LLF(), hint.length(), hint.length() + 1, 17);
                    LiveEditText liveEditText3 = this.LJLJJI;
                    if (liveEditText3 != null) {
                        liveEditText3.setHint(spannableString);
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

    public final ImageSpan LLF() {
        return (ImageSpan) this.LJLJI.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        LiveEditText liveEditText;
        super.LJZL();
        View view = getView();
        if (!(view instanceof LiveEditText) || (liveEditText = (LiveEditText) view) == null) {
            return;
        }
        this.LJLJJI = liveEditText;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, PreviewHideKeyboardEvent.class, new AqS171S0100000_5(this, 193));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, LiveModeChannel.class, new AqS171S0100000_5(this, 194));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 195));
        }
    }

    public final void LLFF(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (LivesdkPreviewCoverFixCombineSetting.INSTANCE.getValue()) {
                LiveEditText liveEditText = this.LJLJJI;
                if (liveEditText != null) {
                    liveEditText.setText("");
                    LL();
                    return;
                } else {
                    o.LJIJI("mTitleView");
                    throw null;
                }
            }
            return;
        }
        LiveEditText liveEditText2 = this.LJLJJI;
        if (liveEditText2 != null) {
            if (liveEditText2.isFocused()) {
                LiveEditText liveEditText3 = this.LJLJJI;
                if (liveEditText3 != null) {
                    if (!TextUtils.isEmpty(String.valueOf(liveEditText3.getText()))) {
                        LiveEditText liveEditText4 = this.LJLJJI;
                        if (liveEditText4 != null) {
                            liveEditText4.setText(str);
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
            SpannableString spannableString = new SpannableString(C42398GkU.LIZIZ(str, ' '));
            spannableString.setSpan(LLF(), str.length(), str.length() + 1, 17);
            LiveEditText liveEditText5 = this.LJLJJI;
            if (liveEditText5 != null) {
                liveEditText5.setText(spannableString);
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
        boolean z;
        LiveMode liveMode2;
        DataChannel dataChannel;
        Map map;
        LiveEditText liveEditText = this.LJLJJI;
        String str = null;
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
                z = true;
            } else {
                z = false;
            }
            if (z) {
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
                        spannableStringBuilder.setSpan(LLF(), title.length() + 1, title.length() + 2, 17);
                    } else {
                        spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) title);
                        spannableStringBuilder.setSpan(LLF(), 1, 2, 17);
                    }
                } else if (C13760gO.LIZJ.LIZ(title.length(), title)) {
                    spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) title);
                    spannableStringBuilder.setSpan(LLF(), 1, 2, 17);
                } else {
                    spannableStringBuilder.append((CharSequence) title).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                    spannableStringBuilder.setSpan(LLF(), title.length() + 1, title.length() + 2, 17);
                }
                liveEditText.setText(spannableStringBuilder);
                C16880lQ.LJJIIJ(liveEditText, new ACListenerS40S0200000_5(roomCreateInfo, this, 9));
                if (LivesdkPreviewCoverFixCombineSetting.INSTANCE.getValue() && (dataChannel = this.dataChannel) != null && (map = (Map) dataChannel.kv0(PreviewLiveModeTitleChannel.class)) != null) {
                    if (liveMode == null) {
                        liveMode = LiveMode.VIDEO;
                    }
                    map.put(liveMode, title);
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(PreviewTitleChannel.class, title);
                    return;
                }
                return;
            }
            liveEditText.setTextDirection(2);
            liveEditText.addTextChangedListener(this.LJLJJLL);
            liveEditText.setOnFocusChangeListener(new IDCListenerS158S0200000_5(this, liveEditText, 1));
            LL();
            Map map2 = (Map) this.dataChannel.kv0(PreviewLiveModeTitleChannel.class);
            if (map2 != null) {
                DataChannel dataChannel3 = this.dataChannel;
                if (dataChannel3 == null || (liveMode2 = C78934UyQ.LJIL(dataChannel3)) == null) {
                    liveMode2 = LiveMode.VIDEO;
                }
                str = (String) map2.get(liveMode2);
            }
            if (!LivesdkPreviewCoverFixCombineSetting.INSTANCE.getValue() || str == null) {
                if (liveMode == LiveMode.LIVE_VOICE) {
                    str = roomCreateInfo.voiceTitle;
                } else {
                    str = roomCreateInfo.mTitle;
                }
            }
            LLFF(str);
            return;
        }
        o.LJIJI("mTitleView");
        throw null;
    }
}

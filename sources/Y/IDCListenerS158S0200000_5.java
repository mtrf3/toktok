package Y;

import X.BZI;
import X.C0NB;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C51029K0z;
import X.C79057V0z;
import android.text.Editable;
import android.view.View;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewLiveDetailSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragmentSheet;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCListenerS158S0200000_5 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                return;
            case 1:
                onFocusChange$1(this, view, z);
                return;
            case 2:
                onFocusChange$2(this, view, z);
                return;
            case 3:
                onFocusChange$3(this, view, z);
                return;
            case 4:
                onFocusChange$4(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS158S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFocusChange$0(IDCListenerS158S0200000_5 iDCListenerS158S0200000_5, View view, boolean z) {
        LiveMode liveMode;
        LiveMode liveMode2;
        Boolean bool;
        LiveMode liveMode3;
        LiveMode liveMode4;
        String obj;
        boolean z2;
        boolean z3 = false;
        Boolean bool2 = null;
        if (z) {
            PreviewLiveDetailWidget previewLiveDetailWidget = (PreviewLiveDetailWidget) iDCListenerS158S0200000_5.l0;
            Editable text = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
            if (text != null) {
                if (text.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bool = Boolean.valueOf(z2);
            } else {
                bool = null;
            }
            boolean LJIILLIIL = C29306Beo.LJIILLIIL(bool);
            previewLiveDetailWidget.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_title_click");
            LIZ.LJIILLIIL(previewLiveDetailWidget.dataChannel);
            DataChannel dataChannel = previewLiveDetailWidget.dataChannel;
            if (dataChannel == null || (liveMode3 = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            LIZ.LJIJJ(C28509BGv.LIZ(liveMode3), "live_type");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LJIILLIIL)) ? 1 : 0), "is_customized");
            LIZ.LJJIIJZLJL();
            ((PreviewLiveDetailWidget) iDCListenerS158S0200000_5.l0).LJLJL = String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText());
            PreviewLiveDetailWidget previewLiveDetailWidget2 = (PreviewLiveDetailWidget) iDCListenerS158S0200000_5.l0;
            previewLiveDetailWidget2.getClass();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_title_click");
            LIZ2.LJIILLIIL(previewLiveDetailWidget2.dataChannel);
            LIZ2.LJIJJ("outside", "position");
            DataChannel dataChannel2 = previewLiveDetailWidget2.dataChannel;
            if (dataChannel2 == null || (liveMode4 = (LiveMode) dataChannel2.kv0(LiveModeChannel.class)) == null) {
                liveMode4 = LiveMode.VIDEO;
            }
            LIZ2.LJIJJ(C28509BGv.LIZ(liveMode4), "live_type");
            LIZ2.LJJIIJZLJL();
            PreviewLiveDetailWidget previewLiveDetailWidget3 = (PreviewLiveDetailWidget) iDCListenerS158S0200000_5.l0;
            LiveEditText liveEditText = previewLiveDetailWidget3.LJLJJI;
            if (liveEditText != null) {
                Editable text2 = liveEditText.getText();
                if (text2 != null && (obj = text2.toString()) != null && obj.length() > 0) {
                    LiveEditText liveEditText2 = previewLiveDetailWidget3.LJLJJI;
                    if (liveEditText2 != null) {
                        String substring = obj.substring(0, obj.length() - 1);
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        liveEditText2.setText(substring);
                        return;
                    }
                    o.LJIJI("mTitleView");
                    throw null;
                }
                return;
            }
            o.LJIJI("mTitleView");
            throw null;
        }
        ((PreviewLiveDetailWidget) iDCListenerS158S0200000_5.l0).LLFF(String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        PreviewLiveDetailWidget previewLiveDetailWidget4 = (PreviewLiveDetailWidget) iDCListenerS158S0200000_5.l0;
        boolean z4 = !o.LJ(previewLiveDetailWidget4.LJLJL, String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_takepage_title_submit");
        LIZ3.LJIILLIIL(previewLiveDetailWidget4.dataChannel);
        DataChannel dataChannel3 = previewLiveDetailWidget4.dataChannel;
        if (dataChannel3 == null || (liveMode = (LiveMode) dataChannel3.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ3.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ3.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z4)) ? 1 : 0), "is_revised");
        LIZ3.LJJIIJZLJL();
        Editable text3 = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
        if (text3 != null) {
            if (text3.length() == 0) {
                z3 = true;
            }
            bool2 = Boolean.valueOf(z3);
        }
        if (!C29306Beo.LJIILLIIL(bool2)) {
            return;
        }
        PreviewLiveDetailWidget previewLiveDetailWidget5 = (PreviewLiveDetailWidget) iDCListenerS158S0200000_5.l0;
        previewLiveDetailWidget5.getClass();
        BZI LIZ4 = C28787BRn.LIZ("livesdk_anchor_title_modify_over");
        LIZ4.LJIILLIIL(previewLiveDetailWidget5.dataChannel);
        DataChannel dataChannel4 = previewLiveDetailWidget5.dataChannel;
        if (dataChannel4 == null || (liveMode2 = (LiveMode) dataChannel4.kv0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        LIZ4.LJIJJ(C28509BGv.LIZ(liveMode2), "live_type");
        LIZ4.LJIJJ("outside", "position");
        LIZ4.LJJIIJZLJL();
    }

    public static final void onFocusChange$1(IDCListenerS158S0200000_5 iDCListenerS158S0200000_5, View view, boolean z) {
        LiveMode liveMode;
        LiveMode liveMode2;
        Boolean bool;
        LiveMode liveMode3;
        LiveMode liveMode4;
        String obj;
        boolean z2;
        boolean z3 = false;
        Boolean bool2 = null;
        if (z) {
            PreviewTitleWidget previewTitleWidget = (PreviewTitleWidget) iDCListenerS158S0200000_5.l0;
            Editable text = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
            if (text != null) {
                if (text.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bool = Boolean.valueOf(z2);
            } else {
                bool = null;
            }
            boolean LJIILLIIL = C29306Beo.LJIILLIIL(bool);
            previewTitleWidget.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_title_click");
            LIZ.LJIILLIIL(previewTitleWidget.dataChannel);
            DataChannel dataChannel = previewTitleWidget.dataChannel;
            if (dataChannel == null || (liveMode3 = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            LIZ.LJIJJ(C28509BGv.LIZ(liveMode3), "live_type");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LJIILLIIL)) ? 1 : 0), "is_customized");
            LIZ.LJJIIJZLJL();
            ((PreviewTitleWidget) iDCListenerS158S0200000_5.l0).LJLJJL = String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText());
            PreviewTitleWidget previewTitleWidget2 = (PreviewTitleWidget) iDCListenerS158S0200000_5.l0;
            previewTitleWidget2.getClass();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_title_click");
            LIZ2.LJIILLIIL(previewTitleWidget2.dataChannel);
            LIZ2.LJIJJ("outside", "position");
            DataChannel dataChannel2 = previewTitleWidget2.dataChannel;
            if (dataChannel2 == null || (liveMode4 = (LiveMode) dataChannel2.kv0(LiveModeChannel.class)) == null) {
                liveMode4 = LiveMode.VIDEO;
            }
            LIZ2.LJIJJ(C28509BGv.LIZ(liveMode4), "live_type");
            LIZ2.LJJIIJZLJL();
            PreviewTitleWidget previewTitleWidget3 = (PreviewTitleWidget) iDCListenerS158S0200000_5.l0;
            LiveEditText liveEditText = previewTitleWidget3.LJLJJI;
            if (liveEditText != null) {
                Editable text2 = liveEditText.getText();
                if (text2 != null && (obj = text2.toString()) != null && obj.length() > 0) {
                    LiveEditText liveEditText2 = previewTitleWidget3.LJLJJI;
                    if (liveEditText2 != null) {
                        String substring = obj.substring(0, obj.length() - 1);
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        liveEditText2.setText(substring);
                        return;
                    }
                    o.LJIJI("mTitleView");
                    throw null;
                }
                return;
            }
            o.LJIJI("mTitleView");
            throw null;
        }
        ((PreviewTitleWidget) iDCListenerS158S0200000_5.l0).LLFF(String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        PreviewTitleWidget previewTitleWidget4 = (PreviewTitleWidget) iDCListenerS158S0200000_5.l0;
        boolean z4 = !o.LJ(previewTitleWidget4.LJLJJL, String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_takepage_title_submit");
        LIZ3.LJIILLIIL(previewTitleWidget4.dataChannel);
        DataChannel dataChannel3 = previewTitleWidget4.dataChannel;
        if (dataChannel3 == null || (liveMode = (LiveMode) dataChannel3.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ3.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ3.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z4)) ? 1 : 0), "is_revised");
        LIZ3.LJJIIJZLJL();
        Editable text3 = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
        if (text3 != null) {
            if (text3.length() == 0) {
                z3 = true;
            }
            bool2 = Boolean.valueOf(z3);
        }
        if (!C29306Beo.LJIILLIIL(bool2)) {
            return;
        }
        PreviewTitleWidget previewTitleWidget5 = (PreviewTitleWidget) iDCListenerS158S0200000_5.l0;
        previewTitleWidget5.getClass();
        BZI LIZ4 = C28787BRn.LIZ("livesdk_anchor_title_modify_over");
        LIZ4.LJIILLIIL(previewTitleWidget5.dataChannel);
        DataChannel dataChannel4 = previewTitleWidget5.dataChannel;
        if (dataChannel4 == null || (liveMode2 = (LiveMode) dataChannel4.kv0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        LIZ4.LJIJJ(C28509BGv.LIZ(liveMode2), "live_type");
        LIZ4.LJIJJ("outside", "position");
        LIZ4.LJJIIJZLJL();
    }

    public static final void onFocusChange$2(IDCListenerS158S0200000_5 iDCListenerS158S0200000_5, View view, boolean z) {
        LiveMode liveMode;
        Editable text;
        Boolean bool;
        LiveMode liveMode2;
        LiveMode liveMode3;
        Editable text2;
        String obj;
        LiveEditText liveEditText;
        boolean z2;
        if (z) {
            C0NB.LIZIZ("Simplify", "get focus");
            ((PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0).getClass();
            PreviewLiveDetailSheet previewLiveDetailSheet = (PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0;
            Editable text3 = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
            if (text3 != null) {
                if (text3.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bool = Boolean.valueOf(z2);
            } else {
                bool = null;
            }
            boolean LJIILLIIL = C29306Beo.LJIILLIIL(bool);
            previewLiveDetailSheet.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_title_click");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(previewLiveDetailSheet));
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(previewLiveDetailSheet);
            if (LJIILIIL == null || (liveMode2 = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
                liveMode2 = LiveMode.VIDEO;
            }
            LIZ.LJIJJ(C28509BGv.LIZ(liveMode2), "live_type");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LJIILLIIL)) ? 1 : 0), "is_customized");
            LIZ.LJJIIJZLJL();
            ((PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0).LLI = String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText());
            PreviewLiveDetailSheet previewLiveDetailSheet2 = (PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0;
            previewLiveDetailSheet2.getClass();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_title_click");
            LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(previewLiveDetailSheet2));
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(previewLiveDetailSheet2);
            if (LJIILIIL2 == null || (liveMode3 = (LiveMode) LJIILIIL2.kv0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            LIZ2.LJIJJ(C28509BGv.LIZ(liveMode3), "live_type");
            LIZ2.LJIJJ("live_detail", "position");
            LIZ2.LJJIIJZLJL();
            PreviewLiveDetailSheet previewLiveDetailSheet3 = (PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0;
            LiveEditText liveEditText2 = previewLiveDetailSheet3.LLFF;
            if (liveEditText2 != null && (text2 = liveEditText2.getText()) != null && (obj = text2.toString()) != null && obj.length() > 0 && (liveEditText = previewLiveDetailSheet3.LLFF) != null) {
                String substring = obj.substring(0, obj.length() - 1);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                liveEditText.setText(substring);
                return;
            }
            return;
        }
        C0NB.LIZIZ("Simplify", "lose focus");
        LiveEditText liveEditText3 = ((PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0).LLFF;
        if (liveEditText3 != null && (text = liveEditText3.getText()) != null && (!ujb.o.LJJJJJL(text))) {
            ((PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0).getClass();
        }
        ((PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0).Nl(String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        PreviewLiveDetailSheet previewLiveDetailSheet4 = (PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0;
        boolean z3 = !o.LJ(previewLiveDetailSheet4.LLI, String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_takepage_title_submit");
        LIZ3.LJIILLIIL(C51029K0z.LJIILIIL(previewLiveDetailSheet4));
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(previewLiveDetailSheet4);
        if (LJIILIIL3 == null || (liveMode = (LiveMode) LJIILIIL3.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ3.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ3.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z3)) ? 1 : 0), "is_revised");
        LIZ3.LJJIIJZLJL();
        PreviewLiveDetailSheet previewLiveDetailSheet5 = (PreviewLiveDetailSheet) iDCListenerS158S0200000_5.l0;
        LiveEditText liveEditText4 = previewLiveDetailSheet5.LLFF;
        if (liveEditText4 == null) {
            return;
        }
        liveEditText4.clearFocus();
        C79057V0z.LJJIIJZLJL(previewLiveDetailSheet5.getContext(), liveEditText4);
    }

    public static final void onFocusChange$3(IDCListenerS158S0200000_5 iDCListenerS158S0200000_5, View view, boolean z) {
        LiveMode liveMode;
        LiveMode liveMode2;
        LiveMode liveMode3;
        LiveMode liveMode4;
        boolean z2 = false;
        Boolean bool = null;
        if (z) {
            PreviewTitleCoverFragment previewTitleCoverFragment = (PreviewTitleCoverFragment) iDCListenerS158S0200000_5.l0;
            Editable text = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
            if (text != null) {
                if (text.length() == 0) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            }
            boolean LJIILLIIL = C29306Beo.LJIILLIIL(bool);
            previewTitleCoverFragment.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_title_click");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(previewTitleCoverFragment));
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(previewTitleCoverFragment);
            if (LJIILIIL == null || (liveMode3 = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            LIZ.LJIJJ(C28509BGv.LIZ(liveMode3), "live_type");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LJIILLIIL)) ? 1 : 0), "is_customized");
            LIZ.LJJIIJZLJL();
            ((PreviewTitleCoverFragment) iDCListenerS158S0200000_5.l0).LJLJJI = String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText());
            PreviewTitleCoverFragment previewTitleCoverFragment2 = (PreviewTitleCoverFragment) iDCListenerS158S0200000_5.l0;
            previewTitleCoverFragment2.getClass();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_title_click");
            LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(previewTitleCoverFragment2));
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(previewTitleCoverFragment2);
            if (LJIILIIL2 == null || (liveMode4 = (LiveMode) LJIILIIL2.kv0(LiveModeChannel.class)) == null) {
                liveMode4 = LiveMode.VIDEO;
            }
            LIZ2.LJIJJ(C28509BGv.LIZ(liveMode4), "live_type");
            LIZ2.LJIJJ("settings", "position");
            LIZ2.LJJIIJZLJL();
            return;
        }
        ((PreviewTitleCoverFragment) iDCListenerS158S0200000_5.l0).vl(String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        PreviewTitleCoverFragment previewTitleCoverFragment3 = (PreviewTitleCoverFragment) iDCListenerS158S0200000_5.l0;
        boolean z3 = !o.LJ(previewTitleCoverFragment3.LJLJJI, String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_takepage_title_submit");
        LIZ3.LJIILLIIL(C51029K0z.LJIILIIL(previewTitleCoverFragment3));
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(previewTitleCoverFragment3);
        if (LJIILIIL3 == null || (liveMode = (LiveMode) LJIILIIL3.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ3.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ3.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z3)) ? 1 : 0), "is_revised");
        LIZ3.LJJIIJZLJL();
        Editable text2 = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
        if (text2 != null) {
            if (text2.length() == 0) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        }
        if (!C29306Beo.LJIILLIIL(bool)) {
            return;
        }
        PreviewTitleCoverFragment previewTitleCoverFragment4 = (PreviewTitleCoverFragment) iDCListenerS158S0200000_5.l0;
        previewTitleCoverFragment4.getClass();
        BZI LIZ4 = C28787BRn.LIZ("livesdk_anchor_title_modify_over");
        LIZ4.LJIILLIIL(C51029K0z.LJIILIIL(previewTitleCoverFragment4));
        DataChannel LJIILIIL4 = C51029K0z.LJIILIIL(previewTitleCoverFragment4);
        if (LJIILIIL4 == null || (liveMode2 = (LiveMode) LJIILIIL4.kv0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        LIZ4.LJIJJ(C28509BGv.LIZ(liveMode2), "live_type");
        LIZ4.LJIJJ("setting", "position");
        LIZ4.LJJIIJZLJL();
    }

    public static final void onFocusChange$4(IDCListenerS158S0200000_5 iDCListenerS158S0200000_5, View view, boolean z) {
        LiveMode liveMode;
        LiveMode liveMode2;
        LiveMode liveMode3;
        LiveMode liveMode4;
        boolean z2 = false;
        Boolean bool = null;
        if (z) {
            PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet = (PreviewTitleCoverFragmentSheet) iDCListenerS158S0200000_5.l0;
            Editable text = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
            if (text != null) {
                if (text.length() == 0) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            }
            boolean LJIILLIIL = C29306Beo.LJIILLIIL(bool);
            previewTitleCoverFragmentSheet.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_title_click");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(previewTitleCoverFragmentSheet));
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(previewTitleCoverFragmentSheet);
            if (LJIILIIL == null || (liveMode3 = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            LIZ.LJIJJ(C28509BGv.LIZ(liveMode3), "live_type");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LJIILLIIL)) ? 1 : 0), "is_customized");
            LIZ.LJJIIJZLJL();
            ((PreviewTitleCoverFragmentSheet) iDCListenerS158S0200000_5.l0).LLFF = String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText());
            PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet2 = (PreviewTitleCoverFragmentSheet) iDCListenerS158S0200000_5.l0;
            previewTitleCoverFragmentSheet2.getClass();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_title_click");
            LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(previewTitleCoverFragmentSheet2));
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(previewTitleCoverFragmentSheet2);
            if (LJIILIIL2 == null || (liveMode4 = (LiveMode) LJIILIIL2.kv0(LiveModeChannel.class)) == null) {
                liveMode4 = LiveMode.VIDEO;
            }
            LIZ2.LJIJJ(C28509BGv.LIZ(liveMode4), "live_type");
            LIZ2.LJIJJ("settings", "position");
            LIZ2.LJJIIJZLJL();
            return;
        }
        ((PreviewTitleCoverFragmentSheet) iDCListenerS158S0200000_5.l0).Ml(String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet3 = (PreviewTitleCoverFragmentSheet) iDCListenerS158S0200000_5.l0;
        boolean z3 = !o.LJ(previewTitleCoverFragmentSheet3.LLFF, String.valueOf(((LiveEditText) iDCListenerS158S0200000_5.l1).getText()));
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_takepage_title_submit");
        LIZ3.LJIILLIIL(C51029K0z.LJIILIIL(previewTitleCoverFragmentSheet3));
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(previewTitleCoverFragmentSheet3);
        if (LJIILIIL3 == null || (liveMode = (LiveMode) LJIILIIL3.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ3.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ3.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z3)) ? 1 : 0), "is_revised");
        LIZ3.LJJIIJZLJL();
        Editable text2 = ((LiveEditText) iDCListenerS158S0200000_5.l1).getText();
        if (text2 != null) {
            if (text2.length() == 0) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        }
        if (!C29306Beo.LJIILLIIL(bool)) {
            return;
        }
        PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet4 = (PreviewTitleCoverFragmentSheet) iDCListenerS158S0200000_5.l0;
        previewTitleCoverFragmentSheet4.getClass();
        BZI LIZ4 = C28787BRn.LIZ("livesdk_anchor_title_modify_over");
        LIZ4.LJIILLIIL(C51029K0z.LJIILIIL(previewTitleCoverFragmentSheet4));
        DataChannel LJIILIIL4 = C51029K0z.LJIILIIL(previewTitleCoverFragmentSheet4);
        if (LJIILIIL4 == null || (liveMode2 = (LiveMode) LJIILIIL4.kv0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        LIZ4.LJIJJ(C28509BGv.LIZ(liveMode2), "live_type");
        LIZ4.LJIJJ("setting", "position");
        LIZ4.LJJIIJZLJL();
    }
}

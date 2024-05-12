package X;

import Y.AfS2S2300000_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import Y.IDcS170S0100000_5;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectGuessCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectsRoundsChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessHasLoggedRoundEndChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameRoundChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameSessionChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartTimeChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionStartTimeChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.LiveEffectCommandChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessCurrentWordChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessAnchorSummaryDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessAudienceSummaryDialog;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveDrawGuessMaxRoundCountSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS60S1200000_5;
import kotlin.jvm.internal.AqS65S0400000_5;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BAF {
    public static final Interpolator LIZ;

    static {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.32f, 0.94f, 0.6f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(0.32f, 0.94f, 0.6f, 1f)");
        LIZ = LIZIZ;
    }

    public static String LIZLLL(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        if (i < 1000000) {
            return Q8U.LIZIZ(new Object[]{Float.valueOf((i * 1.0f) / 1000)}, 1, "%.1fk", "format(format, *args)");
        }
        if (i < 1000000000) {
            return Q8U.LIZIZ(new Object[]{Float.valueOf((i * 1.0f) / 1000000)}, 1, "%.1fm", "format(format, *args)");
        }
        return Q8U.LIZIZ(new Object[]{Float.valueOf((i * 1.0f) / 1000000000)}, 1, "%.1fb", "format(format, *args)");
    }

    public static boolean LJFF(DataChannel dataChannel) {
        Boolean bool;
        Long LJJ = LJJ(dataChannel);
        if (LJJ == null || LJJ.longValue() <= 0) {
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.kv0(DrawGuessIsCountingDownRoundStart.class);
            } else {
                bool = null;
            }
            if (!C29306Beo.LJJIFFI(bool) && !C0GA.LIZIZ(dataChannel)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIIIZZ(DataChannel dataChannel) {
        int value;
        int i;
        if (dataChannel == null || (value = LiveDrawGuessMaxRoundCountSetting.INSTANCE.getValue()) == 0) {
            return false;
        }
        Integer num = (Integer) dataChannel.kv0(DrawGuessRoundCountChannel.class);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (i < value) {
            return false;
        }
        return true;
    }

    public static void LJIIL(DataChannel dataChannel) {
        if (C29306Beo.LJIIJ(dataChannel)) {
            BAI.LIZLLL(dataChannel, "");
        } else {
            BAI.LJ(dataChannel, false);
        }
        if (dataChannel != null) {
            dataChannel.rv0(DrawGuessFreelyStartChannel.class, Boolean.FALSE);
            dataChannel.rv0(DrawGuessSessionIdChannel.class, 0L);
        }
    }

    public static void LJIIZILJ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        if (C29306Beo.LJIIL(dataChannel) && C29306Beo.LJJIFFI((Boolean) dataChannel.kv0(DrawGuessInGameRoundChannel.class))) {
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).uw(dataChannel, false);
        }
        dataChannel.rv0(DrawGuessInGameRoundChannel.class, Boolean.FALSE);
        dataChannel.pv0(DrawGuessRoundEndEvent.class);
    }

    public static Long LJIJJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Long) dataChannel.kv0(DrawGuessRoundIdChannel.class);
        }
        return null;
    }

    public static void LJIJJLI(DataChannel dataChannel) {
        Integer num;
        int LIZIZ = C15380j0.LIZIZ(R.color.a3n);
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(C28397BCn.class)) != null) {
            LIZIZ = num.intValue();
        }
        int red = Color.red(LIZIZ);
        int green = Color.green(LIZIZ);
        int blue = Color.blue(LIZIZ);
        StringBuilder LIZJ = C06460Ne.LIZJ("{\"r\":", red, ",\"g\":", green, ",\"b\":");
        String LIZJ2 = b0.LIZJ(LIZJ, blue, '}', LIZJ);
        if (dataChannel != null) {
            dataChannel.rv0(LiveEffectCommandChannel.class, LIZ(3, LIZJ2));
        }
    }

    public static void LJIL(DataChannel dataChannel) {
        Long LJIJJ = LJIJJ(dataChannel);
        if (LJIJJ != null) {
            long longValue = LJIJJ.longValue();
            if (dataChannel != null) {
                dataChannel.rv0(LiveEffectCommandChannel.class, LIZ(4, String.valueOf(longValue)));
            }
        }
    }

    public static Long LJJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Long) dataChannel.kv0(DrawGuessSessionIdChannel.class);
        }
        return null;
    }

    public static OSZ LIZ(int i, String str) {
        return new OSZ(46, new OSJ(Integer.valueOf(i), 0, str));
    }

    public static boolean LJI(Fragment fragment, InterfaceC88472Yns dialogActionCallback) {
        boolean z;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dialogActionCallback, "dialogActionCallback");
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService.OB() || iInteractService.ZR()) {
            z = true;
        } else {
            z = false;
        }
        if (C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(z), new AqS152S0200000_5(fragment, (Fragment) dialogActionCallback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 15)) || C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).Hu0()), new AqS152S0200000_5(fragment, (Fragment) dialogActionCallback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 16))) {
            return true;
        }
        IInteractService iInteractService2 = (IInteractService) CN1.LIZ(IInteractService.class);
        if (C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(iInteractService2.Zs0()), new AqS94S0300000_5(iInteractService2, (IInteractService) dialogActionCallback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) fragment, (Fragment) 12))) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(DataChannel dataChannel, boolean z) {
        if (dataChannel != null) {
            dataChannel.rv0(DrawGuessFreelyStartChannel.class, Boolean.TRUE);
            dataChannel.rv0(DrawGuessSessionStartTimeChannel.class, Long.valueOf(SystemClock.uptimeMillis()));
        }
        if (C29306Beo.LJIIJ(dataChannel)) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_start");
            LIZ2.LJIILLIIL(dataChannel);
            BAI.LIZ(LIZ2);
            LIZ2.LJIJJ("freely", "type");
            LIZ2.LJJIIJZLJL();
            return;
        }
        BZI LIZ3 = C28787BRn.LIZ("livesdk_audience_pictionary_start");
        LIZ3.LJIILLIIL(dataChannel);
        BAI.LIZ(LIZ3);
        LIZ3.LJIJJ("freely", "type");
        LIZ3.LJIJJ(String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "after_start");
        LIZ3.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIILL(DataChannel dataChannel, List list) {
        Boolean bool;
        DialogFragment drawGuessAudienceSummaryDialog;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(PIPStatusData.class);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            if (dataChannel != null) {
                ((C32537Cpp) dataChannel.gv0(C28384BCa.class)).LIZ = list;
            }
        } else if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C28384BCa.class)).LIZ = null;
            ((C32537Cpp) dataChannel.gv0(C28385BCb.class)).LIZ = list;
            FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
            if (fragmentManager == null) {
                return;
            }
            if (C29306Beo.LJIIJ(dataChannel)) {
                drawGuessAudienceSummaryDialog = new DrawGuessAnchorSummaryDialog();
            } else {
                drawGuessAudienceSummaryDialog = new DrawGuessAudienceSummaryDialog();
            }
            drawGuessAudienceSummaryDialog.show(fragmentManager, "DrawGuessUtil");
        }
    }

    public static void LJJIFFI(BaseFragment baseFragment, InterfaceC88472Yns onResult) {
        DataChannel LJIILIIL;
        o.LJIIIZ(onResult, "onResult");
        if (baseFragment == null || !baseFragment.isViewValid() || (LJIILIIL = C51029K0z.LJIILIIL(baseFragment)) == null) {
            return;
        }
        AqS136S0200000_5 aqS136S0200000_5 = new AqS136S0200000_5(baseFragment, (BaseFragment) onResult, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 29);
        if (!LJI(baseFragment, aqS136S0200000_5) && !LJ(baseFragment, LJIILIIL, aqS136S0200000_5) && !C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(C1I.LIZJ), new AqS94S0300000_5((Fragment) baseFragment, (Fragment) LJIILIIL, (DataChannel) aqS136S0200000_5, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 13)) && !LJII(baseFragment, LJIILIIL, aqS136S0200000_5)) {
            onResult.invoke(Boolean.TRUE);
        }
    }

    public static void LJJII(long j, DataChannel dataChannel) {
        Long LJIJJ;
        if (dataChannel != null && (LJIJJ = LJIJJ(dataChannel)) != null) {
            long longValue = LJIJJ.longValue();
            HashMap hashMap = (HashMap) dataChannel.kv0(DrawGuessCorrectGuessCountChannel.class);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(Long.valueOf(longValue), Long.valueOf(j));
            dataChannel.rv0(DrawGuessCorrectGuessCountChannel.class, hashMap);
        }
    }

    public static boolean LJ(Fragment fragment, DataChannel dataChannel, InterfaceC88472Yns dialogActionCallback) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dialogActionCallback, "dialogActionCallback");
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper().getClass();
        o.LJIIIIZZ(C12890ez.LIZ().LIZ(C0TY.LIZIZ), "LiveComposerManagerProvi…cker(EffectPanel.STICKER)");
        boolean z = true;
        if (!(!r1.isEmpty())) {
            o.LJIIIIZZ(C12890ez.LIZ().LIZ("livebackground"), "LiveComposerManagerProvi…el.LIVE_BACKGROUND_PANEL)");
            if (!(!r1.isEmpty())) {
                z = false;
            }
        }
        return C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(z), new AqS94S0300000_5(fragment, (Fragment) dataChannel, (DataChannel) dialogActionCallback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 10));
    }

    public static boolean LJII(Fragment fragment, DataChannel dataChannel, InterfaceC88472Yns dialogActionCallback) {
        Boolean bool;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dialogActionCallback, "dialogActionCallback");
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(QuestionCardVisibilityEvent.class);
        } else {
            bool = null;
        }
        return C29306Beo.LJJLIIIJLJLI(bool, new AqS94S0300000_5(fragment, (Fragment) dataChannel, (DataChannel) dialogActionCallback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 11));
    }

    public static boolean LJIIIZ(Context context, DataChannel dataChannel, InterfaceC65784Pro interfaceC65784Pro) {
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        return C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(iInteractService.Hu0()), new AqS65S0400000_5(dataChannel, (DataChannel) context, (Context) iInteractService, (IInteractService) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1));
    }

    public static void LJIILJJIL(DataChannel dataChannel, String exitReason, boolean z) {
        Long LJJ;
        o.LJIIIZ(exitReason, "exitReason");
        if (dataChannel != null && (LJJ = LJJ(dataChannel)) != null) {
            if (LJJ.longValue() == 0 && !z) {
                return;
            }
            if (C29306Beo.LJIIL(dataChannel)) {
                C0GA.LIZLLL(dataChannel, false);
            } else {
                ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper();
                C1XG.LIZJ();
                BAI.LIZLLL(dataChannel, exitReason);
            }
            dataChannel.rv0(DrawGuessSessionIdChannel.class, 0L);
            dataChannel.rv0(DrawGuessRoundIdChannel.class, 0L);
            dataChannel.rv0(DrawGuessCurrentWordChannel.class, null);
            dataChannel.rv0(DrawGuessRoundCountChannel.class, 0);
            Boolean bool = Boolean.FALSE;
            dataChannel.rv0(DrawGuessInGameSessionChannel.class, bool);
            dataChannel.rv0(DrawGuessInGameRoundChannel.class, bool);
            dataChannel.pv0(DrawGuessExitGameEvent.class);
            dataChannel.rv0(DrawGuessCorrectsRoundsChannel.class, null);
            dataChannel.rv0(DrawGuessRoundStartTimeChannel.class, null);
            dataChannel.rv0(DrawGuessCorrectGuessCountChannel.class, new HashMap());
            dataChannel.rv0(DrawGuessHasLoggedRoundEndChannel.class, bool);
        }
    }

    public static void LJIILLIIL(long j, DataChannel dataChannel, String word) {
        HashMap hashMap;
        o.LJIIIZ(word, "word");
        if (dataChannel == null || (hashMap = (HashMap) dataChannel.kv0(DrawGuessCorrectsRoundsChannel.class)) == null) {
            hashMap = new HashMap();
        }
        hashMap.put(Long.valueOf(j), word);
        if (dataChannel != null) {
            dataChannel.rv0(DrawGuessCorrectsRoundsChannel.class, hashMap);
        }
    }

    public static void LJIJI(Fragment fragment, DataChannel dataChannel, Long l) {
        o.LJIIIZ(fragment, "fragment");
        if (l != null) {
            l.longValue();
            C1EW.LIZ(((DrawGuessApi) C1A.LIZJ(DrawGuessApi.class)).getSummaryData(C29306Beo.LJJIZ(dataChannel), l.longValue())).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new AfS57S0100000_5(dataChannel, 204), C28281B8b.LJLIL);
        }
    }

    public static void LJIIJ(DataChannel dataChannel, String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "livesdk_draw_function_conflict_popup_show";
        } else {
            str3 = "livesdk_draw_function_conflict_toast_show";
        }
        BZI LIZ2 = C28787BRn.LIZ(str3);
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "function_type");
        LIZ2.LJIJJ(str2, "click_position");
        LIZ2.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, O] */
    public static void LIZIZ(Fragment fragment, int i, String endReason, String imageUri, InterfaceC65784Pro callback) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(endReason, "endReason");
        o.LJIIIZ(imageUri, "imageUri");
        o.LJIIIZ(callback, "callback");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(fragment);
        if (LJIILIIL == null) {
            callback.invoke();
            return;
        }
        Long LJIJJ = LJIJJ(LJIILIIL);
        if (LJIJJ != null) {
            long longValue = LJIJJ.longValue();
            Long l = (Long) LJIILIIL.kv0(C28398BCo.class);
            if ((l != null && l.longValue() == longValue) || longValue == 0) {
                callback.invoke();
                return;
            }
            ((C32537Cpp) LJIILIIL.gv0(C28398BCo.class)).LIZ = Long.valueOf(longValue);
            if (i != 4) {
                ((C32537Cpp) LJIILIIL.gv0(BCZ.class)).LIZ = Boolean.FALSE;
            }
            C1EW.LIZ(((DrawGuessApi) C1A.LIZJ(DrawGuessApi.class)).endDrawGuessGameRound(C29306Beo.LJJIZ(LJIILIIL), longValue, imageUri, i)).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new BAH(i, LJIILIIL, endReason, callback), new AfS54S0200000_5(LJIILIIL, callback, 30));
            return;
        }
        callback.invoke();
    }

    public static void LJIJ(long j, long j2, DrawGuessWord word, DataChannel dataChannel, boolean z) {
        long j3;
        boolean z2;
        Object obj;
        boolean z3;
        if (dataChannel == null) {
            return;
        }
        dataChannel.rv0(DrawGuessHasLoggedRoundEndChannel.class, Boolean.FALSE);
        Long LJJ = LJJ(dataChannel);
        if (LJJ != null) {
            j3 = LJJ.longValue();
        } else {
            j3 = 0;
        }
        int i = 0;
        if (j3 <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object obj2 = Boolean.TRUE;
        dataChannel.rv0(DrawGuessInGameSessionChannel.class, obj2);
        if (C29306Beo.LJIIJ(dataChannel)) {
            if (z2) {
                dataChannel.pv0(DrawGuessStartGameEvent.class);
            }
            o.LJIIIZ(word, "word");
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_round_start");
            LIZ2.LJIILLIIL(dataChannel);
            BAI.LIZ(LIZ2);
            C06530Nl.LIZLLL(LIZ2, BAI.LIZ, "enter_from", j2, "pictionary_session_id");
            LIZ2.LJIJJ(Long.valueOf(j), "pictionary_id");
            if (word.id <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z3)) ? 1 : 0), "is_customized");
            LIZ2.LJIJJ(word.word, "word");
            LIZ2.LJJIIJZLJL();
        } else {
            String str = "1";
            if (z2 || z) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_audience_pictionary_start");
                LIZ3.LJIILLIIL(dataChannel);
                BAI.LIZ(LIZ3);
                LIZ3.LJIJJ("draw_and_guess", "type");
                LIZ3.LJIJJ(Long.valueOf(j2), "pictionary_session_id");
                if (z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ3.LJIJJ(obj, "after_start");
                LIZ3.LJJIIJZLJL();
            }
            BZI LIZ4 = C28787BRn.LIZ("livesdk_audience_pictionary_round_start");
            LIZ4.LJIILLIIL(dataChannel);
            BAI.LIZ(LIZ4);
            LIZ4.LJIJJ(Long.valueOf(j2), "pictionary_session_id");
            LIZ4.LJIJJ(Long.valueOf(j), "pictionary_id");
            if (!z) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ4.LJIJJ(str, "after_start");
            LIZ4.LJJIIJZLJL();
        }
        if (z2) {
            dataChannel.rv0(DrawGuessSessionStartTimeChannel.class, Long.valueOf(SystemClock.uptimeMillis()));
            dataChannel.rv0(DrawGuessSessionIdChannel.class, Long.valueOf(j2));
        }
        dataChannel.rv0(DrawGuessRoundIdChannel.class, Long.valueOf(j));
        dataChannel.rv0(DrawGuessCurrentWordChannel.class, word);
        Integer num = (Integer) dataChannel.kv0(DrawGuessRoundCountChannel.class);
        if (num != null) {
            i = num.intValue();
        }
        dataChannel.rv0(DrawGuessRoundCountChannel.class, Integer.valueOf(i + 1));
        HashMap hashMap = (HashMap) dataChannel.kv0(DrawGuessRoundStartTimeChannel.class);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        hashMap.put(Long.valueOf(j), Long.valueOf(SystemClock.uptimeMillis()));
        dataChannel.rv0(DrawGuessRoundStartTimeChannel.class, hashMap);
        dataChannel.pv0(DrawGuessRoundStartEvent.class);
        dataChannel.rv0(DrawGuessInGameRoundChannel.class, obj2);
    }

    public static void LIZJ(Fragment fragment, DataChannel dataChannel, String uri, String str, String str2, InterfaceC65784Pro interfaceC65784Pro) {
        Long l;
        long j;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(uri, "uri");
        if (dataChannel != null && (l = (Long) dataChannel.kv0(DrawGuessSessionIdChannel.class)) != null) {
            long longValue = l.longValue();
            DrawGuessApi drawGuessApi = (DrawGuessApi) C1A.LIZJ(DrawGuessApi.class);
            long LJJIZ = C29306Beo.LJJIZ(dataChannel);
            Long LJIJJ = LJIJJ(dataChannel);
            if (LJIJJ != null) {
                j = LJIJJ.longValue();
            } else {
                j = 0;
            }
            C1EW.LIZ(drawGuessApi.exitDrawGuessGame(LJJIZ, longValue, j, uri)).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new AfS2S2300000_5(interfaceC65784Pro, fragment, dataChannel, str, str2, 0), new AfS57S0100000_5(interfaceC65784Pro, 203));
        }
    }

    public static void LJJI(Context context, DataChannel dataChannel, int i, int i2, int i3, AqS60S1200000_5 aqS60S1200000_5, AqS60S1200000_5 aqS60S1200000_52) {
        LifecycleOwner lifecycleOwner;
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILLIIL(i);
        c47071t1.LJFF(i2);
        if (dataChannel != null) {
            lifecycleOwner = dataChannel.LJLJJI;
        } else {
            lifecycleOwner = null;
        }
        c47071t1.LIZIZ = lifecycleOwner;
        c47071t1.LJIIIZ(R.string.ks4, new IDcS170S0100000_5(aqS60S1200000_5, 20));
        c47071t1.LJIIL(i3, new IDcS170S0100000_5(aqS60S1200000_52, 21));
        LiveDialog LIZ2 = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "4115071473085874036")).LIZ) {
            return;
        }
        LIZ2.show();
    }
}

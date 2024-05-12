package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewParent;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.TextBadge;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import com.bytedance.android.livesdk.chatroom.interact.model.RandomLinkMicExtra;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.SuggestedDefinitionByAutoSpeedDetection;
import com.bytedance.android.livesdk.dataChannel.SuggestedDefinitionByManuallySpeedDetection;
import com.bytedance.android.livesdk.livesetting.barrage.TtliveEnablePreparationPageSpeedtestOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastSpeedDetectionSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastTTPSpeedDetectionSwitcherSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.sdk.xbridge.registry.core.model.idl.IDLXDynamic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UXp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77357UXp implements InterfaceC77358UXq, InterfaceC73786Sxa {
    public static final C77357UXp LJLIL = new C77357UXp();

    public static void LJIIJ() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public static void LJJII() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public static final boolean LJJIII() {
        if (GameLiveBroadcastSpeedDetectionSwitcherSetting.INSTANCE.isEnable() || GameLiveBroadcastTTPSpeedDetectionSwitcherSetting.INSTANCE.isEnable()) {
            return true;
        }
        return false;
    }

    public static final String LJIJI() {
        String str = "";
        if (!LJJIII()) {
            return "";
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        String str2 = (String) dataChannelGlobal.mv0(SuggestedDefinitionByManuallySpeedDetection.class);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) dataChannelGlobal.mv0(SuggestedDefinitionByAutoSpeedDetection.class);
        if (str3 == null) {
            str3 = "";
        }
        if (!TtliveEnablePreparationPageSpeedtestOptimizeSetting.INSTANCE.isExperimentGroup() && C29306Beo.LJIJJLI(str3)) {
            str = str3;
        }
        if (!C29306Beo.LJIJJLI(str2)) {
            str2 = str;
        }
        if (C30922CBq.LIZIZ) {
            FP1.LJFF("suggested definition=", str2, "SpeedDetectionHelper");
        }
        return str2;
    }

    public static boolean LJJIIJZLJL() {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZI() {
        if (!LJJIII() || !LJJIII() || !C29306Beo.LJIJJLI((CharSequence) DataChannelGlobal.LJLJJI.mv0(C29041BaX.class)) || !C29306Beo.LJIJJLI((CharSequence) DataChannelGlobal.LJLJJI.mv0(SuggestedDefinitionByAutoSpeedDetection.class))) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ() {
        if (!LJJIII() || !LJJIII() || !C29306Beo.LJIJJLI((CharSequence) DataChannelGlobal.LJLJJI.mv0(C29041BaX.class)) || !C29306Beo.LJIJJLI((CharSequence) DataChannelGlobal.LJLJJI.mv0(SuggestedDefinitionByManuallySpeedDetection.class))) {
            return false;
        }
        return true;
    }

    public static void LJFF(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static final java.util.Map LJIIIIZZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        return C113554cx.LJJL(new OSZ("shoot_way", model.mShootWay), new OSZ("creation_id", model.getCreationId()), new OSZ("content_source", H7R.LJIIIIZZ(model)));
    }

    public static final String LJIIIZ(OSZ osz) {
        StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
        StringBuilder sb = new StringBuilder("[ ");
        o.LJIIIIZZ(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : C61898ORa.LJIILL(stackTrace).subList(((Number) osz.getFirst()).intValue() + 1, ((Number) osz.getSecond()).intValue() + 2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('(');
            LIZ.append(stackTraceElement.getFileName());
            LIZ.append(':');
            LIZ.append(stackTraceElement.getLineNumber());
            LIZ.append("), ");
            sb.append(X1D.LIZIZ(LIZ));
        }
        return C0EH.LIZJ(sb, "]", "result.append(\"]\").toString()");
    }

    public static final List LJIIL(ActivityC45651qj activityC45651qj) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(activityC45651qj, "<this>");
        AssemSupervisor lv0 = C7EG.LIZ(activityC45651qj).lv0(activityC45651qj);
        if (lv0 != null && (copyOnWriteArrayList = lv0.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC55372LoG) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final String LJIILIIL(NLETrack getAudioType) {
        Object LIZ;
        o.LJIIIZ(getAudioType, "$this$getAudioType");
        Object obj = null;
        if (!getAudioType.hasExtra("AudioTrackType")) {
            return null;
        }
        try {
            LIZ = getAudioType.getExtra("AudioTrackType");
            if (LIZ == null) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static final String LJIILJJIL(NLETrackSlot nLETrackSlot) {
        Object LIZ;
        Object obj = null;
        if (!nLETrackSlot.hasExtra("AudioTrackType")) {
            return null;
        }
        try {
            LIZ = nLETrackSlot.getExtra("AudioTrackType");
            if (LIZ == null) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static final String LJIILL(NLETrack nLETrack) {
        Object LIZ;
        Object obj = null;
        if (!nLETrack.hasExtra("business")) {
            return null;
        }
        try {
            LIZ = nLETrack.getExtra("business");
            if (LIZ == null) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static final String LJIILLIIL(NLETrack nLETrack) {
        Object LIZ;
        Object obj = null;
        if (!nLETrack.hasExtra("EffectTrackType")) {
            return null;
        }
        try {
            LIZ = nLETrack.getExtra("EffectTrackType");
            if (LIZ == null) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static final String LJIIZILJ(NLETrack nLETrack) {
        Object LIZ;
        Object obj = null;
        if (!nLETrack.hasExtra("FilterTrackType")) {
            return null;
        }
        try {
            LIZ = nLETrack.getExtra("FilterTrackType");
            if (LIZ == null) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static final int LJIJ(User user) {
        if (user != null) {
            Integer valueOf = Integer.valueOf(user.getFollowStatus());
            Integer valueOf2 = Integer.valueOf(user.getFollowerStatus());
            if (valueOf != null) {
                if (valueOf.intValue() == 2) {
                    return 2;
                }
                if (valueOf.intValue() == 1) {
                    return 1;
                }
                if (valueOf2 == null || valueOf2.intValue() != 1) {
                    return 0;
                }
                return 3;
            }
        }
        return -1;
    }

    public static final RandomLinkMicExtra LJIJJ(AutoMatchResp.ResponseData responseData) {
        RandomLinkMicExtra extra = (RandomLinkMicExtra) GsonProtectorUtils.fromJson(C09650Zl.LIZJ, responseData.settings, RandomLinkMicExtra.class);
        if (extra == null || extra.expectMatchTime <= 0 || extra.timeoutTime <= 0 || extra.roundTime <= 0) {
            RandomLinkMicExtra randomLinkMicExtra = new RandomLinkMicExtra();
            randomLinkMicExtra.expectMatchTime = 16;
            randomLinkMicExtra.timeoutTime = 180;
            randomLinkMicExtra.roundTime = 4;
            return randomLinkMicExtra;
        }
        o.LJIIIIZZ(extra, "extra");
        return extra;
    }

    public static final int LJIJJLI(PowerCell powerCell) {
        List<InterfaceC57784Mm4> list;
        SYL syl;
        C72808Sho<InterfaceC57784Mm4> state;
        o.LJIIIZ(powerCell, "<this>");
        ViewParent parent = powerCell.itemView.getParent();
        if ((parent instanceof SYL) && (syl = (SYL) parent) != null && (state = syl.getState()) != null) {
            list = state.LJII();
        } else {
            list = null;
        }
        int i = 0;
        if (list != null) {
            int i2 = 0;
            for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC57784Mm4 interfaceC57784Mm42 = interfaceC57784Mm4;
                    if (i2 < powerCell.getBindingAdapterPosition() && (!(interfaceC57784Mm42 instanceof C116144h8) || ((C116144h8) interfaceC57784Mm42).LJLILLLLZI)) {
                        i++;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return i + 1;
    }

    public static final String LJIL(NLETrack nLETrack) {
        Object LIZ;
        Object obj = null;
        if (!nLETrack.hasExtra("RewindTrackType")) {
            return null;
        }
        try {
            LIZ = nLETrack.getExtra("RewindTrackType");
            if (LIZ == null) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static final String LJJ(NLETrackSlot nLETrackSlot) {
        Object LIZ;
        Object obj = null;
        if (!nLETrackSlot.hasExtra("d_stickerId")) {
            return null;
        }
        try {
            LIZ = nLETrackSlot.getExtra("d_stickerId");
            if (LIZ == null) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static final String LJJI(NLETrack getStickerType) {
        Object LIZ;
        o.LJIIIZ(getStickerType, "$this$getStickerType");
        Object obj = null;
        if (!getStickerType.hasExtra("StickerTrackType")) {
            return null;
        }
        try {
            LIZ = getStickerType.getExtra("StickerTrackType");
            if (LIZ == null) {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static final Object LJJIFFI(IDLXDynamic getValue) {
        o.LJIIJ(getValue, "$this$getValue");
        switch (C78523Urn.LIZ[getValue.getType().ordinal()]) {
            case 1:
                return getValue.asString();
            case 2:
                return Double.valueOf(getValue.asDouble());
            case 3:
                return Boolean.valueOf(getValue.asBoolean());
            case 4:
                return Long.valueOf(getValue.asLong());
            case 5:
                return Integer.valueOf(getValue.asInt());
            case 6:
                return getValue.asMap();
            case 7:
                return getValue.asArray();
            case 8:
                return getValue.asByteArray();
            case 9:
                return null;
            default:
                throw new C162476Zf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIJIL(String str) {
        if (!LJJIII()) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.tv0(SuggestedDefinitionByAutoSpeedDetection.class, str);
        PushStreamInfo.Quality quality = new PushStreamInfo.Quality();
        quality.sdkKey = str;
        ((C32537Cpp) dataChannelGlobal.gv0(C29041BaX.class)).LIZ = str;
        dataChannelGlobal.tv0(BroadcastShareScreenDefinition.class, quality);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIJL(String str) {
        if (!LJJIII()) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.tv0(SuggestedDefinitionByManuallySpeedDetection.class, str);
        PushStreamInfo.Quality quality = new PushStreamInfo.Quality();
        quality.name = C78939UyV.LJIILL(str);
        quality.sdkKey = str;
        ((C32537Cpp) dataChannelGlobal.gv0(C29041BaX.class)).LIZ = str;
        dataChannelGlobal.tv0(BroadcastShareScreenDefinition.class, quality);
        HashMap hashMap = new HashMap();
        String str2 = quality.name;
        o.LJIIIIZZ(str2, "quality.name");
        hashMap.put("name", str2);
        String str3 = quality.sdkKey;
        o.LJIIIIZZ(str3, "quality.sdkKey");
        hashMap.put("sdk_key", str3);
        InterfaceC30442Bx8.LLLZI.LIZ(hashMap);
    }

    public static final boolean LJJIJLIJ(Request request) {
        if (ujb.o.LJJJJIZL("GET", request.getMethod(), true) || ujb.o.LJJJJIZL("POST", request.getMethod(), true)) {
            return true;
        }
        return false;
    }

    public static final void LJJJJ(ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(activityC45651qj, "<this>");
        List LJIIL = LJIIL(activityC45651qj);
        if (LJIIL != null) {
            Iterator it = LJIIL.iterator();
            while (it.hasNext()) {
                ((InterfaceC55372LoG) it.next()).T5();
            }
        }
    }

    public static final CharSequence LJJJJIZL(TextBadge textBadge) {
        String LIZ;
        if (textBadge == null || textBadge.key == null) {
            return null;
        }
        String str = textBadge.defaultPattern;
        String str2 = textBadge.key;
        if (str2 != null && str2.length() != 0 && (LIZ = C86881Y7x.LIZIZ().LIZ(textBadge.key)) != null && LIZ.length() != 0) {
            str = LIZ;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        Text text = new Text();
        text.key = textBadge.key;
        text.defaultPattern = textBadge.defaultPattern;
        text.pieces = new ArrayList();
        List<String> list = textBadge.pieces;
        if (list != null && !list.isEmpty()) {
            List<String> list2 = textBadge.pieces;
            o.LJI(list2);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                List<String> list3 = textBadge.pieces;
                o.LJI(list3);
                if (!TextUtils.isEmpty((CharSequence) ListProtector.get(list3, i))) {
                    List<TextPiece> list4 = text.pieces;
                    TextPiece textPiece = new TextPiece();
                    textPiece.type = CXI.STRING.getPieceType();
                    List<String> list5 = textBadge.pieces;
                    o.LJI(list5);
                    textPiece.stringValue = (String) ListProtector.get(list5, i);
                    ListProtector.add(list4, i, textPiece);
                }
            }
        }
        return CXJ.LJI(str, text, null);
    }

    public static final PublishTabAbility LJJJJJ(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 == null) {
            return null;
        }
        return (PublishTabAbility) C55096Ljo.LIZ(interfaceC55235Lm3, PublishTabAbility.class, null);
    }

    public static final PublishTabAbility LJJJJJL(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 != null) {
            return (PublishTabAbility) C55096Ljo.LIZIZ(interfaceC55235Lm3, PublishTabAbility.class);
        }
        return null;
    }

    public static final Object LJJJJLL(IDLXDynamic toPrimitiveOrJSON) {
        o.LJIIJ(toPrimitiveOrJSON, "$this$toPrimitiveOrJSON");
        switch (C78523Urn.LIZIZ[toPrimitiveOrJSON.getType().ordinal()]) {
            case 1:
                return toPrimitiveOrJSON.asString();
            case 2:
                return Double.valueOf(toPrimitiveOrJSON.asDouble());
            case 3:
                return Boolean.valueOf(toPrimitiveOrJSON.asBoolean());
            case 4:
                return Long.valueOf(toPrimitiveOrJSON.asLong());
            case 5:
                return Integer.valueOf(toPrimitiveOrJSON.asInt());
            case 6:
                return C36169EHl.LIZIZ(toPrimitiveOrJSON.asMap());
            case 7:
                return C36169EHl.LIZ(toPrimitiveOrJSON.asArray());
            case 8:
                return toPrimitiveOrJSON.asByteArray();
            case 9:
                return JSONObject.NULL;
            default:
                throw new C162476Zf();
        }
    }

    public static String LJJJJZ(byte[] bArr) {
        String str = null;
        if (bArr != null && bArr.length != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    byte[] bArr2 = new byte[256];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    str = byteArrayOutputStream.toString("UTF-8");
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } catch (IOException unused) {
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                throw th;
            }
            byteArrayOutputStream.close();
        }
        return str;
    }

    public static final List LIZIZ(Object obj, List list) {
        if (list == null) {
            list = new LinkedList();
        }
        list.add(obj);
        return list;
    }

    public static final java.util.Set LIZJ(java.util.Set set, Object obj) {
        if (set == null) {
            set = new HashSet();
        }
        set.add(obj);
        return set;
    }

    public static void LIZLLL(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LJI(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static boolean LJJIIJ(String str, java.util.Set set) {
        if (!C38354F3m.LJ(str) && set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    Logger.debug();
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJJIIZ(FilterBean filterBean, C79155V4t isSameFilterBean) {
        o.LJIIIZ(isSameFilterBean, "$this$isSameFilterBean");
        o.LJIIIZ(filterBean, "filterBean");
        if (isSameFilterBean.LIZ == filterBean.getId() && o.LJ(isSameFilterBean.LIZLLL, filterBean.getCategoryKey())) {
            return true;
        }
        return false;
    }

    public static final void LJJIL(String str, java.util.Map map) {
        C145995oB c145995oB = new C145995oB();
        for (Map.Entry entry : map.entrySet()) {
            c145995oB.LIZJ(entry.getValue(), (String) entry.getKey());
        }
        GXR.LIZ(str, c145995oB.LIZ);
    }

    public static final void LJJJ(String str, String str2) {
        LJJIL("edit_recommend_effect_hit_cache_info", C113554cx.LJJL(new OSZ("effect_id", str), new OSZ("from_cache", str2)));
    }

    public static final void LJJJI(int i, String statusCode) {
        o.LJIIIZ(statusCode, "statusCode");
        LJJIL("edit_recommend_effect_request_info", C113554cx.LJJLIIIIJ(new OSZ("duration", Integer.valueOf(i)), new OSZ("status_code", statusCode)));
    }

    public static final void LJJJJI(MutableLiveData postOrSetValue, Object obj) {
        o.LJIIIZ(postOrSetValue, "$this$postOrSetValue");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            postOrSetValue.setValue(obj);
        } else {
            postOrSetValue.postValue(obj);
        }
    }

    public static final void LJJJJL(NLETrack nLETrack, String audioType) {
        o.LJIIIZ(audioType, "audioType");
        nLETrack.setExtra("AudioTrackType", audioType);
    }

    public static final void LJJJJLI(NLETrack nLETrack, String filterType) {
        o.LJIIIZ(filterType, "filterType");
        nLETrack.setExtra("FilterTrackType", filterType);
    }

    @Override // X.InterfaceC77358UXq
    public Matrix LIZ(Rect fromRect, RectF rectF) {
        o.LJIIIZ(fromRect, "fromRect");
        Matrix matrix = new Matrix();
        float min = 1.0f / Math.min(rectF.width() / fromRect.width(), rectF.height() / fromRect.height());
        matrix.setScale(min, min, rectF.centerX(), rectF.centerY());
        matrix.postTranslate(fromRect.centerX() - rectF.centerX(), fromRect.centerY() - rectF.centerY());
        return matrix;
    }

    @Override // X.InterfaceC73786Sxa
    public boolean test(Object old, Object obj) {
        o.LJIIIZ(old, "old");
        o.LJIIIZ(obj, "new");
        return o.LJ(old, obj);
    }

    public static void LJ(String str, boolean z, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalArgumentException(C45804HyK.LJIJI(str, objArr));
        }
    }

    public static UrlModel LJII(int i, int i2, String str) {
        if (str == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setHeight(i2);
        urlModel.setWidth(i);
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    public static final void LJJJIL(int i, VideoPublishEditModel model, String actionType) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(actionType, "actionType");
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("action_type", actionType), new OSZ("impr_position", Integer.valueOf(i)));
        LJJLIIIIJ.putAll(LJIIIIZZ(model));
        LJJIL("effects_scroll_wheel_icon_fade_out", LJJLIIIIJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        if (r1 > r4) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJJI(java.util.List r9, java.lang.CharSequence r10, X.C21B r11, int r12) {
        /*
            r0 = r12 & 1
            if (r0 == 0) goto L6
            java.lang.String r10 = ", "
        L6:
            r0 = r12 & 2
            r2 = 0
            java.lang.String r6 = ""
            if (r0 == 0) goto L96
            r1 = r6
        Le:
            r0 = r12 & 4
            if (r0 == 0) goto L93
        L12:
            r0 = r12 & 8
            r5 = 0
            if (r0 == 0) goto L91
            r4 = -1
        L18:
            r0 = r12 & 16
            if (r0 == 0) goto L8f
            java.lang.String r3 = "..."
        L1e:
            r0 = r12 & 32
            if (r0 == 0) goto L23
            r11 = r2
        L23:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r0 = r9
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r1 = 0
        L4c:
            if (r5 >= r2) goto L99
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r5)
            int r1 = r1 + 1
            r0 = 1
            if (r1 <= r0) goto L5a
            r7.append(r10)
        L5a:
            if (r4 < 0) goto L5e
            if (r1 > r4) goto L9d
        L5e:
            if (r11 == 0) goto L6c
            java.lang.Object r0 = r11.invoke(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.append(r0)
        L69:
            int r5 = r5 + 1
            goto L4c
        L6c:
            if (r8 != 0) goto L74
        L6e:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7.append(r8)
            goto L69
        L74:
            boolean r0 = r8 instanceof java.lang.CharSequence
            if (r0 == 0) goto L79
            goto L6e
        L79:
            boolean r0 = r8 instanceof java.lang.Character
            if (r0 == 0) goto L87
            java.lang.Character r8 = (java.lang.Character) r8
            char r0 = r8.charValue()
            r7.append(r0)
            goto L69
        L87:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r7.append(r0)
            goto L69
        L8f:
            r3 = r2
            goto L1e
        L91:
            r4 = 0
            goto L18
        L93:
            r6 = r2
            goto L12
        L96:
            r1 = r2
            goto Le
        L99:
            if (r4 < 0) goto La0
            if (r1 <= r4) goto La0
        L9d:
            r7.append(r3)
        La0:
            r7.append(r6)
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "fastJoinTo(StringBuilder…form)\n        .toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77357UXp.LJIIJJI(java.util.List, java.lang.CharSequence, X.21B, int):java.lang.String");
    }

    public static final void LJJIZ(String effectID, String str, int i, int i2, Integer num) {
        o.LJIIIZ(effectID, "effectID");
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("effect_id", effectID), new OSZ("impr_position", Integer.valueOf(i)), new OSZ("error_msg", str), new OSZ("status_code", Integer.valueOf(i2)));
        if (num != null) {
            LJJLIIIIJ.put("durationMs", num);
        }
        LJJIL("edit_recommend_effect_apply_info", LJJLIIIIJ);
    }

    public static void LJJIJIIJI(PowerCell powerCell, String str, String str2, Integer num, String groupId, java.util.Map map, int i) {
        String str3;
        int i2;
        if ((i & 2) != 0) {
            str3 = "notification_page";
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = -1;
        }
        if ((i & 16) != 0) {
            i2 = LJIJJLI(powerCell);
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            groupId = "";
        }
        if ((i & 64) != 0) {
            map = null;
        }
        o.LJIIIZ(powerCell, "<this>");
        o.LJIIIZ(groupId, "groupId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("cell_type", str);
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("to_user_id", str2);
        c188727au.LJFF(num, "follow_status");
        c188727au.LIZLLL(i2, "rank");
        c188727au.LJIIIZ("group_id", groupId);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c188727au.LJFF(entry.getValue(), (String) entry.getKey());
            }
        }
        FMX.LJIIL("inbox_skylight_click", c188727au.LIZ);
    }

    public static void LJJIJIIJIL(PowerCell powerCell, String str, String str2, int i, String groupId, java.util.Map map, int i2) {
        String str3;
        int i3;
        if ((i2 & 2) != 0) {
            str3 = "notification_page";
        } else {
            str3 = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            i3 = LJIJJLI(powerCell);
        } else {
            i3 = 0;
        }
        if ((i2 & 32) != 0) {
            groupId = "";
        }
        if ((i2 & 64) != 0) {
            map = null;
        }
        o.LJIIIZ(powerCell, "<this>");
        o.LJIIIZ(groupId, "groupId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("cell_type", str);
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("to_user_id", str2);
        c188727au.LIZLLL(i, "follow_status");
        c188727au.LIZLLL(i3, "rank");
        c188727au.LJIIIZ("group_id", groupId);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c188727au.LJFF(entry.getValue(), (String) entry.getKey());
            }
        }
        FMX.LJIIL("inbox_skylight_show", c188727au.LIZ);
    }
}

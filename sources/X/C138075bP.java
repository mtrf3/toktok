package X;

import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS3S1100000_2;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.zhiliaoapp.musically.R;
import djb.IDaS67S0100000_2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS70S1100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONObject;

/* renamed from: X.5bP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138075bP extends AbstractC48231ut<InterfaceC138705cQ, C139205dE, C139135d7, C138385bu> implements InterfaceC138705cQ, InterfaceC135635Tz {
    public static final C138365bs LLJJJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJJIL;
    public static float LLJJJJ;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final C5H3 LJLLILLLL;
    public boolean LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public SafeHandler LJZI;
    public boolean LJZL;
    public boolean LL;
    public String LLD;
    public TextStickerData LLF;
    public C67P LLFF;
    public int LLFFF;
    public volatile boolean LLFII;
    public CopyOnWriteArrayList<ReadTextEffectBean> LLFZ;
    public List<List<ReadTextEffectBean>> LLI;
    public TTSSpeakerInfo LLIFFJFJJ;
    public ReadTextEffectBean LLII;
    public List<? extends List<? extends ReadTextEffectBean>> LLIIII;
    public List<? extends ReadTextEffectBean> LLIIIILZ;
    public final C5H3 LLIIIJ;
    public HashMap<C137695an, OSZ<File, Integer>> LLIIIL;
    public InputMethodManager LLIIIZ;
    public ReadTextEffectBean LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public SpeakerCenter.KevaSpeakerBean LLIILII;
    public List<String> LLIILZL;
    public final InterfaceC70422pa LLIIZ;
    public boolean LLIL;
    public final InterfaceC115514g7 LLILII;
    public final List<ReadTextEffectBean> LLILIL;
    public final C5H3 LLILL;
    public final InterfaceC115514g7 LLILLIZIL;
    public final C138205bc LLILLJJLI;
    public final C138115bT LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final InterfaceC65784Pro<C139135d7> LLJ;
    public final InterfaceC65784Pro<C138385bu> LLJI;
    public InterfaceC65784Pro<C76800UCe> LLJIJIL;
    public final InterfaceC88472Yns<EffectCategoryModel, Boolean> LLJILJIL;
    public final InterfaceC88472Yns<List<ReadTextEffectBean>, List<ReadTextEffectBean>> LLJILJILJ;
    public boolean LLJILLL;
    public ReadTextEffectBean LLJJ;
    public TextStickerData LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public ProgressDialogC43239Gy3 LLJJIJIIJIL;
    public boolean LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.5bs] */
    static {
        TBT tbt = new TBT(C138075bP.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLJJJIL = new InterfaceC74236TBo[]{tbt, new TBT(C138075bP.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0), new TBT(C138075bP.class, "textStickerNewApi", "getTextStickerNewApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextStickerNewApi;", 0), new TBT(C138075bP.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0), new TBT(C138075bP.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new TBT(C138075bP.class, "unlockReadTextVoiceApi", "getUnlockReadTextVoiceApi()Lcom/ss/android/ugc/gamora/editor/sticker/read/unlocktts/UnlockReadTextVoiceApiComponent;", 0), new TBT(C138075bP.class, "voiceCloneApiComponent", "getVoiceCloneApiComponent()Lcom/ss/android/ugc/gamora/editor/sticker/read/voiceclone/VoiceCloneComponentApi;", 0)};
        LLJJJ = new Object() { // from class: X.5bs
        };
        LLJJJJ = 371.0f;
    }

    public static void LLILL(ProgressDialogC43239Gy3 progressDialogC43239Gy3) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy3, new Object[0], "void", new C65300Pk0(false, "()V", "-7376018247790006877")).LIZ) {
            return;
        }
        progressDialogC43239Gy3.show();
    }

    private final ProgressDialogC43239Gy3 LLILZIL() {
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LLJJIJIIJIL;
        if (progressDialogC43239Gy3 != null) {
            progressDialogC43239Gy3.cancel();
        }
        ProgressDialogC43239Gy3 LIZJ = C42034Gec.LIZJ(C78688UuS.LJIJJ(this), EnumC42288Gii.GONE, new InterfaceC43240Gy4() { // from class: X.5bo
            @Override // X.InterfaceC43240Gy4
            public final void LIZIZ() {
            }
        });
        this.LLJJIJIIJIL = LIZJ;
        LIZJ.setMessage(C78688UuS.LJIJJ(this).getString(R.string.s6h));
        ProgressDialogC43239Gy3 progressDialogC43239Gy32 = this.LLJJIJIIJIL;
        o.LJII(progressDialogC43239Gy32, "null cannot be cast to non-null type com.ss.android.ugc.aweme.view.DoubleBallLoadingDialog");
        return progressDialogC43239Gy32;
    }

    private final void LLLZIIL() {
        int i = this.LLFFF;
        if (i == Integer.MAX_VALUE) {
            this.LLFFF = 0;
        } else {
            this.LLFFF = i + 1;
        }
    }

    public final InterfaceC143655kP LLJLIL() {
        return (InterfaceC143655kP) this.LJLLL.LIZ(this, LLJJJIL[0]);
    }

    public final InterfaceC139655dx LLJLLIL() {
        return (InterfaceC139655dx) this.LJLZ.LIZ(this, LLJJJIL[3]);
    }

    public final InterfaceC84497XEf LLJZIJLIL() {
        return (InterfaceC84497XEf) this.LJLLILLLL.getValue();
    }

    public final AbstractC42651GoZ LLLFFI() {
        return (AbstractC42651GoZ) this.LJZ.LIZ(this, LLJJJIL[4]);
    }

    public final C63D LLLFZ() {
        return (C63D) this.LJLLLL.LIZ(this, LLJJJIL[1]);
    }

    public final InterfaceC139045cy LLLI() {
        return (InterfaceC139045cy) this.LJLLLLLL.LIZ(this, LLJJJIL[2]);
    }

    public final InterfaceC138185ba LLLIIIL() {
        return (InterfaceC138185ba) this.LLILL.getValue();
    }

    public final InterfaceC138265bi LLLILZLLLI() {
        return (InterfaceC138265bi) this.LLILII.LIZ(this, LLJJJIL[5]);
    }

    public final InterfaceC138315bn LLLJIL() {
        return (InterfaceC138315bn) this.LLILLIZIL.LIZ(this, LLJJJIL[6]);
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LLIIIJ.getValue();
    }

    public final void LLLLLZIL() {
        if (this.LLILZ > 0 && this.LLIZ) {
            C138205bc c138205bc = this.LLILLJJLI;
            c138205bc.LIZ.put("total_duration", System.currentTimeMillis() - this.LLILZ);
            C138205bc c138205bc2 = this.LLILLJJLI;
            String creationId = LLLLIL().getCreationId();
            o.LJIIIIZZ(creationId, "publishEditModel.creationId");
            c138205bc2.LIZ.put("creation_id", creationId);
            C138205bc c138205bc3 = this.LLILLJJLI;
            c138205bc3.LIZ.put("resource_prepare_duration", this.LLILZLL);
            C138205bc c138205bc4 = this.LLILLJJLI;
            FMX.LJIILJJIL("panel_did_show", C78609UtB.LJJIJIIJI(c138205bc4.LIZ));
            C09900aA.LJIIJJI("panel_did_show", 0, C78609UtB.LJJIJIIJI(c138205bc4.LIZ));
            C138205bc c138205bc5 = this.LLILLJJLI;
            c138205bc5.getClass();
            c138205bc5.LIZ = new JSONObject();
            C138115bT c138115bT = this.LLILLL;
            c138115bT.LIZ.put("resource_prepare_duration", this.LLILZLL);
            C138115bT c138115bT2 = this.LLILLL;
            c138115bT2.LIZ.put("total_duration", System.currentTimeMillis() - this.LLILZ);
            this.LLILZ = 0L;
        }
    }

    @Override // X.InterfaceC138705cQ
    public void bA() {
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LLJJIJIIJIL;
        if (progressDialogC43239Gy3 != null && progressDialogC43239Gy3.isShowing()) {
            ProgressDialogC43239Gy3 progressDialogC43239Gy32 = this.LLJJIJIIJIL;
            if (progressDialogC43239Gy32 != null) {
                progressDialogC43239Gy32.dismiss();
            }
            LLJLIL().wZ(false);
            this.LLJJIII = true;
        }
    }

    private final int LLLJ() {
        return ((C81184Vtc.LIZIZ(C78688UuS.LJIJJ(this)) - ((int) KL2.LIZJ(C78688UuS.LJIJJ(this), LLJJJJ + 52.0f))) - C81184Vtc.LJFF(C78688UuS.LJIJJ(this))) - C81184Vtc.LIZJ(C78688UuS.LJIJJ(this));
    }

    private final void LLLJL() {
        InputMethodManager inputMethodManager;
        View currentFocus = C78688UuS.LJIJJ(this).getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = this.LLIIIZ) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    private final void LLLZ() {
        LLLZIIL();
        this.LLD = "";
    }

    public final void LLLLLLIL() {
        LLFFF(LLLLIL().ttsVoiceModel);
        if (!this.LLJJIJIL && E8I.LIZIZ() && LLLJIL() != null) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C137495aT(this, null), 3);
        }
    }

    @Override // X.InterfaceC138705cQ
    public void n00() {
        this.LLILZIL = System.currentTimeMillis();
        this.LLIZ = false;
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLJLIL().wf0().observe(this, new AObserverS70S0100000_2(this, 123));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C48841JEv.LIZJ(this.LLIIZ, null);
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        String str;
        ReadTextEffectBean readTextEffectBean;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        super.onResume();
        if (!this.LLJJIJIL && this.LLIFFJFJJ != null && E8I.LIZIZ()) {
            this.LLIZLLLIL = false;
            TTSSpeakerInfo tTSSpeakerInfo = this.LLIFFJFJJ;
            if (tTSSpeakerInfo != null) {
                String str2 = tTSSpeakerInfo.speakerId;
                ReadTextEffectBean readTextEffectBean2 = this.LLJJ;
                if (readTextEffectBean2 != null && (readTextEffectSpeakerExtra = readTextEffectBean2.mSpeaker) != null) {
                    str = readTextEffectSpeakerExtra.speakreID;
                } else {
                    str = null;
                }
                if (o.LJ(str2, str) && (readTextEffectBean = this.LLJJ) != null && readTextEffectBean.selected) {
                    LLLIIIL().k3();
                }
            }
            if (LLLJIL() != null) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C137485aS(this, null), 3);
            }
        }
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C139135d7> LJJLIIIJJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C138385bu> LJJLIIIJJIZ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC138705cQ
    public boolean r90() {
        return this.LLIL;
    }

    private final void LJLZ(TextStickerData textStickerData) {
        LJZI(textStickerData, new File(textStickerData.getAudioTrackFilePath()), textStickerData.getAudioTrackDuration());
    }

    private final void LLF(TextStickerData textStickerData) {
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC153045zY value;
        InterfaceC143655kP LLJLIL = LLJLIL();
        if (LLJLIL != null && (Kh = LLJLIL.Kh()) != null && (value = Kh.getValue()) != null && !TextUtils.isEmpty(textStickerData.getNleUuid())) {
            C122034qd LJJI = C17N.LJJI(value);
            if (LJJI != null) {
                C122004qa c122004qa = LJJI.LJFF().get(textStickerData.getNleUuid());
                if (c122004qa != null) {
                    C122034qd LJJI2 = C17N.LJJI(value);
                    if (LJJI2 != null) {
                        LJJI2.LJFF().LJFF(c122004qa);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                textStickerData.setNleUuid("");
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        textStickerData.setHasReadTextAudio(false);
        textStickerData.setAudioTrackIndex(-1);
        textStickerData.setAudioTrackFilePath(null);
    }

    private final void LLFFF(TTSVoiceModel tTSVoiceModel) {
        if (tTSVoiceModel != null && this.LLII == null) {
            String effectId = tTSVoiceModel.getEffectId();
            if ((effectId != null && effectId.length() == 0) || this.LLJILLL) {
                return;
            }
            Iterator<? extends ReadTextEffectBean> it = this.LLIIIILZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ReadTextEffectBean next = it.next();
                if (o.LJ(next.effect.getEffect_id(), tTSVoiceModel.getEffectId())) {
                    if (next != null) {
                        this.LLJILLL = true;
                        return;
                    }
                }
            }
            LinkedHashMap LIZ = C0JU.LIZ("panel", "speaking-voice");
            String effectId2 = tTSVoiceModel.getEffectId();
            if (effectId2 == null) {
                return;
            }
            LLJZIJLIL().LIZLLL(effectId2, LIZ, new IFetchEffectListener() { // from class: X.5bS
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    Effect effect2 = effect;
                    if (effect2 != null && OUP.LJJIIJZLJL(effect2)) {
                        try {
                            String extra = effect2.getExtra();
                            if (extra != null) {
                                if (new JSONObject(extra).optBoolean("is_publich_for_voice_clone")) {
                                }
                            }
                        } catch (Exception unused) {
                        }
                        if (!o.LJ(OUP.LJIILL(effect2), C60903NvH.LJIIJJI().getAccountService().getCurrentUserID())) {
                            C138075bP.this.LLII = C77412UZs.LJIIIZ(effect2);
                        }
                    }
                    C138075bP.this.LLJILLL = true;
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult e) {
                    o.LJIIIZ(e, "e");
                    C138075bP.this.LLILLJJLI.LIZ(C1DH.LJJJIL(new C138175bZ(12, 101).LIZ(e.getErrorCode())));
                    C138205bc c138205bc = C138075bP.this.LLILLJJLI;
                    String msg = e.getMsg();
                    if (msg == null) {
                        msg = "Unknown error";
                    }
                    c138205bc.LIZIZ(msg);
                    C138075bP.this.LLJILLL = true;
                }
            });
        }
    }

    private final void LLIIIL(TextStickerData textStickerData) {
        this.LLF = textStickerData;
        LLLZ();
        if (!textStickerData.getHasReadTextAudio()) {
            this.LLD = SpeakerCenter.LIZLLL();
            return;
        }
        String str = "";
        if (LLLL(textStickerData) || !LLLLJ(textStickerData)) {
            LLF(textStickerData);
            String speakerID = textStickerData.getSpeakerID();
            if (speakerID != null) {
                str = speakerID;
            }
            this.LLD = str;
            return;
        }
        LJLZ(textStickerData);
        String speakerID2 = textStickerData.getSpeakerID();
        if (speakerID2 != null) {
            str = speakerID2;
        }
        this.LLD = str;
    }

    private final int LLJJIJIL(String str) {
        int i = 0;
        if (this.LLIL) {
            return 0;
        }
        Iterator<ReadTextEffectBean> it = this.LLFZ.iterator();
        while (it.hasNext()) {
            ReadTextEffectBean next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (o.LJ(next.mSpeaker.speakreID, str)) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    private final boolean LLLLJ(TextStickerData textStickerData) {
        if (TextUtils.isEmpty(textStickerData.getAudioTrackFilePath()) || !new File(textStickerData.getAudioTrackFilePath()).exists() || textStickerData.getAudioTrackDuration() == 0) {
            return false;
        }
        return true;
    }

    private final void LLLLLJLJLL(String str) {
        C138205bc c138205bc = this.LLILLJJLI;
        c138205bc.getClass();
        c138205bc.LIZ.put("scene_name", "");
        c138205bc.LIZ.put("extra", "");
        c138205bc.LIZ.put("total_duration", 0L);
        c138205bc.LIZ.put("resource_prepare_duration", 0L);
        c138205bc.LIZ.put("ui_duration", 0L);
        c138205bc.LIZ.put("use_cache", 0);
        c138205bc.LIZ.put("error_msg", "");
        c138205bc.LIZ(0);
        c138205bc.LIZ.put("creation_id", "");
        this.LLILLL.LJ();
        if (str.length() > 0) {
            C138205bc c138205bc2 = this.LLILLJJLI;
            c138205bc2.getClass();
            c138205bc2.LIZ.put("scene_name", str);
            this.LLILLL.LJFF(str);
        }
        if (this.LLFII) {
            this.LLILLJJLI.LIZ.put("use_cache", 1);
        } else {
            this.LLILLJJLI.LIZ.put("use_cache", 0);
        }
        this.LLILLL.LIZ.put("feature_name", "apply_tts_effect");
        C138115bT c138115bT = this.LLILLL;
        String creationId = LLLLIL().getCreationId();
        o.LJIIIIZZ(creationId, "publishEditModel.creationId");
        c138115bT.LIZ(creationId);
        this.LLILZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC138705cQ
    public void G7(TextStickerData textStickerData) {
        LLIIZ(textStickerData, "small_icon");
    }

    @Override // X.InterfaceC138705cQ
    public void Hd0(List<? extends ReadTextEffectBean> sourceList) {
        o.LJIIIZ(sourceList, "sourceList");
        List<ReadTextEffectBean> LLJILJILJ = ORZ.LLJILJILJ(sourceList);
        LLJJIJI(LLJILJILJ);
        this.LLIIIILZ = LLJILJILJ;
    }

    public final boolean LLIFFJFJJ(String textSpeaker) {
        boolean z;
        TextStickerData textStickerData;
        o.LJIIIZ(textSpeaker, "textSpeaker");
        if (this.LLF == null) {
            return false;
        }
        if (o.LJ(textSpeaker, this.LLIIJLIL)) {
            textSpeaker = "";
        }
        if (o.LJ(textSpeaker, "") && (textStickerData = this.LLF) != null) {
            z = this.LLIIIL.containsKey(new C137695an(textStickerData.getTextStr(), this.LLIIJLIL));
        } else {
            z = false;
        }
        TextStickerData textStickerData2 = this.LLF;
        if ((textStickerData2 == null || !this.LLIIIL.containsKey(new C137695an(textStickerData2.getTextStr(), textSpeaker))) && !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
    
        if (r13 == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0309  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIILZL(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r22) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138075bP.LLIILZL(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLJJ(TextStickerData textStickerData) {
        Effect effect = new Effect(null, 1, 0 == true ? 1 : 0);
        long j = 0;
        char c = 1 == true ? 1 : 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        ReadTextEffectBean readTextEffectBean = new ReadTextEffectBean(effect, new ReadTextEffectSpeakerExtra(c, "", "", "", 0, objArr, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2, j, j, 8160, 0 == true ? 1 : 0));
        this.LLIIIILZ = C47261Igj.LJJIJ(readTextEffectBean);
        this.LLIIII = C47261Igj.LJJIJ(C47261Igj.LJJIJ(readTextEffectBean));
        LLIILZL(textStickerData);
    }

    public final Object LLJJI(InterfaceC67352kd<? super TTSSpeakerInfo> interfaceC67352kd) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (!E8I.LIZIZ()) {
            this.LLJJIJIL = true;
            this.LLFII = !this.LLIIIILZ.isEmpty();
            C3C5.m7constructorimpl(null);
            c84654XKg.resumeWith(null);
        } else if (CommerceToolsMusicService.LIZIZ(false).U40()) {
            this.LLJJIJIL = true;
            this.LLFII = !this.LLIIIILZ.isEmpty();
            C3C5.m7constructorimpl(null);
            c84654XKg.resumeWith(null);
        } else if (this.LLJJIJIL) {
            TTSSpeakerInfo tTSSpeakerInfo = this.LLIFFJFJJ;
            C3C5.m7constructorimpl(tTSSpeakerInfo);
            c84654XKg.resumeWith(tTSSpeakerInfo);
        } else {
            InterfaceC138315bn LLLJIL = LLLJIL();
            if (LLLJIL != null) {
                LLLJIL.tu(LLJZIJLIL(), new InterfaceC138465c2() { // from class: X.5bV
                    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
                    
                        if (kotlin.jvm.internal.o.LJ(r1, r11.speakerId) != false) goto L36;
                     */
                    @Override // X.InterfaceC138465c2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo r11, int r12, java.lang.String r13) {
                        /*
                            Method dump skipped, instructions count: 246
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C138135bV.LIZ(com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo, int, java.lang.String):void");
                    }
                });
            }
        }
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLJJIII(X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C138155bX
            if (r0 == 0) goto L23
            r6 = r9
            X.5bX r6 = (X.C138155bX) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r7 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 == r2) goto L35
            if (r0 != r3) goto L2d
            X.5bP r4 = r6.LJLIL
            goto L29
        L23:
            X.5bX r6 = new X.5bX
            r6.<init>(r8, r9)
            goto L12
        L29:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.RuntimeException -> L7d
            goto La3
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.5bP r4 = r6.LJLIL
            goto L5f
        L38:
            X.C141335gf.LIZJ(r7)
            java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean> r0 = r8.LLIIIILZ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L48
            java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean> r0 = r8.LLIIIILZ
            return r0
        L48:
            X.XEf r0 = r8.LLJZIJLIL()     // Catch: java.lang.RuntimeException -> L7a
            X.5ck r1 = X.C138795cZ.LIZ(r0)     // Catch: java.lang.RuntimeException -> L7a
            X.Yns<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, java.lang.Boolean> r0 = r8.LLJILJIL     // Catch: java.lang.RuntimeException -> L7a
            r6.LJLIL = r8     // Catch: java.lang.RuntimeException -> L7a
            r6.LJLJJI = r2     // Catch: java.lang.RuntimeException -> L7a
            java.lang.Object r7 = r1.LIZIZ(r0, r6)     // Catch: java.lang.RuntimeException -> L7a
            if (r7 != r5) goto L5d
            return r5
        L5d:
            r4 = r8
            goto L62
        L5f:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.RuntimeException -> L78
        L62:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.RuntimeException -> L78
            X.UtN r2 = X.C36636EZk.LIZ     // Catch: java.lang.RuntimeException -> L78
            X.5bQ r1 = new X.5bQ     // Catch: java.lang.RuntimeException -> L78
            r0 = 0
            r1.<init>(r7, r4, r0)     // Catch: java.lang.RuntimeException -> L78
            r6.LJLIL = r4     // Catch: java.lang.RuntimeException -> L78
            r6.LJLJJI = r3     // Catch: java.lang.RuntimeException -> L78
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r6)     // Catch: java.lang.RuntimeException -> L78
            if (r0 != r5) goto La3
            return r5
        L78:
            r3 = move-exception
            goto L7e
        L7a:
            r3 = move-exception
            r4 = r8
            goto L7e
        L7d:
            r3 = move-exception
        L7e:
            X.5bc r2 = r4.LLILLJJLI
            X.5br r1 = new X.5br
            r1.<init>()
            r0 = 900(0x384, float:1.261E-42)
            java.lang.String r0 = r1.LIZ(r0)
            int r0 = X.C1DH.LJJJIL(r0)
            r2.LIZ(r0)
            X.5bc r0 = r4.LLILLJJLI
            java.lang.String r2 = r3.getMessage()
            if (r2 != 0) goto L9c
            java.lang.String r2 = "fetch voice list failed"
        L9c:
            org.json.JSONObject r1 = r0.LIZ
            java.lang.String r0 = "error_msg"
            r1.put(r0, r2)
        La3:
            java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean> r0 = r4.LLIIIILZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138075bP.LLJJIII(X.2kd):java.lang.Object");
    }

    public final List<ReadTextEffectBean> LLJJIJI(List<ReadTextEffectBean> list) {
        String userId = C60903NvH.LJIIJJI().getAccountService().getCurrentUserID();
        o.LJIIIZ(userId, "userId");
        String[] stringArray = SpeakerCenter.LIZ.getStringArray(h.LJIIIIZZ(userId), new String[0]);
        o.LJIIIIZZ(stringArray, "keva.getStringArray(Md5U…st(userId), emptyArray())");
        List LJJZZIII = ORY.LJJZZIII(stringArray);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJZZIII) {
            Iterator<ReadTextEffectBean> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    ReadTextEffectBean next = it.next();
                    if (o.LJ(next.mSpeaker.speakreID, obj)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        boolean U40 = CommerceToolsMusicService.LIZIZ(false).U40();
        Iterator<ReadTextEffectBean> it2 = list.iterator();
        while (it2.hasNext()) {
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = it2.next().mSpeaker;
            if (readTextEffectSpeakerExtra.lockEasterEgg == 1) {
                it2.remove();
            } else if (U40 && readTextEffectSpeakerExtra.voiceUseCommercial == 1) {
                it2.remove();
            }
        }
        if (C19N.LJ("enable_unlock_special_voices", true)) {
            list.addAll(0, arrayList);
        }
        return list;
    }

    public final OSZ<File, Integer> LLJJJIL(String textSpeaker) {
        TextStickerData textStickerData;
        OSZ<File, Integer> osz;
        o.LJIIIZ(textSpeaker, "textSpeaker");
        if (o.LJ(textSpeaker, this.LLIIJLIL)) {
            textSpeaker = "";
        }
        TextStickerData textStickerData2 = this.LLF;
        if (textStickerData2 != null && (osz = this.LLIIIL.get(new C137695an(textStickerData2.getTextStr(), textSpeaker))) != null) {
            return osz;
        }
        if (!o.LJ(textSpeaker, "") || (textStickerData = this.LLF) == null) {
            return null;
        }
        return this.LLIIIL.get(new C137695an(textStickerData.getTextStr(), this.LLIIJLIL));
    }

    public final List<String> LLJJL(Effect effect) {
        List<String> challenge;
        ArrayList arrayList = new ArrayList();
        if (effect != null && (challenge = effect.getChallenge()) != null) {
            Iterator<String> it = challenge.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final boolean LLLL(TextStickerData data) {
        o.LJIIIZ(data, "data");
        if (!TextUtils.isEmpty(data.getAudioText()) && !o.LJ(data.getAudioText(), C68W.LJII(data.getTextWrapList()))) {
            return true;
        }
        return false;
    }

    public final void LLLLJI(boolean z) {
        String str;
        SpeakerCenter.LIZ.storeBoolean("checkbox", z);
        LLLLIL().setApplyVoiceToAllTextSwitch(z);
        if (!z) {
            ReadTextEffectBean readTextEffectBean = this.LLJJ;
            if (readTextEffectBean == null) {
                SpeakerCenter.LJIIIZ(this.LLIIL);
                SpeakerCenter.LJII(this.LLIIJLIL);
                SpeakerCenter.KevaSpeakerBean kevaSpeakerBean = this.LLIILII;
                if (kevaSpeakerBean != null) {
                    SpeakerCenter.LJIIIIZZ(kevaSpeakerBean);
                }
                LJJZZI(new AqS168S0100000_2(this, 299));
            } else {
                SpeakerCenter.LJIIIZ(readTextEffectBean.mSpeaker.speakerName);
                SpeakerCenter.LJII(readTextEffectBean.mSpeaker.speakreID);
                String effect_id = readTextEffectBean.effect.getEffect_id();
                String str2 = (String) ORZ.LJLLLL(readTextEffectBean.effect.getIcon_url().getUrl_list());
                String str3 = readTextEffectBean.mSpeaker.ttsAnchorName;
                String resource_id = readTextEffectBean.effect.getResource_id();
                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
                SpeakerCenter.LJIIIIZZ(new SpeakerCenter.KevaSpeakerBean(effect_id, str2, str3, resource_id, readTextEffectSpeakerExtra.voiceCreatorUserId, readTextEffectSpeakerExtra.voiceCreatorUserName, readTextEffectSpeakerExtra.isCreatorVoice, readTextEffectSpeakerExtra.ttsAnchorReleaseDate, readTextEffectSpeakerExtra.ttsReleaseDate));
                LJJZZI(new AqS168S0100000_2(readTextEffectBean, 285));
            }
        }
        if (!this.LJLLJ) {
            ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(LLLLIL().mShootWay, H7R.LJIIIIZZ(LLLLIL()), H7R.LJIIIZ(LLLLIL()), LLLLIL().getCreationId());
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", shortVideoCommonParams.shootWay);
            c145995oB.LJI("content_source", shortVideoCommonParams.contentSource);
            c145995oB.LJI("content_type", shortVideoCommonParams.contentType);
            c145995oB.LJI("creation_id", shortVideoCommonParams.creationId);
            if (SpeakerCenter.LJFF()) {
                str = "on";
            } else {
                str = "off";
            }
            c145995oB.LJI("to_status", str);
            FMX.LJIIL("click_apply_tone", c145995oB.LIZ);
        }
        this.LJLLJ = false;
    }

    public final void LLLLLIL(boolean z) {
        boolean z2 = this.LJZL;
        if (z2) {
            C138695cP.LIZIZ(this, false, z2, null, this.LLJIJIL, new AqS152S0100000_2(this, 508), 8);
            return;
        }
        if (!z) {
            LLJLIL().DM().setValue(C5MM.LIZ());
            LLJLIL().DM().setValue(C5MM.LIZJ());
            LJJZZI(C138245bg.LJLIL);
        } else {
            LJJZZI(C138255bh.LJLIL);
            InterfaceC153045zY value = LLJLIL().Kh().getValue();
            if (value != null) {
                value.LLJILJIL(true);
            }
            LLJLIL().DM().setValue(C5MM.LIZ());
        }
    }

    public final void LLLLLJIL(ReadTextEffectBean readTextEffectBean) {
        VideoPublishEditModel model = LLLLIL();
        String tabName = readTextEffectBean.category.name;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(tabName, "tabName");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("tab_name", tabName);
        FMX.LJIIL("click_text_reading_tab", c145995oB.LIZ);
    }

    public final void LLLLZI(List<ReadTextEffectBean> list) {
        for (ReadTextEffectBean readTextEffectBean : list) {
            String str = readTextEffectBean.mSpeaker.speakreID;
            String LJIJ = OUP.LJIJ(readTextEffectBean.effect);
            boolean LJ = o.LJ(OUP.LJIILL(readTextEffectBean.effect), ((RBX) HG3.LJIILL()).getCurUserId());
            if (str.length() > 0) {
                List<String> list2 = this.LLIILZL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(readTextEffectBean.category.name);
                if (!list2.contains(X1D.LIZIZ(LIZ))) {
                    VideoPublishEditModel LLLLIL = LLLLIL();
                    TTSCategory tTSCategory = readTextEffectBean.category;
                    String str2 = tTSCategory.name;
                    String str3 = tTSCategory.id;
                    C138735cT.LJII(str, LLLLIL, null, LJIJ, LJ ? 1 : 0, readTextEffectBean.effect.getEffectId(), str2, str3, 524);
                    List<String> list3 = this.LLIILZL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(readTextEffectBean.category.name);
                    list3.add(X1D.LIZIZ(LIZ2));
                }
            }
        }
        LLLLLZIL();
    }

    public final void LLLLZLL(String str) {
        SafeHandler safeHandler = this.LJZI;
        if (safeHandler != null) {
            safeHandler.post(new ARunnableS3S1100000_2(this, str, 2));
        } else {
            o.LJIJI("mSafeHandler");
            throw null;
        }
    }

    public final void LLLZLL(ReadTextEffectBean readTextEffectBean) {
        String str;
        boolean LJ;
        List<String> urlList;
        String str2;
        List<String> urlList2;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        SpeakerCenter.LJIIIZ(readTextEffectBean.mSpeaker.speakerName);
        SpeakerCenter.LJII(readTextEffectBean.mSpeaker.speakreID);
        String effect_id = readTextEffectBean.effect.getEffect_id();
        String str3 = (String) ORZ.LJLLLL(readTextEffectBean.effect.getIcon_url().getUrl_list());
        String str4 = readTextEffectBean.mSpeaker.ttsAnchorName;
        String resource_id = readTextEffectBean.effect.getResource_id();
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = readTextEffectBean.mSpeaker;
        SpeakerCenter.LJIIIIZZ(new SpeakerCenter.KevaSpeakerBean(effect_id, str3, str4, resource_id, readTextEffectSpeakerExtra2.voiceCreatorUserId, readTextEffectSpeakerExtra2.voiceCreatorUserName, readTextEffectSpeakerExtra2.isCreatorVoice, readTextEffectSpeakerExtra2.ttsAnchorReleaseDate, readTextEffectSpeakerExtra2.ttsReleaseDate));
        LJJZZI(new AqS168S0100000_2(readTextEffectBean, 296));
        this.LLIIJI = readTextEffectBean;
        Iterator<List<ReadTextEffectBean>> it = this.LLI.iterator();
        while (it.hasNext()) {
            for (ReadTextEffectBean readTextEffectBean2 : it.next()) {
                ReadTextEffectBean readTextEffectBean3 = this.LLJJ;
                String str5 = null;
                if (readTextEffectBean3 != null && (readTextEffectSpeakerExtra = readTextEffectBean3.mSpeaker) != null) {
                    str = readTextEffectSpeakerExtra.speakreID;
                } else {
                    str = null;
                }
                if (o.LJ(str, readTextEffectBean.mSpeaker.speakreID)) {
                    LJ = false;
                } else {
                    LJ = o.LJ(readTextEffectBean2.mSpeaker.speakreID, readTextEffectBean.mSpeaker.speakreID);
                }
                readTextEffectBean2.selected = LJ;
                if (LJ) {
                    C63D LLLFZ = LLLFZ();
                    if (LLLFZ != null) {
                        String str6 = readTextEffectBean2.mSpeaker.speakerName;
                        UrlModel iconUrl = readTextEffectBean2.effect.getIconUrl();
                        if (iconUrl != null && (urlList2 = iconUrl.getUrlList()) != null) {
                            str2 = (String) ORZ.LJLLLL(urlList2);
                        } else {
                            str2 = null;
                        }
                        LLLFZ.z4(str6, str2);
                    }
                    InterfaceC139045cy LLLI = LLLI();
                    if (LLLI != null) {
                        String str7 = readTextEffectBean2.mSpeaker.speakerName;
                        UrlModel iconUrl2 = readTextEffectBean2.effect.getIconUrl();
                        if (iconUrl2 != null && (urlList = iconUrl2.getUrlList()) != null) {
                            str5 = (String) ORZ.LJLLLL(urlList);
                        }
                        LLLI.z4(str7, str5);
                    }
                }
            }
        }
        LJJZZI(new AqS168S0100000_2(this, 297));
        this.LLJJ = readTextEffectBean;
    }

    @Override // X.InterfaceC138705cQ
    public void Mz(ExceptionResult exceptionResult) {
        this.LLILZLL = System.currentTimeMillis() - this.LLILZIL;
        if (exceptionResult != null) {
            this.LLILLJJLI.LIZ(C1DH.LJJJIL(new C138355br().LIZ(exceptionResult.getErrorCode())));
            C138205bc c138205bc = this.LLILLJJLI;
            String msg = exceptionResult.getMsg();
            if (msg == null) {
                msg = "Unknown error";
            }
            c138205bc.LIZIZ(msg);
        }
        this.LLIZ = true;
    }

    @Override // X.InterfaceC138705cQ
    public void TZ(String str) {
        if (C78685UuP.LJJJZ(str)) {
            C63D LLLFZ = LLLFZ();
            if (LLLFZ != null) {
                LLLFZ.z4(null, null);
            }
            InterfaceC139045cy LLLI = LLLI();
            if (LLLI != null) {
                LLLI.z4(null, null);
            }
        }
        AqS70S1100000_2 aqS70S1100000_2 = new AqS70S1100000_2(this, str, 2);
        if (this.LLJJIJI && this.LLIIIILZ.isEmpty() && !this.LLFII && str != null) {
            H00(new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1, -1, 1048575, null), true, new AqS149S0200000_2(this, aqS70S1100000_2, 43));
            return;
        }
        if (((Boolean) aqS70S1100000_2.invoke()).booleanValue()) {
            return;
        }
        C63D LLLFZ2 = LLLFZ();
        if (LLLFZ2 != null) {
            LLLFZ2.z4(null, null);
        }
        InterfaceC139045cy LLLI2 = LLLI();
        if (LLLI2 != null) {
            LLLI2.z4(null, null);
        }
    }

    @Override // X.InterfaceC138705cQ
    public void jU(List<List<ReadTextEffectBean>> sourceList) {
        o.LJIIIZ(sourceList, "sourceList");
        this.LLIIII = new ArrayList(sourceList);
    }

    @Override // X.InterfaceC138705cQ
    public void k40(boolean z) {
        this.LLIL = z;
    }

    @Override // X.InterfaceC138705cQ
    public void yg0(List<? extends ReadTextEffectBean> unlockVoiceEffect) {
        o.LJIIIZ(unlockVoiceEffect, "unlockVoiceEffect");
        this.LLIL = true;
        Iterator<? extends ReadTextEffectBean> it = unlockVoiceEffect.iterator();
        while (it.hasNext()) {
            ListProtector.add(this.LLILIL, 0, it.next());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138075bP(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 511));
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), C63D.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), InterfaceC139045cy.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), InterfaceC139655dx.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LL = true;
        this.LLD = "";
        this.LLFZ = new CopyOnWriteArrayList<>();
        this.LLI = new ArrayList();
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LLIIII = c61878OQg;
        this.LLIIIILZ = c61878OQg;
        this.LLIIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 509));
        this.LLIIIL = new HashMap<>(20);
        this.LLIIJLIL = "";
        this.LLIIL = "";
        this.LLIILZL = new ArrayList();
        this.LLIIZ = C48841JEv.LIZIZ();
        this.LLILII = UCI.LJI(getDiContainer(), InterfaceC138265bi.class, null);
        this.LLILIL = new ArrayList();
        this.LLILL = C269113v.LIZ(this, InterfaceC138185ba.class);
        this.LLILLIZIL = UCI.LJII(getDiContainer(), InterfaceC138315bn.class, null);
        this.LLILLJJLI = new C138205bc();
        this.LLILLL = new C138115bT();
        this.LLJ = C138275bj.LJLIL;
        this.LLJI = new AqS152S0100000_2(this, 510);
        this.LLJIJIL = C138335bp.LJLIL;
        this.LLJILJIL = C137925bA.LJLIL;
        this.LLJILJILJ = new AqS168S0100000_2(this, 298);
        this.LLJJIJI = true;
    }

    private final void LLIIZ(TextStickerData textStickerData, String str) {
        C138655cL aw;
        if (ERZ.LIZJ()) {
            C5L7.LIZIZ();
        }
        if (textStickerData == null && (textStickerData = this.LLF) == null) {
            textStickerData = this.LLJJI;
        }
        if (textStickerData != null) {
            InterfaceC139045cy LLLI = LLLI();
            if (LLLI != null && (aw = LLLI.aw()) != null) {
                aw.LJIILIIL(C137045Zk.LIZJ(textStickerData, true, null));
            }
            if (textStickerData.getAudioTrackIndex() >= 0 || !TextUtils.isEmpty(textStickerData.getNleUuid())) {
                C138735cT.LIZ(new ShortVideoCommonParams(LLLLIL().mShootWay, H7R.LJIIIIZZ(LLLLIL()), H7R.LJIIIZ(LLLLIL()), LLLLIL().getCreationId()), null, str, 2);
                String speakerID = textStickerData.getSpeakerID();
                if (speakerID != null) {
                    Rl(speakerID, textStickerData);
                }
                InterfaceC153045zY value = LLJLIL().Kh().getValue();
                if (value != null && !TextUtils.isEmpty(textStickerData.getNleUuid())) {
                    C122034qd LJJI = C17N.LJJI(value);
                    if (LJJI != null) {
                        C122004qa c122004qa = LJJI.LJFF().get(textStickerData.getNleUuid());
                        if (c122004qa != null) {
                            C122034qd LJJI2 = C17N.LJJI(value);
                            if (LJJI2 != null) {
                                LJJI2.LJFF().LJFF(c122004qa);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        textStickerData.setNleUuid("");
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                textStickerData.setHasReadTextAudio(false);
                textStickerData.setAudioTrackIndex(-1);
                textStickerData.setSpeakerID(null);
            }
        }
        Iterator<List<ReadTextEffectBean>> it = this.LLI.iterator();
        while (it.hasNext()) {
            Iterator<ReadTextEffectBean> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().selected = false;
            }
        }
        LJJZZI(new AqS168S0100000_2(this, 291));
        C63D LLLFZ = LLLFZ();
        if (LLLFZ != null) {
            LLLFZ.z4(null, null);
        }
        InterfaceC139045cy LLLI2 = LLLI();
        if (LLLI2 != null) {
            LLLI2.z4(null, null);
        }
        this.LLJJ = null;
        this.LLJJI = null;
    }

    public final void LLLLLL(ReadTextEffectBean readTextEffectBean, int i) {
        List<String> urlList;
        String str;
        List<String> urlList2;
        String str2;
        String str3;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        ReadTextEffectBean readTextEffectBean2 = this.LLJJ;
        String str4 = null;
        if (readTextEffectBean2 != null) {
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = readTextEffectBean2.mSpeaker;
            if (readTextEffectSpeakerExtra2 != null) {
                str2 = readTextEffectSpeakerExtra2.speakreID;
            } else {
                str2 = null;
            }
            if (readTextEffectBean != null && (readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker) != null) {
                str3 = readTextEffectSpeakerExtra.speakreID;
            } else {
                str3 = null;
            }
            if (o.LJ(str2, str3)) {
                return;
            }
        }
        if (readTextEffectBean == null) {
            LLIIZ(null, "text_reading_panel");
            return;
        }
        C63D LLLFZ = LLLFZ();
        if (LLLFZ != null) {
            String str5 = readTextEffectBean.mSpeaker.speakerName;
            UrlModel iconUrl = readTextEffectBean.effect.getIconUrl();
            if (iconUrl != null && (urlList2 = iconUrl.getUrlList()) != null) {
                str = (String) ORZ.LJLLLL(urlList2);
            } else {
                str = null;
            }
            LLLFZ.z4(str5, str);
        }
        InterfaceC139045cy LLLI = LLLI();
        if (LLLI != null) {
            String str6 = readTextEffectBean.mSpeaker.speakerName;
            UrlModel iconUrl2 = readTextEffectBean.effect.getIconUrl();
            if (iconUrl2 != null && (urlList = iconUrl2.getUrlList()) != null) {
                str4 = (String) ORZ.LJLLLL(urlList);
            }
            LLLI.z4(str6, str4);
        }
        IInternalAVService LIZ = AVServiceImpl.LIZ();
        LIZ.setLastStickerId(readTextEffectBean.effect.getEffectId(), 7);
        LIZ.setLastStickerId(readTextEffectBean.effect.getResourceId(), 6);
        C138115bT c138115bT = this.LLILLL;
        String effectId = readTextEffectBean.effect.getEffectId();
        c138115bT.getClass();
        o.LJIIIZ(effectId, "effectId");
        c138115bT.LIZ.put("effect_id", effectId);
        TextStickerData textStickerData = this.LLF;
        if (textStickerData != null) {
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra3 = readTextEffectBean.mSpeaker;
            if (readTextEffectSpeakerExtra3.voiceUseCommercial == 1 && SpeakerCenter.LJI(readTextEffectSpeakerExtra3.speakreID)) {
                Activity LJIJJ = C78688UuS.LJIJJ(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                String string = C78688UuS.LJIJJ(this).getResources().getString(R.string.trn);
                o.LJIIIIZZ(string, "activity.resources.getSt…ttospeech_selected_toast)");
                creativeToastBuilder.message(string);
                creativeToastBuilder.duration(3000L);
                C78915Uy7.LJJIIZI(LJIJJ, 3021, creativeToastBuilder);
                SpeakerCenter.LJIIJJI(readTextEffectBean.mSpeaker.speakreID);
            }
            String textStr = textStickerData.getTextStr();
            if (textStr != null) {
                LLILZLL(textStr, this.LLFFF, readTextEffectBean);
            }
        }
        String LJIJ = OUP.LJIJ(readTextEffectBean.effect);
        boolean LJ = o.LJ(OUP.LJIILL(readTextEffectBean.effect), ((RBX) HG3.LJIILL()).getCurUserId());
        VideoPublishEditModel LLLLIL = LLLLIL();
        String str7 = readTextEffectBean.mSpeaker.speakreID;
        String effectId2 = readTextEffectBean.effect.getEffectId();
        TTSCategory tTSCategory = readTextEffectBean.category;
        C138735cT.LJI(LLLLIL, str7, i, null, LJIJ, LJ ? 1 : 0, effectId2, tTSCategory.name, tTSCategory.id, 1048);
        C138735cT.LJ(LLLLIL(), readTextEffectBean.mEffect);
    }

    @Override // X.InterfaceC138705cQ
    public void Rl(String speakerID, TextStickerData data) {
        ReadTextEffectBean readTextEffectBean;
        o.LJIIIZ(speakerID, "speakerID");
        o.LJIIIZ(data, "data");
        if (!this.LLFZ.isEmpty()) {
            Iterator<ReadTextEffectBean> it = this.LLFZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    readTextEffectBean = it.next();
                    if (o.LJ(readTextEffectBean.mSpeaker.speakreID, speakerID)) {
                        break;
                    }
                } else {
                    readTextEffectBean = null;
                    break;
                }
            }
            ReadTextEffectBean readTextEffectBean2 = readTextEffectBean;
            if (readTextEffectBean2 != null) {
                C137935bB.LIZIZ(LLLLIL(), readTextEffectBean2.effect);
                return;
            }
            return;
        }
        if (!(!data.getTtsAudioBean().getChallengeIds().isEmpty())) {
            return;
        }
        C137935bB.LIZJ(LLLLIL(), data.getTtsAudioBean().getChallengeIds());
    }

    private final void LLILZLL(String str, int i, ReadTextEffectBean readTextEffectBean) {
        String str2;
        List<String> urlList;
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = readTextEffectBean.mSpeaker.speakreID;
        String effect_id = readTextEffectBean.effect.getEffect_id();
        UrlModel iconUrl = readTextEffectBean.effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null) {
            str2 = (String) ORZ.LJLLLL(urlList);
        } else {
            str2 = null;
        }
        String str4 = readTextEffectBean.mSpeaker.ttsAnchorName;
        String resource_id = readTextEffectBean.effect.getResource_id();
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
        String str5 = readTextEffectSpeakerExtra.voiceCreatorUserName;
        String str6 = readTextEffectSpeakerExtra.voiceCreatorUserId;
        boolean z = readTextEffectSpeakerExtra.isCreatorVoice;
        long j = readTextEffectSpeakerExtra.ttsAnchorReleaseDate;
        long j2 = readTextEffectSpeakerExtra.ttsReleaseDate;
        OSZ<File, Integer> LLJJJIL2 = LLJJJIL(str3);
        if (LLJJJIL2 != null) {
            LLJI(LLJJJIL2.getFirst(), LLJJJIL2.getSecond().intValue(), readTextEffectBean);
            this.LLILLL.LIZ.put("use_cache", 1);
            SafeHandler safeHandler = this.LJZI;
            if (safeHandler != null) {
                safeHandler.postDelayed(new ARunnableS38S0100000_2(this, 113), 1000L);
                return;
            } else {
                o.LJIJI("mSafeHandler");
                throw null;
            }
        }
        this.LLILLL.LIZ.put("use_cache", 0);
        XKX.LIZLLL(this.LLIIZ, new C138045bM(CoroutineExceptionHandler.LJJJJIZL, this, i, readTextEffectBean), null, new C137995bH(this, i, readTextEffectBean, str, str3, currentTimeMillis, effect_id, str2, str4, resource_id, str5, str6, z, j, j2, null), 2);
    }

    private final void LLJI(File file, int i, ReadTextEffectBean readTextEffectBean) {
        String str;
        String str2;
        List<String> urlList;
        String value = readTextEffectBean.mSpeaker.speakreID;
        String effect_id = readTextEffectBean.effect.getEffect_id();
        UrlModel iconUrl = readTextEffectBean.effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null) {
            str = (String) ORZ.LJLLLL(urlList);
        } else {
            str = null;
        }
        String str3 = readTextEffectBean.mSpeaker.ttsAnchorName;
        String resource_id = readTextEffectBean.effect.getResource_id();
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
        String str4 = readTextEffectSpeakerExtra.voiceCreatorUserId;
        String str5 = readTextEffectSpeakerExtra.voiceCreatorUserName;
        boolean z = readTextEffectSpeakerExtra.isCreatorVoice;
        long j = readTextEffectSpeakerExtra.ttsAnchorReleaseDate;
        long j2 = readTextEffectSpeakerExtra.ttsReleaseDate;
        TextStickerData textStickerData = this.LLF;
        if (textStickerData != null) {
            LLLZLL(readTextEffectBean);
            textStickerData.setAudioTrackDuration(i);
            textStickerData.setAudioTrackFilePath(file.getAbsolutePath());
            textStickerData.setVoiceEffectId(effect_id);
            textStickerData.setVoiceEffectIconUrl(str);
            textStickerData.setVoiceAnchorName(str3);
            textStickerData.setVoiceEffectResourceId(resource_id);
            textStickerData.setVoiceCreatorUserId(str4);
            textStickerData.setVoiceCreatorUserName(str5);
            textStickerData.setCreatorVoice(z);
            textStickerData.setTtsAnchorReleaseDate(j);
            textStickerData.setTtsReleaseDate(j2);
            textStickerData.getTtsExtraMap().put("tts_tab_name", readTextEffectBean.category.name);
            textStickerData.getTtsExtraMap().put("tts_tab_id", readTextEffectBean.category.id);
            List<String> audioPathList = textStickerData.getAudioPathList();
            String absolutePath = file.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "file.absolutePath");
            audioPathList.add(absolutePath);
            TextStickerData textStickerData2 = this.LLF;
            if (textStickerData2 != null) {
                str2 = textStickerData2.getTextStr();
            } else {
                str2 = null;
            }
            textStickerData.setAudioText(str2);
            String speakerID = textStickerData.getSpeakerID();
            boolean z2 = true;
            if (speakerID != null) {
                if (!o.LJ(speakerID, value)) {
                    Rl(speakerID, textStickerData);
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            textStickerData.setSpeakerID(value);
            o.LJIIIZ(value, "value");
            SpeakerCenter.LIZ.storeString("setLastVoice", value);
            SpeakerCenter.LJIIJ(new SpeakerCenter.KevaSpeakerBean(effect_id, str, str3, resource_id, str4, str5, z, j, j2));
            if (!this.LJZL) {
                LJJZZI(C138195bb.LJLIL);
            }
            LLLIIIL().LJJJJL();
            LLLIIIL().xn(C78886Uxe.LJJI(textStickerData));
            LLLIIIL().k3();
            if (z2) {
                C137935bB.LIZ(C86793Y4n.LJJIJIIJIL(this.LJLL), LLLLIL(), readTextEffectBean.effect);
            }
        }
    }

    @Override // X.InterfaceC138705cQ
    public void H00(TextStickerData data, boolean z, InterfaceC65784Pro<C76800UCe> success) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(success, "success");
        C78688UuS.LJIJJ(this);
        if (C78688UuS.LJIJJ(this).isFinishing()) {
            return;
        }
        if (this.LLFII) {
            LLIILZL(data);
            return;
        }
        InterfaceC138315bn LLLJIL = LLLJIL();
        if (LLLJIL != null) {
            LLLJIL.hashCode();
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C137515aV(this, z, data, success, null), 3);
    }

    public final void LJZI(TextStickerData textStickerData, File file, int i) {
        String speakerID = textStickerData.getSpeakerID();
        if (o.LJ(textStickerData.getSpeakerID(), this.LLIIJLIL)) {
            speakerID = "";
        } else if (speakerID == null) {
            return;
        }
        this.LLIIIL.put(new C137695an(textStickerData.getAudioText(), speakerID), new OSZ<>(file, Integer.valueOf(i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fa, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0131, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0143, code lost:
    
        if (r2 == null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LLLLZIL(java.lang.String r31, final com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r32, final java.lang.String r33, final X.InterfaceC88473Ynt<? super java.lang.String, ? super com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter.KevaSpeakerBean, ? super com.ss.android.ugc.effectmanager.effect.model.Effect, X.C76800UCe> r34) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138075bP.LLLLZIL(java.lang.String, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, java.lang.String, X.Ynt):void");
    }

    public static /* synthetic */ void LLLLZLLIL(C138075bP c138075bP, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c138075bP.LLLLZLL(str);
    }

    public final void LLIZ(final int i, final String str, final int i2, final ReadTextEffectBean readTextEffectBean) {
        SafeHandler safeHandler = this.LJZI;
        if (safeHandler != null) {
            safeHandler.post(new Runnable() { // from class: X.5bR
                public final void LIZ() {
                    ReadTextEffectBean readTextEffectBean2;
                    int i3 = i;
                    C138075bP c138075bP = this;
                    if (i3 != c138075bP.LLFFF) {
                        return;
                    }
                    c138075bP.LJJZZI(new AqS168S0100000_2(c138075bP, 293));
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    if (!C47918IrK.LIZ(C78688UuS.LJJIII(this))) {
                        creativeToastBuilder.messageRes(R.string.e45);
                    } else {
                        String str2 = str;
                        if (str2 == null || TextUtils.isEmpty(str2)) {
                            creativeToastBuilder.messageRes(R.string.s6k);
                        } else {
                            creativeToastBuilder.message(str);
                        }
                    }
                    this.LLILLL.LIZIZ(C1DH.LJJJIL(new C138355br().LIZ(i2)));
                    C138115bT c138115bT = this.LLILLL;
                    String str3 = str;
                    if (str3 == null) {
                        str3 = "unknown error";
                    }
                    c138115bT.LIZ.put("error_msg", str3);
                    this.LLILLL.LIZLLL();
                    C78915Uy7.LJJIIZI(C78688UuS.LJIJJ(this), 3019, creativeToastBuilder);
                    C138075bP c138075bP2 = this;
                    ReadTextEffectBean readTextEffectBean3 = readTextEffectBean;
                    Iterator<List<ReadTextEffectBean>> it = c138075bP2.LLI.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Iterator<ReadTextEffectBean> it2 = it.next().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                readTextEffectBean2 = it2.next();
                                if (o.LJ(readTextEffectBean2.effect.getEffectId(), readTextEffectBean3.effect.getEffectId())) {
                                    break;
                                }
                            } else {
                                readTextEffectBean2 = null;
                                break;
                            }
                        }
                        ReadTextEffectBean readTextEffectBean4 = readTextEffectBean2;
                        if (readTextEffectBean4 != null) {
                            readTextEffectBean4.selected = false;
                            break;
                        }
                    }
                    C138075bP c138075bP3 = this;
                    c138075bP3.LJJZZI(new AqS168S0100000_2(c138075bP3, 294));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            o.LJIJI("mSafeHandler");
            throw null;
        }
    }

    @Override // X.InterfaceC138705cQ
    public void Xo0(boolean z, boolean z2, C67P c67p, String enterFrom, InterfaceC65784Pro<C76800UCe> goEditView) {
        TextStickerData textStickerData;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(goEditView, "goEditView");
        this.LLFF = c67p;
        if (c67p != null && (textStickerData = c67p.getData()) != null) {
            textStickerData.setTextStr(c67p.getText());
        } else {
            textStickerData = null;
        }
        SB(z, z2, textStickerData, enterFrom, goEditView, new AqS149S0200000_2(this, c67p, 42));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter$KevaSpeakerBean] */
    /* JADX WARN: Type inference failed for: r6v20, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData] */
    @Override // X.InterfaceC138705cQ
    public void dH(String text, String speaker, SpeakerCenter.KevaSpeakerBean speakerBean, TextStickerData textStickerData, boolean z) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(speaker, "speaker");
        o.LJIIIZ(speakerBean, "speakerBean");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = speaker;
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = speakerBean;
        C138115bT c138115bT = this.LLILLL;
        c138115bT.LJ();
        c138115bT.LIZ.put("feature_name", "apply_tts_effect");
        c138115bT.LJFF("tts_actionSheet");
        String creationId = LLLLIL().getCreationId();
        o.LJIIIIZZ(creationId, "publishEditModel.creationId");
        c138115bT.LIZ(creationId);
        boolean z2 = false;
        if (C69C.LIZJ() && z) {
            if (this.LLJJIJI && this.LLIIIILZ.isEmpty() && !this.LLFII) {
                H00(new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1, -1, 1048575, null), true, new C138065bO(this, text, c68322mC, c68322mC2, textStickerData, z));
                this.LLJJIJI = false;
                return;
            }
            List<ReadTextEffectBean> LLJILJILJ = ORZ.LLJILJILJ(this.LLIIIILZ);
            LLJJIJI(LLJILJILJ);
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) ORZ.LLIIL(LLJILJILJ, V0Q.Default);
            if (readTextEffectBean != null && C78685UuP.LJJJZ(readTextEffectBean.mSpeaker.speakreID) && C78685UuP.LJJJZ(readTextEffectBean.effect.getEffect_id())) {
                c68322mC.element = readTextEffectBean.mSpeaker.speakreID;
                long j = 0;
                c68322mC2.element = new SpeakerCenter.KevaSpeakerBean(readTextEffectBean.effect.getEffect_id(), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z2, j, j, 510, 0 == true ? 1 : 0);
            }
        }
        this.LLIL = false;
        if (!C167496hl.LIZIZ(text)) {
            C24540xm.LIZ(R.string.e49, C78688UuS.LJIJJ(this), 1018);
            return;
        }
        this.LLJJIII = false;
        LLILL(LLILZIL());
        LLJLIL().wZ(true);
        InterfaceC153045zY value = LLJLIL().Kh().getValue();
        if (value != null) {
            value.pause();
        }
        C68322mC c68322mC3 = new C68322mC();
        c68322mC3.element = textStickerData;
        if (textStickerData == 0) {
            c68322mC3.element = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1, -1, 1048575, null);
        }
        C138115bT c138115bT2 = this.LLILLL;
        String voiceEffectId = ((SpeakerCenter.KevaSpeakerBean) c68322mC2.element).getVoiceEffectId();
        String str = "";
        if (voiceEffectId == null) {
            voiceEffectId = "";
        }
        c138115bT2.getClass();
        c138115bT2.LIZ.put("effect_id", voiceEffectId);
        long currentTimeMillis = System.currentTimeMillis();
        IDaS67S0100000_2 iDaS67S0100000_2 = new IDaS67S0100000_2(CoroutineExceptionHandler.LJJJJIZL, this, 2);
        String str2 = (String) c68322mC.element;
        String voiceEffectId2 = ((SpeakerCenter.KevaSpeakerBean) c68322mC2.element).getVoiceEffectId();
        if (voiceEffectId2 != null) {
            str = voiceEffectId2;
        }
        LLLLZIL(str2, textStickerData, str, new C138055bN(this, iDaS67S0100000_2, currentTimeMillis, c68322mC3, text, textStickerData));
    }

    @Override // X.InterfaceC138705cQ
    public void SB(boolean z, boolean z2, TextStickerData textStickerData, String enterFrom, InterfaceC65784Pro<C76800UCe> goEditView, InterfaceC65784Pro<C76800UCe> callback) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(goEditView, "goEditView");
        o.LJIIIZ(callback, "callback");
        if (z) {
            this.LLJIJIL = goEditView;
        }
        boolean z3 = !z;
        LLJLIL().U2(z3, false, z3);
        C63D LLLFZ = LLLFZ();
        if (LLLFZ != null) {
            LLLFZ.so(z);
        }
        InterfaceC139045cy LLLI = LLLI();
        if (LLLI != null) {
            LLLI.xf(z);
        }
        this.LLIZLLLIL = false;
        if (z) {
            LLLLLJLJLL(enterFrom);
            this.LLIILZL.clear();
            show();
            if (textStickerData == null) {
                return;
            }
            new C139355dT().LIZIZ(true);
            this.LJZL = z2;
            LJJZZI(new AqS168S0100000_2(this, 292));
            LLIIIL(textStickerData);
            H00(textStickerData, false, C138345bq.LJLIL);
        } else {
            LLLZIIL();
            InterfaceC153045zY value = LLJLIL().Kh().getValue();
            if (value != null) {
                value.LLJILJIL(true);
            }
            LLJLIL().DM().setValue(C5MM.LIZ());
            ReadTextEffectBean readTextEffectBean = this.LLJJ;
            if (readTextEffectBean != null) {
                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
                str = readTextEffectSpeakerExtra.speakreID;
                str2 = readTextEffectSpeakerExtra.speakerName;
            } else {
                str = "";
                str2 = "";
            }
            callback.invoke();
            InterfaceC139045cy LLLI2 = LLLI();
            if (LLLI2 != null) {
                LLLI2.OA();
            }
            C138735cT.LIZLLL(new ShortVideoCommonParams(LLLLIL().mShootWay, H7R.LJIIIIZZ(LLLLIL()), H7R.LJIIIZ(LLLLIL()), LLLLIL().getCreationId()), str, str2, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
            this.LL = false;
        }
        LJJZZI(new AqS7S0010000_2(z, 30));
        if (z) {
            if (this.LJZL) {
                LLLJL();
                return;
            }
            InterfaceC143655kP LLJLIL = LLJLIL();
            int LIZIZ = C78885Uxd.LIZIZ(true, false, false, false);
            int LJFF = C81184Vtc.LJFF(C78688UuS.LJIJJ(this)) + ((int) KL2.LIZJ(C78688UuS.LJIJJ(this), 52.0f));
            int LIZJ = (int) KL2.LIZJ(C78688UuS.LJIJJ(this), LLJJJJ);
            int LLLJ = LLLJ();
            AnonymousClass668.LIZIZ().LIZ();
            LLJLIL.oF(C140345f4.LIZIZ(LIZIZ, LJFF, LIZJ, LLLJ, false, false, 960));
            return;
        }
        if (this.LJZL) {
            this.LLJIJIL.invoke();
            TextStickerData textStickerData2 = this.LLF;
            if (textStickerData2 != null) {
                str3 = textStickerData2.getSpeakerID();
            } else {
                str3 = null;
            }
            TZ(str3);
        } else {
            InterfaceC143655kP LLJLIL2 = LLJLIL();
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d4, C78688UuS.LJJIII(this));
            int LJFF2 = C81184Vtc.LJFF(C78688UuS.LJIJJ(this)) + ((int) KL2.LIZJ(C78688UuS.LJIJJ(this), 52.0f));
            int LIZJ2 = (int) KL2.LIZJ(C78688UuS.LJIJJ(this), LLJJJJ);
            int LLLJ2 = LLLJ();
            AnonymousClass668.LIZIZ().LIZ();
            LLJLIL2.oF(C140345f4.LIZ(LJIIIIZZ, LJFF2, LIZJ2, LLLJ2));
        }
        LJJZZI(C138225be.LJLIL);
    }

    public static /* synthetic */ void LLJ(C138075bP c138075bP, int i, String str, int i2, ReadTextEffectBean readTextEffectBean, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = "";
        }
        c138075bP.LLIZ(i, str, i2, readTextEffectBean);
    }
}

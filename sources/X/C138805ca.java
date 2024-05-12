package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.IDObjectS175S0100000_2;
import android.text.TextWatcher;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138805ca extends AbstractC29891Fh<InterfaceC138265bi> implements InterfaceC138265bi, InterfaceC135635Tz {
    public static final C138825cc LJLLLLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public C138815cb LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final List<ReadTextEffectBean> LJLJLLL;
    public final C40871j1<Boolean> LJLL;
    public final C29901Fi<List<String>> LJLLI;
    public final C29901Fi<List<String>> LJLLILLLL;
    public final C5H3 LJLLJ;
    public InterfaceC82683Wch LJLLL;
    public final InterfaceC88472Yns<EffectCategoryModel, Boolean> LJLLLL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.5cc] */
    static {
        TBT tbt = new TBT(C138805ca.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, new TBT(C138805ca.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0), new TBT(C138805ca.class, "textInputLayout", "getTextInputLayout()Lcom/ss/android/ugc/aweme/editSticker/text/view/TextStickerInputLayout;", 0)};
        LJLLLLLL = new Object() { // from class: X.5cc
        };
    }

    public InterfaceC138265bi LJJLIIIJILLIZJL() {
        return this;
    }

    private final InterfaceC143655kP LJJLIIIJJIZ() {
        return (InterfaceC143655kP) this.LJLJJLL.LIZ(this, LJLZ[0]);
    }

    private final InterfaceC139655dx LJJLIIIJLLLLLLLZ() {
        return (InterfaceC139655dx) this.LJLJL.LIZ(this, LJLZ[1]);
    }

    private final TextWatcher LJLJJL() {
        return new IDObjectS175S0100000_2(this, 6);
    }

    public final void LJJLI() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJLLL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public final InterfaceC84497XEf LJJLIIJ() {
        return (InterfaceC84497XEf) this.LJLJJI.getValue();
    }

    public final InterfaceC138705cQ LJJLJ() {
        return (InterfaceC138705cQ) this.LJLLJ.getValue();
    }

    public final C1545664u LJJLJLI() {
        return (C1545664u) this.LJLJLJ.LIZ(this, LJLZ[2]);
    }

    public final void LJLIIL() {
        this.LJLLI.LIZLLL(this, new AObjectS84S0100000_2(this, 208));
        this.LJLLILLLL.LIZLLL(this, new AObjectS84S0100000_2(this, 209));
        C0IB<Boolean> l2 = LJJLIIIJLLLLLLLZ().l2();
        if (l2 != null) {
            l2.LIZIZ(this, new AObjectS84S0100000_2(this, 210));
        }
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC138265bi
    public boolean bx() {
        Boolean LIZ = this.LJLL.LIZ();
        o.LJIIIIZZ(LIZ, "needUnlockTTSVoiceEffect.value");
        return LIZ.booleanValue();
    }

    private final boolean LJLJLJ() {
        if (C1DG.LJIIIIZZ() || CommerceToolsMusicService.LIZIZ(false).U40()) {
            return true;
        }
        return false;
    }

    public final void LJJLIIIIJ() {
        InterfaceC138705cQ LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.n00();
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C138775cX(this, null), 3);
    }

    @Override // X.InterfaceC138265bi
    public boolean RF() {
        InterfaceC138705cQ LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            return LJJLJ.r90();
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (!C19N.LJ("enable_unlock_special_voices", true)) {
            return;
        }
        if ((C00F.LIZ(31744, 0, "text_reader_allowing_choose_sound_effects", true) != 1 && C00F.LIZ(31744, 0, "text_reader_allowing_choose_sound_effects", true) != 3) || LJLJLJ()) {
            return;
        }
        LJJLIIIJLLLLLLLZ().LLLLLLJ(LJLJJL());
        LJJLIIIJJIZ().wf0().observe(this, new AObserverS70S0100000_2(this, 124));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC138265bi getApiComponent() {
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    private final List<ReadTextEffectBean> LJJLL(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator<ReadTextEffectBean> it = this.LJLJLLL.iterator();
            while (true) {
                if (it.hasNext()) {
                    ReadTextEffectBean next = it.next();
                    if (o.LJ(next.mSpeaker.speakreID, str)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final String LJJLIIIJJI(List<String> list) {
        if (list.size() == 1) {
            String string = C78688UuS.LJIJJ(this).getResources().getString(R.string.trp, ((ReadTextEffectBean) ORZ.LJLLJ(LJJLL(list))).mSpeaker.speakerName);
            o.LJIIIIZZ(string, "{\n            val speake…d, speakerName)\n        }");
            return string;
        }
        String string2 = C78688UuS.LJIJJ(this).getResources().getString(R.string.trq);
        o.LJIIIIZZ(string2, "{\n            activity.r…ocked_multiple)\n        }");
        return string2;
    }

    public final String LJJZZI(String str) {
        char[] charArray = str.toCharArray();
        o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (c != ' ' && c != '\n') {
                sb.append(Character.toLowerCase(c));
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public final void LJJZZIII(List<String> list) {
        List<ReadTextEffectBean> LJJLL = LJJLL(list);
        InterfaceC138705cQ LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.yg0(LJJLL);
        }
    }

    public final void LJLJJLL(List<? extends ReadTextEffectBean> list) {
        String userId = C60903NvH.LJIIJJI().getAccountService().getCurrentUserID();
        o.LJIIIZ(userId, "userId");
        String[] stringArray = SpeakerCenter.LIZ.getStringArray(h.LJIIIIZZ(userId), new String[0]);
        o.LJIIIIZZ(stringArray, "keva.getStringArray(Md5U…st(userId), emptyArray())");
        List LJJZZIII = ORY.LJJZZIII(stringArray);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ReadTextEffectBean readTextEffectBean : list) {
            if (!LJJZZIII.contains(readTextEffectBean.mSpeaker.speakreID)) {
                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
                if (readTextEffectSpeakerExtra.lockEasterEgg == 1) {
                    String str = readTextEffectSpeakerExtra.lockKeywordsEasterEgg;
                    if ((true ^ ujb.o.LJJJJJL(str)) && str != null) {
                        Iterator it = s.LJLJJL(str, new String[]{","}, 0, 6).iterator();
                        while (it.hasNext()) {
                            linkedHashMap.put(AnonymousClass028.LIZJ("getDefault()", (String) it.next(), "this as java.lang.String).toLowerCase(locale)"), readTextEffectBean.mSpeaker.speakreID);
                        }
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this.LJLL.LJI(Boolean.TRUE);
            this.LJLJI = new C138815cb(linkedHashMap, ORZ.LLJILJILJ(LJJZZIII));
        }
    }

    @Override // X.InterfaceC138265bi
    public void M40(List<? extends ReadTextEffectBean> voiceEffectBeans) {
        o.LJIIIZ(voiceEffectBeans, "voiceEffectBeans");
        if (o.LJ(this.LJLL.LIZ(), Boolean.FALSE) || (!this.LJLJLLL.isEmpty())) {
            return;
        }
        this.LJLJLLL.addAll(voiceEffectBeans);
        LJLJJLL(voiceEffectBeans);
    }

    public C138805ca(C82622Wbi diContainer, WMH parent) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parent, "parent");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parent;
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 515));
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 516));
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC139655dx.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), C1545664u.class, null);
        this.LJLJLLL = new ArrayList();
        this.LJLL = new C40871j1<>(Boolean.FALSE);
        this.LJLLI = new C29901Fi<>();
        this.LJLLILLLL = new C29901Fi<>();
        this.LJLLJ = C269113v.LIZIZ(this, InterfaceC138705cQ.class);
        this.LJLLLL = C137985bG.LJLIL;
    }
}

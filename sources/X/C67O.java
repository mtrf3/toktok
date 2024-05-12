package X;

import Y.ACallableS8S1400000_2;
import Y.AObjectS84S0100000_2;
import Y.AgS120S0100000_2;
import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.67O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67O extends AbstractC29891Fh<C63D> implements C63D, InterfaceC147435qV, InterfaceC135635Tz {
    public static final C1553967z LLLLII = new C1553967z();
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC1541063a LJLJJI;
    public final int LJLJJL;
    public boolean LJLJJLL;
    public final InterfaceC65784Pro<EnumC139385dW> LJLJL;
    public final AnonymousClass642 LJLJLJ;
    public final TTSVoiceModel LJLJLLL;
    public final InterfaceC65784Pro<C76800UCe> LJLL;
    public final int LJLLI;
    public final C5H3 LJLLILLLL;
    public final C0IB<Boolean> LJLLJ;
    public final LiveEvent<C67P> LJLLL;
    public final LiveEvent<C76800UCe> LJLLLL;
    public final LiveEvent<OSZ<TextStickerData, Boolean>> LJLLLLLL;
    public final LiveEvent<View.OnClickListener> LJLZ;
    public final LiveEvent<InfoStickerModel> LJZ;
    public final C29901Fi<Boolean> LJZI;
    public final LiveEvent<InterfaceC1542963t> LJZL;
    public final LiveEvent<AnonymousClass688> LL;
    public AnonymousClass688 LLD;
    public C68G LLF;
    public final LiveEvent<InterfaceC88471Ynr<C67P, C67P, C76800UCe>> LLFF;
    public final LiveEvent<InterfaceC1552467k> LLFFF;
    public final LiveEvent<InterfaceC88472Yns<C67P, C76800UCe>> LLFII;
    public final LiveEvent<InterfaceC88472Yns<C67P, C76800UCe>> LLFZ;
    public final LiveEvent<InterfaceC1543363x> LLI;
    public final LiveEvent<C76800UCe> LLIFFJFJJ;
    public final LiveEvent<OSZ<Integer, Integer>> LLII;
    public final LiveEvent<C67P> LLIIII;
    public final LiveEvent<OSZ<C67P, Integer>> LLIIIILZ;
    public final LiveEvent<C67P> LLIIIJ;
    public final LiveEvent<C76800UCe> LLIIIL;
    public final LiveEvent<C76800UCe> LLIIIZ;
    public final LiveEvent<Boolean> LLIIJI;
    public final LiveEvent<C76800UCe> LLIIJLIL;
    public final LiveEvent<Boolean> LLIIL;
    public final LiveEvent<C67P> LLIILII;
    public final LiveEvent<C67P> LLIILZL;
    public final LiveEvent<C76800UCe> LLIIZ;
    public final LiveEvent<TextStickerData> LLIL;
    public final LiveEvent<String> LLILII;
    public final LiveEvent<Boolean> LLILIL;
    public final LiveEvent<Boolean> LLILL;
    public final LiveEvent<OSZ<TextStickerData, String>> LLILLIZIL;
    public final LiveEvent<TextStickerData> LLILLJJLI;
    public final LiveEvent<Boolean> LLILLL;
    public final LiveEvent<Boolean> LLILZ;
    public final LiveEvent<TextWatcher> LLILZIL;
    public final LiveEvent<List<TextStickerTextWrap>> LLILZLL;
    public final LiveEvent<C67P> LLIZ;
    public final LiveEvent<Integer> LLIZLLLIL;
    public final LiveEvent<C76800UCe> LLJ;
    public final LiveEvent<C76800UCe> LLJI;
    public final C29901Fi<C67P> LLJIJIL;
    public final LiveEvent<C67P> LLJILJIL;
    public final LiveEvent<C76800UCe> LLJILJILJ;
    public final LiveEvent<C76800UCe> LLJILLL;
    public final LiveEvent<C76800UCe> LLJJ;
    public final LiveEvent<C76800UCe> LLJJI;
    public final LiveEvent<Integer> LLJJIII;
    public final LiveEvent<Integer> LLJJIJI;
    public final LiveEvent<Integer> LLJJIJIIJIL;
    public final LiveEvent<OSZ<String, Integer>> LLJJIJIL;
    public final LiveEvent<Boolean> LLJJJ;
    public final LiveEvent<TextStickerData> LLJJJIL;
    public final C29901Fi<C76800UCe> LLJJJJ;
    public final LiveEvent<C76800UCe> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final MutableLiveData<TextStickerData> LLJLIL;
    public final MutableLiveData<OSZ<String, String>> LLJLILLLLZIIL;
    public C68B LLJLL;
    public boolean LLJLLIL;
    public TextStickerData LLJLLL;
    public MutableLiveData<Boolean> LLJZ;
    public boolean LLJZIJLIL;
    public final C5H3 LLL;
    public final List<TextStickerData> LLLF;
    public final List<C67P> LLLFF;
    public final List<C67P> LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public final C29901Fi<Boolean> LLLIIII;
    public final C29901Fi<C76800UCe> LLLIIIIL;
    public C29901Fi<C76800UCe> LLLIIIL;
    public boolean LLLIIL;
    public OSZ<Integer, Integer> LLLIILIL;
    public final C5H3 LLLIL;
    public final C5H3 LLLILZ;
    public final C29901Fi<C76800UCe> LLLILZJ;
    public final C29901Fi<OSZ<Boolean, Boolean>> LLLILZLLLI;
    public final C29901Fi<Boolean> LLLIZZ;
    public final C29901Fi<C76800UCe> LLLJ;
    public final C40871j1<Boolean> LLLJIL;
    public final C40871j1<C67P> LLLJL;
    public TextWatcher LLLL;

    @Override // X.C63D
    public InterfaceC147435qV LIZ() {
        return this;
    }

    public C63D LJJLIIIJILLIZJL() {
        return this;
    }

    private final C1552167h LJJLIIIJJI() {
        return (C1552167h) this.LLLILZ.getValue();
    }

    private final C1552767n LJJLIIIJJIZ() {
        return (C1552767n) this.LLLIL.getValue();
    }

    private final boolean LJJLIIIJLLLLLLLZ() {
        return this.LLLF.isEmpty();
    }

    private final C1545864w LJJLIIJ() {
        return (C1545864w) this.LJLLILLLL.getValue();
    }

    private final void LJJZZI() {
        AnonymousClass688 anonymousClass688 = this.LLD;
        if (anonymousClass688 != null) {
            anonymousClass688.LJ();
        }
    }

    private final List<C67P> LJLLILLLL() {
        return ORZ.LLILII(new Comparator() { // from class: X.682
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C67P) obj).LLIIII - ((C67P) obj2).LLIIII;
            }
        }, this.LLLFFI);
    }

    @Override // X.C63D
    public void A20() {
        this.LLLFFI.clear();
        LJJZZI();
    }

    @Override // X.C63D
    public void By() {
        C68G c68g = this.LLF;
        if (c68g != null) {
            c68g.LIZ();
        }
    }

    @Override // X.C63D
    public LiveData<OSZ<Float, Boolean>> Jy() {
        return (LiveData) this.LLL.getValue();
    }

    @Override // X.C63D
    public boolean LJIIIIZZ() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LLJZ;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.C63D
    public boolean LJLIL() {
        for (C67P c67p : this.LLLFFI) {
            TextStickerData data = c67p.getData();
            if (data != null && data.getHasReadTextAudio()) {
                if (c67p == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C63D
    public C67P QZ() {
        C67P c67p;
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (true) {
            if (it.hasNext()) {
                c67p = it.next();
                if (c67p.LJLLILLLL) {
                    break;
                }
            } else {
                c67p = null;
                break;
            }
        }
        return c67p;
    }

    @Override // X.C63D
    public List<TextStickerData> S2() {
        ArrayList arrayList = new ArrayList();
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            TextStickerData LJ = it.next().LJ();
            o.LJIIIIZZ(LJ, "view.dumpData()");
            arrayList.add(LJ);
        }
        Iterator<C67P> it2 = this.LLLFF.iterator();
        while (it2.hasNext()) {
            TextStickerData data = it2.next().getData();
            if (data != null) {
                arrayList.add(data);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C63D
    public ArrayList<TextStickerData> S80() {
        ArrayList<TextStickerData> arrayList = new ArrayList<>();
        List<C67P> Va0 = Va0();
        ArrayList arrayList2 = new ArrayList();
        for (C67P c67p : Va0) {
            if (C1JI.LJIL(c67p)) {
                arrayList2.add(c67p);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C67P) it.next()).LJ());
        }
        List<TextStickerData> kc0 = kc0();
        ArrayList arrayList3 = new ArrayList();
        for (TextStickerData textStickerData : kc0) {
            if (true ^ textStickerData.getAddToLayout()) {
                arrayList3.add(textStickerData);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(27));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // X.C63D
    public int Wz() {
        if (this.LLLFFI.isEmpty()) {
            return 0;
        }
        int size = this.LLLFFI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            List<TextStickerTextWrap> textWrapList = ((C67P) ListProtector.get(this.LLLFFI, i2)).getTextWrapList();
            o.LJIIIIZZ(textWrapList, "_stickerList[i].textWrapList");
            for (TextStickerTextWrap textStickerTextWrap : textWrapList) {
                if (textStickerTextWrap != null) {
                    i += textStickerTextWrap.safeStrPair().second.size();
                }
            }
        }
        return i;
    }

    @Override // X.C63D
    public boolean Zu0() {
        return this.LLLFFI.isEmpty();
    }

    @Override // X.C63D
    public void gQ() {
        this.LLLFFI.clear();
    }

    @Override // X.C63D
    public String getTextContent() {
        StringBuilder sb = new StringBuilder();
        int size = Va0().size();
        for (int i = 0; i < size; i++) {
            ((C67P) ListProtector.get(Va0(), i)).LJ();
            TextStickerData data = ((C67P) ListProtector.get(Va0(), i)).getData();
            if (data != null) {
                sb.append(C68W.LJII(data.getTextWrapList()));
            }
            if (i != Va0().size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    @Override // X.C63D
    public void gp() {
        this.LLLF.clear();
    }

    @Override // X.C63D
    public void hide() {
        WMH wmh = this.LJLILLLLZI;
        if (wmh != null && wmh.isAdded(LJJLIIJ())) {
            wmh.hide(LJJLIIJ());
        }
    }

    @Override // X.C63D
    public Iterator<C67P> kM() {
        return this.LLLFFI.listIterator();
    }

    @Override // X.C63D
    public C67P mS() {
        if (this.LLLFFI.isEmpty()) {
            return null;
        }
        return (C67P) ListProtector.get(this.LLLFFI, 0);
    }

    @Override // X.C63D
    public int qV() {
        List<C67P> list = this.LLLFFI;
        ArrayList arrayList = new ArrayList();
        for (C67P c67p : list) {
            if (C1JI.LJJIFFI(c67p)) {
                arrayList.add(c67p);
            }
        }
        return arrayList.size();
    }

    @Override // X.C63D
    public void show() {
        WMH wmh = this.LJLILLLLZI;
        if (wmh == null) {
            return;
        }
        if (!wmh.isAdded(LJJLIIJ())) {
            wmh.add(this.LJLJI, LJJLIIJ(), "EditTextStickerScene");
        }
        wmh.show(LJJLIIJ());
    }

    @Override // X.C63D
    public void uO() {
        StringBuilder sb = new StringBuilder("EditTextStickerComponent -> addAllCaptionView -> _captionDataList.size = ");
        List<TextStickerData> list = this.LLLF;
        ArrayList arrayList = new ArrayList();
        for (TextStickerData textStickerData : list) {
            if (!textStickerData.getAddToLayout()) {
                arrayList.add(textStickerData);
            }
        }
        sb.append(arrayList.size());
        H7B.LIZ(sb.toString());
        this.LLLFF.clear();
        List<TextStickerData> list2 = this.LLLF;
        ArrayList arrayList2 = new ArrayList();
        for (TextStickerData textStickerData2 : list2) {
            if (!textStickerData2.getAddToLayout()) {
                arrayList2.add(textStickerData2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Fq((TextStickerData) it.next());
        }
    }

    @Override // X.C63D
    public void yi0() {
        C68G c68g = this.LLF;
        if (c68g != null) {
            c68g.LIZIZ();
        }
    }

    @Override // X.C63D
    public boolean LIZLLL() {
        LiveEvent<C76800UCe> Bd0 = Bd0();
        o.LJII(Bd0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) Bd0).LJI(C76800UCe.LIZ);
        boolean z = false;
        for (C67P c67p : this.LLLFFI) {
            C1553867y c1553867y = c67p.LJLJJI;
            boolean z2 = c67p.LJZI.LJIIIIZZ;
            c1553867y.LJI = z2;
            if (z2) {
                c67p.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    @Override // X.C63D
    public void LJJJJ() {
        LiveEvent<C76800UCe> l00 = l00();
        o.LJII(l00, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) l00).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public boolean LJJL() {
        if (!Zu0() || !LJJLIIIJLLLLLLLZ()) {
            return true;
        }
        return false;
    }

    @Override // X.C63D
    public void LJLL() {
        LiveEvent<C76800UCe> b4 = b4();
        o.LJII(b4, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) b4).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public List<C67P> LJZL() {
        return Va0();
    }

    @Override // X.C63D
    public void LLIIIILZ() {
        LiveEvent<C76800UCe> i4 = i4();
        o.LJII(i4, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) i4).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public void LLILZ() {
        LiveEvent<C76800UCe> ae0 = ae0();
        o.LJII(ae0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) ae0).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public void LLJLL() {
        LiveEvent<C76800UCe> Yi0 = Yi0();
        o.LJII(Yi0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) Yi0).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public void M6() {
        LiveEvent<C76800UCe> nV = nV();
        o.LJII(nV, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) nV).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public void R7() {
        LiveEvent<C76800UCe> lu0 = lu0();
        o.LJII(lu0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) lu0).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public void Rm0() {
        LiveEvent<C76800UCe> b10 = b10();
        o.LJII(b10, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) b10).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public void T3() {
        LiveEvent<C76800UCe> qw = qw();
        o.LJII(qw, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) qw).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public void j() {
        LiveEvent<C76800UCe> pk0 = pk0();
        o.LJII(pk0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) pk0).LJII(C76800UCe.LIZ);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LLJJJJ.LIZLLL(this, new AObjectS84S0100000_2(this, 270));
    }

    @Override // X.C63D
    public void t8() {
        LiveEvent<C76800UCe> ev0 = ev0();
        o.LJII(ev0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) ev0).LJII(C76800UCe.LIZ);
    }

    @Override // X.C63D
    public LiveEvent<OSZ<Integer, Integer>> AM() {
        return this.LLII;
    }

    @Override // X.C63D
    public LiveEvent<String> AN() {
        return this.LLILII;
    }

    @Override // X.C63D
    public LiveEvent<OSZ<TextStickerData, Boolean>> Ba0() {
        return this.LJLLLLLL;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> Bd0() {
        return this.LJLLLL;
    }

    @Override // X.C63D
    public LiveEvent<InfoStickerModel> Gj0() {
        return this.LJZ;
    }

    @Override // X.C63D
    public C0IB<Boolean> H3() {
        return this.LLLJIL;
    }

    @Override // X.C63D
    public List<C67P> Hi() {
        return this.LLLFFI;
    }

    @Override // X.C63D
    public C68B IG() {
        return this.LLJLL;
    }

    @Override // X.C63D
    public LiveEvent<C67P> Jo() {
        return this.LLIIIJ;
    }

    @Override // X.C63D
    public boolean K60() {
        return this.LLJJL;
    }

    @Override // X.C63D
    public C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI() {
        return this.LLLILZLLLI;
    }

    @Override // X.C63D
    public boolean LLLLILI() {
        return this.LLJZIJLIL;
    }

    @Override // X.C63D
    public C29901Fi<C76800UCe> LLZZZZ() {
        return this.LLLILZJ;
    }

    @Override // X.C63D
    public TextStickerData Mf0() {
        return this.LLJLLL;
    }

    @Override // X.C63D
    public C0IB<Boolean> N4() {
        return this.LJLLJ;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> N70() {
        return this.LLJJJJJIL;
    }

    @Override // X.C63D
    public LiveEvent<OSZ<TextStickerData, String>> Np0() {
        return this.LLILLIZIL;
    }

    @Override // X.C63D
    public LiveEvent<InterfaceC1543363x> Od() {
        return this.LLI;
    }

    @Override // X.C63D
    public LiveEvent<View.OnClickListener> QH() {
        return this.LJLZ;
    }

    @Override // X.C63D
    public LiveData<OSZ<String, String>> Qc() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C63D
    public LiveEvent<TextWatcher> Qn() {
        return this.LLILZIL;
    }

    @Override // X.C63D
    public TextWatcher RB() {
        return this.LLLL;
    }

    @Override // X.C63D
    public LiveEvent<InterfaceC1552467k> T30() {
        return this.LLFFF;
    }

    @Override // X.C63D
    public C29901Fi<C76800UCe> Tt0() {
        return this.LLLIIIL;
    }

    @Override // X.C63D
    public LiveEvent<C67P> Ua() {
        return this.LLIZ;
    }

    @Override // X.C63D
    public List<C67P> Va0() {
        return this.LLLFFI;
    }

    @Override // X.C63D
    public LiveEvent<AnonymousClass688> Vh0() {
        return this.LL;
    }

    @Override // X.C63D
    public C29901Fi<Boolean> Vy() {
        return this.LLLIIII;
    }

    @Override // X.C63D
    public LiveEvent<C67P> W6() {
        return this.LLJILJIL;
    }

    @Override // X.C63D
    public LiveEvent<TextStickerData> Wl() {
        return this.LLIL;
    }

    @Override // X.C63D
    public boolean X1() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> Yi0() {
        return this.LLIIJLIL;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> ae0() {
        return this.LLIIIL;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> b10() {
        return this.LLIIZ;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> b4() {
        return this.LLJ;
    }

    @Override // X.C63D
    public LiveEvent<Integer> c0() {
        return this.LLIZLLLIL;
    }

    @Override // X.C63D
    public LiveEvent<C67P> cb() {
        return this.LLIIII;
    }

    @Override // X.C63D
    public LiveEvent<Integer> cl0() {
        return this.LLJJIJI;
    }

    @Override // X.C63D
    public LiveEvent<InterfaceC1542963t> eC() {
        return this.LJZL;
    }

    @Override // X.C63D
    public LiveEvent<InterfaceC88472Yns<C67P, C76800UCe>> eM() {
        return this.LLFZ;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> ev0() {
        return this.LLJJ;
    }

    @Override // X.C63D
    public LiveEvent<Boolean> fF() {
        return this.LLJJJ;
    }

    @Override // X.C63D
    public LiveEvent<Integer> fZ() {
        return this.LLJJIII;
    }

    @Override // X.C63D
    public LiveEvent<InterfaceC88471Ynr<C67P, C67P, C76800UCe>> fh0() {
        return this.LLFF;
    }

    @Override // X.C63D
    public C29901Fi<C76800UCe> fu() {
        return this.LLLJ;
    }

    @Override // X.C63D
    public LiveData<TextStickerData> g3() {
        return this.LLJLIL;
    }

    @Override // X.C63D
    public boolean gY() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C63D getApiComponent() {
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.C63D
    public LiveEvent<Boolean> hK() {
        return this.LLILIL;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> i4() {
        return this.LLJI;
    }

    @Override // X.C63D
    public LiveEvent<OSZ<C67P, Integer>> iX() {
        return this.LLIIIILZ;
    }

    @Override // X.C63D
    public List<TextStickerData> kc0() {
        return this.LLLF;
    }

    @Override // X.C63D
    public LiveEvent<TextStickerData> kk0() {
        return this.LLJJJIL;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> l00() {
        return this.LLIIIZ;
    }

    @Override // X.C63D
    public LiveEvent<Boolean> li0() {
        return this.LLILL;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> lu0() {
        return this.LLJILLL;
    }

    @Override // X.C63D
    public LiveEvent<Integer> mp() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C63D
    public C0IB<C67P> nO() {
        return this.LLLJL;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> nV() {
        return this.LLJJI;
    }

    @Override // X.C63D
    public LiveEvent<TextStickerData> nq0() {
        return this.LLILLJJLI;
    }

    @Override // X.C63D
    public C29901Fi<Boolean> o() {
        return this.LLLIZZ;
    }

    @Override // X.C63D
    public LiveEvent<Boolean> ol() {
        return this.LLILZ;
    }

    @Override // X.C63D
    public LiveEvent<C67P> ou() {
        return this.LJLLL;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> pk0() {
        return this.LLIFFJFJJ;
    }

    @Override // X.C63D
    public C29901Fi<Boolean> py() {
        return this.LJZI;
    }

    @Override // X.C63D
    public LiveEvent<Boolean> q20() {
        return this.LLIIJI;
    }

    @Override // X.C63D
    public LiveEvent<C76800UCe> qw() {
        return this.LLJILJILJ;
    }

    @Override // X.C63D
    public LiveEvent<C67P> rW() {
        return this.LLIILZL;
    }

    @Override // X.C63D
    public LiveEvent<InterfaceC88472Yns<C67P, C76800UCe>> tE() {
        return this.LLFII;
    }

    @Override // X.C63D
    public LiveEvent<List<TextStickerTextWrap>> ud() {
        return this.LLILZLL;
    }

    @Override // X.C63D
    public LiveEvent<OSZ<String, Integer>> un() {
        return this.LLJJIJIL;
    }

    @Override // X.C63D
    public LiveEvent<Boolean> wa0() {
        return this.LLILLL;
    }

    @Override // X.C63D
    public boolean wj() {
        return this.LLJL;
    }

    @Override // X.C63D
    public LiveEvent<Boolean> y70() {
        return this.LLIIL;
    }

    @Override // X.C63D
    public LiveEvent<C67P> yr0() {
        return this.LLIILII;
    }

    private final void LJJLJLI(C67P c67p) {
        AnonymousClass688 anonymousClass688 = this.LLD;
        if (anonymousClass688 != null) {
            anonymousClass688.LIZJ(c67p);
        }
    }

    private final void LJJLL(C67P c67p) {
        AnonymousClass688 anonymousClass688 = this.LLD;
        if (anonymousClass688 != null) {
            anonymousClass688.LIZIZ(c67p);
        }
    }

    private final void LJJZZIII(C67P c67p) {
        AnonymousClass688 anonymousClass688 = this.LLD;
        if (anonymousClass688 != null) {
            anonymousClass688.LIZLLL(c67p);
        }
    }

    private final void LJLIIL(C67P c67p) {
        AnonymousClass688 anonymousClass688 = this.LLD;
        if (anonymousClass688 != null) {
            anonymousClass688.LIZ(c67p);
        }
    }

    private final void LJLJLJ(boolean z) {
        H7B.LIZ("EditStickerScene -> set enableEditTextSticker");
        this.LLLI = z;
        List<C67P> list = this.LLLFFI;
        ArrayList arrayList = new ArrayList();
        for (C67P c67p : list) {
            if (C1JI.LJJIFFI(c67p)) {
                arrayList.add(c67p);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C67P c67p2 = (C67P) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditStickerScene -> is Text Sticker, setEnableEdit = ");
            LIZ.append(this.LLLI);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            c67p2.setEnableEdit(this.LLLI);
        }
    }

    private final void LJLLL(C67P c67p) {
        List<C67P> list = this.LLLFFI;
        ArrayList arrayList = new ArrayList();
        for (C67P c67p2 : list) {
            C67P c67p3 = c67p2;
            if (C1JI.LJIL(c67p3) && !o.LJ(c67p3, c67p)) {
                arrayList.add(c67p2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C67P c67p4 = (C67P) it.next();
            c67p4.setCenterX(c67p.getCenterX());
            c67p4.setCenterY(c67p.getCenterY());
            C1553867y c1553867y = c67p4.LJLJJI;
            C1553867y c1553867y2 = c67p.LJLJJI;
            c1553867y.LIZ = c1553867y2.LIZ;
            c1553867y.LIZIZ = c1553867y2.LIZIZ;
            c1553867y.LIZJ = c1553867y2.LIZJ;
        }
        for (TextStickerData textStickerData : this.LLLF) {
            textStickerData.setX(c67p.getCenterX());
            textStickerData.setY(c67p.getCenterY());
            textStickerData.setScale(c67p.LJLJJI.LIZ);
            textStickerData.setRotation(c67p.LJLJJI.LIZIZ);
            PointF pointF = c67p.LJLJJI.LIZJ;
            textStickerData.setEditCenterPoint(new Point((int) pointF.x, (int) pointF.y));
        }
        Vy().LJII(Boolean.FALSE);
        C68G c68g = this.LLF;
        if (c68g != null) {
            c68g.LIZJ();
        }
    }

    @Override // X.C63D
    public void AZ(TextStickerData stickerData) {
        o.LJIIIZ(stickerData, "stickerData");
        if (this.LLJLLIL) {
            stickerData.setX(P5(C78688UuS.LJJIII(this)).getFirst().floatValue() * stickerData.getX());
            stickerData.setY(P5(C78688UuS.LJJIII(this)).getSecond().floatValue() * stickerData.getY());
        }
    }

    @Override // X.C63D
    public void Bj0(AnonymousClass688 listener) {
        o.LJIIIZ(listener, "listener");
        this.LLD = listener;
    }

    @Override // X.C63D
    public void Bp0(long j) {
        List<TextStickerData> list = this.LLLF;
        ArrayList arrayList = new ArrayList();
        for (TextStickerData textStickerData : list) {
            TextStickerData textStickerData2 = textStickerData;
            int startTime = textStickerData2.getStartTime();
            if (j <= textStickerData2.getEndTime() && startTime <= j && !textStickerData2.getAddToLayout()) {
                arrayList.add(textStickerData);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TextStickerData textStickerData3 = (TextStickerData) it.next();
            textStickerData3.setAddToLayout(true);
            c8(textStickerData3, true);
        }
        for (C67P c67p : this.LLLFFI) {
            c67p.setPlayPosition(j);
            c67p.LJIL();
        }
    }

    @Override // X.C63D
    public void D60(C67P c67p) {
        LiveEvent<C67P> rW = rW();
        o.LJII(rW, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView?>");
        ((C29901Fi) rW).LJII(c67p);
    }

    @Override // X.C63D
    public void F3(InterfaceC1543363x interfaceC1543363x) {
        LiveEvent<InterfaceC1543363x> Od = Od();
        o.LJII(Od, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.mob.ITextStickerMob?>");
        ((C29901Fi) Od).LJII(interfaceC1543363x);
    }

    @Override // X.C63D
    public void F8(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        List<C67P> list = this.LLLFFI;
        ArrayList arrayList = new ArrayList();
        for (C67P c67p : list) {
            if (C1JI.LJJIFFI(c67p)) {
                arrayList.add(c67p);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C67P) it.next()).LJJ(f, z);
        }
    }

    @Override // X.C63D
    public void Fq(TextStickerData stickerData) {
        o.LJIIIZ(stickerData, "stickerData");
        LiveEvent<TextStickerData> kk0 = kk0();
        o.LJII(kk0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData>");
        ((C29901Fi) kk0).LJII(stickerData);
    }

    @Override // X.C63D
    public void G7(TextStickerData textStickerData) {
        LiveEvent<TextStickerData> Wl = Wl();
        o.LJII(Wl, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData?>");
        ((C29901Fi) Wl).LJII(textStickerData);
    }

    @Override // X.C63D
    public void Gq0(int i) {
        LiveEvent<Integer> cl0 = cl0();
        o.LJII(cl0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Int>");
        ((C29901Fi) cl0).LJII(Integer.valueOf(i));
    }

    @Override // X.C63D
    public void Gt(int i) {
        LiveEvent<Integer> fZ = fZ();
        o.LJII(fZ, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Int>");
        ((C29901Fi) fZ).LJII(Integer.valueOf(i));
    }

    @Override // X.C63D
    public void H5(C67P stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        ListProtector.add(this.LLLFFI, 0, stickerView);
        LJJLL(stickerView);
    }

    @Override // X.C63D
    public void HQ(C68B listener) {
        o.LJIIIZ(listener, "listener");
        this.LLJLL = listener;
    }

    @Override // X.C63D
    public void K3(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // X.C63D
    public void K4(C67P stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LLLFFI.remove(stickerView);
        LJJZZIII(stickerView);
    }

    @Override // X.C63D
    public void LJIIL(MutableLiveData<Boolean> liveData) {
        o.LJIIIZ(liveData, "liveData");
        this.LLJZ = liveData;
    }

    @Override // X.C63D
    public void LJIILIIL(boolean z) {
        C0IB<Boolean> N4 = N4();
        o.LJII(N4, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<kotlin.Boolean>");
        ((C40871j1) N4).LJI(Boolean.valueOf(z));
        MutableLiveData<Boolean> mutableLiveData = this.LLJZ;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.C63D
    public boolean LJJIIZI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (!this.LLLFZ) {
            return false;
        }
        for (C67P c67p : this.LLLFFI) {
            if (c67p.LJIJJLI(event)) {
                if (C1JI.LJIL(c67p)) {
                    LJLLL(c67p);
                }
                LiveEvent<C76800UCe> Bd0 = Bd0();
                o.LJII(Bd0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
                ((C29901Fi) Bd0).LJII(C76800UCe.LIZ);
                TextStickerData LJ = c67p.LJ();
                o.LJIIIIZZ(LJ, "view.dumpData()");
                LJJLJ(LJ);
                LJLIIL(c67p);
                return true;
            }
        }
        return false;
    }

    @Override // X.C63D
    public void LJJIJIIJIL(int i) {
        LiveEvent<Integer> c0 = c0();
        o.LJII(c0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Int>");
        ((C29901Fi) c0).LJII(Integer.valueOf(i));
    }

    @Override // X.C63D
    public boolean LJJIZ(float f) {
        if (!this.LLLFZ) {
            return false;
        }
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILJJIL(f)) {
                return true;
            }
        }
        return false;
    }

    public final void LJJLJ(TextStickerData data) {
        o.LJIIIZ(data, "data");
        this.LLJLIL.setValue(data);
    }

    @Override // X.C63D
    public boolean LJLI(C82537WaL detector) {
        o.LJIIIZ(detector, "detector");
        if (!this.LLLFZ) {
            return false;
        }
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILIIL(detector)) {
                LiveEvent<C76800UCe> Bd0 = Bd0();
                o.LJII(Bd0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
                ((C29901Fi) Bd0).LJII(C76800UCe.LIZ);
                return true;
            }
        }
        return false;
    }

    @Override // X.C63D
    public boolean LJLJI(float f) {
        if (!this.LLLFZ) {
            return false;
        }
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            if (it.next().LJIJJ()) {
                return true;
            }
        }
        return false;
    }

    public final void LJLJJL(boolean z) {
        this.LLLFZ = z;
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            it.next().setEnableEdit(this.LLLFZ);
        }
    }

    public final void LJLJJLL(boolean z) {
        this.LLLII = z;
        List<C67P> list = this.LLLFFI;
        ArrayList arrayList = new ArrayList();
        for (C67P c67p : list) {
            if (C1JI.LJIL(c67p)) {
                arrayList.add(c67p);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C67P) it.next()).setEnableEdit(this.LLLII);
        }
    }

    @Override // X.C63D
    public void LJLLLLLL(boolean z) {
        LiveEvent<Boolean> wa0 = wa0();
        o.LJII(wa0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) wa0).LJII(Boolean.valueOf(z));
    }

    @Override // X.C63D
    public void LLILLIZIL(OSZ<Integer, Integer> osz) {
        if (this.LLLIILIL == null) {
            this.LLLIILIL = osz;
        }
        LiveEvent<OSZ<Integer, Integer>> AM = AM();
        o.LJII(AM, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<kotlin.Int, kotlin.Int>?>");
        ((C29901Fi) AM).LJII(osz);
    }

    @Override // X.C63D
    public void LLLILZ(InterfaceC88472Yns<? super C67P, C76800UCe> interfaceC88472Yns) {
        LiveEvent<InterfaceC88472Yns<C67P, C76800UCe>> tE = tE();
        o.LJII(tE, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Function1<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView, kotlin.Unit>?>");
        ((C29901Fi) tE).LJII(interfaceC88472Yns);
    }

    @Override // X.C63D
    public void LLLIZZ(boolean z) {
        LiveEvent<Boolean> ol = ol();
        o.LJII(ol, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) ol).LJII(Boolean.valueOf(z));
    }

    @Override // X.C63D
    public void LLLLLLJ(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        this.LLLL = watcher;
    }

    @Override // X.C63D
    public boolean LLLLLLLZIL(C82536WaK detector) {
        o.LJIIIZ(detector, "detector");
        if (!this.LLLFZ) {
            return false;
        }
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILL(detector)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C63D
    public void LLLLZ(InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe> interfaceC88471Ynr) {
        LiveEvent<InterfaceC88471Ynr<C67P, C67P, C76800UCe>> fh0 = fh0();
        o.LJII(fh0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Function2<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView, com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView, kotlin.Unit>?>");
        ((C29901Fi) fh0).LJII(interfaceC88471Ynr);
    }

    @Override // X.C63D
    public void Mj(C67P c67p) {
        LiveEvent<C67P> Ua = Ua();
        o.LJII(Ua, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView?>");
        ((C29901Fi) Ua).LJII(c67p);
    }

    @Override // X.C63D
    public void N80(C67P c67p) {
        this.LLJIJIL.LJII(c67p);
    }

    @Override // X.C63D
    public void Nu0(boolean z) {
        this.LLJL = z;
    }

    @Override // X.C63D
    public void O90(String string) {
        o.LJIIIZ(string, "string");
        LiveEvent<String> AN = AN();
        o.LJII(AN, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.String>");
        ((C29901Fi) AN).LJII(string);
    }

    @Override // X.C63D
    public void OE(int i) {
        LiveEvent<Integer> mp = mp();
        o.LJII(mp, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Int>");
        ((C29901Fi) mp).LJII(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    @Override // X.C63D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.OSZ<java.lang.Float, java.lang.Float> P5(android.content.Context r4) {
        /*
            r3 = this;
            X.OSZ<java.lang.Integer, java.lang.Integer> r2 = r3.LLLIILIL
            if (r2 == 0) goto L38
            java.lang.Object r0 = r2.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r1 = (float) r0
            java.lang.Object r0 = r2.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            X.UCe r2 = X.C76800UCe.LIZ
            if (r2 != 0) goto L2a
        L1e:
            if (r4 == 0) goto L2a
            int r0 = X.C81184Vtc.LJ(r4)
            float r1 = (float) r0
            int r0 = X.C81184Vtc.LIZLLL(r4)
            float r0 = (float) r0
        L2a:
            X.OSZ r2 = new X.OSZ
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        L38:
            r1 = 0
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67O.P5(android.content.Context):X.OSZ");
    }

    @Override // X.C63D
    public void P8(boolean z) {
        LJLJLJ(z);
    }

    @Override // X.C63D
    public void PN(C67P c67p) {
        LiveEvent<C67P> Jo = Jo();
        o.LJII(Jo, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView?>");
        ((C29901Fi) Jo).LJII(c67p);
    }

    @Override // X.InterfaceC147435qV
    public boolean Rc(RectF videoRect) {
        o.LJIIIZ(videoRect, "videoRect");
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            PointF[] anglePointList = it.next().getAnglePointList();
            if (anglePointList != null && anglePointList.length != 0) {
                RectF LJIILJJIL = C1E4.LJIILJJIL(anglePointList);
                if (LJIILJJIL.top < videoRect.top || LJIILJJIL.bottom > videoRect.bottom) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C63D
    public void Rx(List<TextStickerTextWrap> content) {
        o.LJIIIZ(content, "content");
        LiveEvent<List<TextStickerTextWrap>> ud = ud();
        o.LJII(ud, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.collections.List<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap>>");
        ((C29901Fi) ud).LJII(content);
    }

    @Override // X.C63D
    public void S9(InterfaceC1552467k interfaceC1552467k) {
        LiveEvent<InterfaceC1552467k> T30 = T30();
        o.LJII(T30, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.listener.OnTextStickerEditListener?>");
        ((C29901Fi) T30).LJII(interfaceC1552467k);
    }

    @Override // X.C63D
    public void U60(C68G listener) {
        o.LJIIIZ(listener, "listener");
        this.LLF = listener;
    }

    @Override // X.C63D
    public void W2(InterfaceC88472Yns<? super C67P, C76800UCe> interfaceC88472Yns) {
        LiveEvent<InterfaceC88472Yns<C67P, C76800UCe>> eM = eM();
        o.LJII(eM, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Function1<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView, kotlin.Unit>?>");
        ((C29901Fi) eM).LJII(interfaceC88472Yns);
    }

    @Override // X.C63D
    public void WI(boolean z) {
        LiveEvent<Boolean> fF = fF();
        o.LJII(fF, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) fF).LJII(Boolean.valueOf(z));
    }

    @Override // X.C63D
    public void ao(boolean z) {
        this.LLJLLIL = z;
    }

    @Override // X.C63D
    public void b1(InfoStickerModel infoStickerModel) {
        LiveEvent<InfoStickerModel> Gj0 = Gj0();
        o.LJII(Gj0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel?>");
        ((C29901Fi) Gj0).LJII(infoStickerModel);
    }

    @Override // X.C63D
    public void c7(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        LiveEvent<View.OnClickListener> QH = QH();
        o.LJII(QH, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<android.view.View.OnClickListener>");
        ((C29901Fi) QH).LJII(listener);
    }

    @Override // X.C63D
    public void cs0(TextStickerData data) {
        o.LJIIIZ(data, "data");
        LiveEvent<TextStickerData> nq0 = nq0();
        o.LJII(nq0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData>");
        ((C29901Fi) nq0).LJII(data);
    }

    @Override // X.C63D
    public void d2(boolean z) {
        LiveEvent<Boolean> q20 = q20();
        o.LJII(q20, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) q20).LJII(Boolean.valueOf(z));
    }

    @Override // X.C63D
    public void f80(C67P stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LLLFFI.remove(stickerView);
        ListProtector.add(this.LLLFFI, 0, stickerView);
        LJJLJLI(stickerView);
    }

    @Override // X.C63D
    public void g5(boolean z) {
        LiveEvent<Boolean> hK = hK();
        o.LJII(hK, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) hK).LJII(Boolean.valueOf(z));
    }

    @Override // X.C63D
    public void gy(boolean z) {
        LJLJJLL(z);
    }

    @Override // X.C63D
    public void h6(boolean z) {
        LiveEvent<Boolean> y70 = y70();
        o.LJII(y70, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) y70).LJII(Boolean.valueOf(z));
        this.LLJZIJLIL = z;
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            it.next().LLII = this.LLJZIJLIL;
        }
    }

    @Override // X.C63D
    public void h9(C67P c67p) {
        LiveEvent<C67P> cb = cb();
        o.LJII(cb, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView?>");
        ((C29901Fi) cb).LJII(c67p);
    }

    @Override // X.C63D
    public void hl0(OSZ<String, Integer> style) {
        o.LJIIIZ(style, "style");
        LiveEvent<OSZ<String, Integer>> un = un();
        o.LJII(un, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<kotlin.String, kotlin.Int>>");
        ((C29901Fi) un).LJII(style);
    }

    @Override // X.C63D
    public void i6(boolean z) {
        LiveEvent<Boolean> li0 = li0();
        o.LJII(li0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) li0).LJII(Boolean.valueOf(z));
    }

    @Override // X.C63D
    public void l9(TextWatcher listener) {
        o.LJIIIZ(listener, "listener");
        LiveEvent<TextWatcher> Qn = Qn();
        o.LJII(Qn, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<android.text.TextWatcher>");
        ((C29901Fi) Qn).LJII(listener);
    }

    @Override // X.C63D
    public boolean onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
        this.LLLIIL = false;
        if (!this.LLLFZ) {
            return false;
        }
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            it.next().LJZI.LJIIIZ = 2;
        }
        Iterator<C67P> it2 = this.LLLFFI.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIIL(event)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C63D
    public boolean onScale(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!this.LLLFZ) {
            return false;
        }
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILLIIL(scaleFactor)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C63D
    public boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!this.LLLFZ) {
            return false;
        }
        for (C67P c67p : this.LLLFFI) {
            if (c67p.LJIJI(scaleFactor)) {
                LiveEvent<C67P> ou = ou();
                o.LJII(ou, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView>");
                ((C29901Fi) ou).LJII(c67p);
                return true;
            }
        }
        return false;
    }

    @Override // X.C63D
    public boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            if (it.next().LJZI.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C63D
    public void q5(InterfaceC1542963t interfaceC1542963t) {
        LiveEvent<InterfaceC1542963t> eC = eC();
        o.LJII(eC, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.listener.OnTextStickerListener?>");
        ((C29901Fi) eC).LJII(interfaceC1542963t);
    }

    @Override // X.C63D
    public void setEnable(boolean z) {
        LJLJJL(z);
    }

    @Override // X.C63D
    public void so(boolean z) {
        this.LLJJJJLIIL = z;
    }

    @Override // X.C63D
    public void uY(boolean z) {
        this.LLJJL = z;
    }

    @Override // X.C63D
    public void vX(TextStickerData data) {
        o.LJIIIZ(data, "data");
        this.LLLF.add(data);
    }

    @Override // X.C63D
    public void wC(TextStickerData textStickerData) {
        this.LLJLLL = textStickerData;
    }

    @Override // X.C63D
    public void wR(C67P stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        LiveEvent<C67P> yr0 = yr0();
        o.LJII(yr0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView?>");
        ((C29901Fi) yr0).LJII(stickerView);
    }

    @Override // X.C63D
    public void wb(C67P view) {
        o.LJIIIZ(view, "view");
        this.LLLFF.add(view);
    }

    @Override // X.C63D
    public void xF(C29901Fi<C76800UCe> c29901Fi) {
        o.LJIIIZ(c29901Fi, "<set-?>");
        this.LLLIIIL = c29901Fi;
    }

    private final C10K<List<TextStickerCompileResult>> LJJLIIIIJ(C1552367j c1552367j, ViewGroup viewGroup) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String str = c1552367j.LIZ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C10K<List<TextStickerCompileResult>> LJIJJLI = C10K.LJIJJLI(arrayList);
            o.LJIIIIZZ(LJIJJLI, "whenAllResult(tasks)");
            return LJIJJLI;
        }
        C76732zl c76732zl = new C76732zl();
        for (final C67P c67p : this.LLLFFI) {
            final int indexOfChild = viewGroup.indexOfChild(c67p);
            final String LIZIZ = LJJLIIIJJIZ().LIZIZ(indexOfChild, c1552367j.LIZ);
            o.LJIIIIZZ(LIZIZ, "compiler.getStickerPath(…ileParam.draftDir, index)");
            C10K task = C10K.LIZIZ(new Callable() { // from class: X.67N
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new TextStickerCompileResult(C67P.this.LJ(), new C67J(LIZIZ, indexOfChild, C67P.this.hashCode()));
                }
            }, C10K.LJIIIIZZ, null);
            o.LJIIIIZZ(task, "task");
            arrayList.add(task);
            c76732zl.element = Math.max(c76732zl.element, indexOfChild);
        }
        Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.setDensity(C6PB.LIZ().getResources().getDisplayMetrics().densityDpi);
        for (C67P c67p2 : this.LLLFF) {
            c76732zl.element++;
            C10K task2 = C10K.LIZIZ(new ACallableS8S1400000_2(createBitmap, viewGroup, c67p2, LJJLIIIJJI().LIZIZ(c76732zl.element, c1552367j.LIZ), c76732zl, 0), C10K.LJIIIIZZ, null);
            o.LJIIIIZZ(task2, "task");
            arrayList.add(task2);
        }
        C10K<List<TextStickerCompileResult>> LJIJJLI2 = C10K.LJIJJLI(arrayList);
        o.LJIIIIZZ(LJIJJLI2, "whenAllResult(tasks)");
        return LJIJJLI2;
    }

    private final PointF LJZI(PointF pointF, Context context) {
        int i;
        C76800UCe c76800UCe;
        int i2;
        PointF pointF2 = new PointF();
        OSZ<Integer, Integer> osz = this.LLLIILIL;
        if (osz != null) {
            i = osz.getFirst().intValue();
            i2 = osz.getSecond().intValue();
            c76800UCe = C76800UCe.LIZ;
        } else {
            i = 0;
            c76800UCe = null;
            i2 = 0;
        }
        if (c76800UCe == null && context != null) {
            i = C81184Vtc.LJ(context);
            i2 = C81184Vtc.LIZLLL(context);
        }
        if (i2 == 0 || i == 0) {
            i = C81184Vtc.LJ(C83739Wtj.LIZ());
            i2 = C81184Vtc.LIZLLL(C83739Wtj.LIZ());
        }
        try {
            C1553967z c1553967z = LLLLII;
            float f = (pointF.x * 1.0f) / i;
            c1553967z.getClass();
            pointF2.set(C1553967z.LIZ(f), C1553967z.LIZ((pointF.y * 1.0f) / i2));
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("x: ");
            LIZ.append(pointF.x);
            LIZ.append(", y: ");
            LIZ.append(pointF.y);
            LIZ.append(", videoW: ");
            LIZ.append(i);
            LIZ.append(", videoH: ");
            LIZ.append(i2);
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EditTextStickerComponent: ");
            LIZ2.append(LIZIZ);
            PEH.LIZIZ(X1D.LIZIZ(LIZ2));
        }
        return pointF2;
    }

    public final C10K<List<TextStickerCompileResult>> LJJLI(String str, ViewGroup container) {
        o.LJIIIZ(container, "container");
        LIZLLL();
        ArrayList arrayList = new ArrayList();
        for (C67P c67p : this.LLLFFI) {
            C10K LJIILL = LJJLIIIJJIZ().LIZ(c67p, container, str, 0, 0, 0, 0).LJIILL(new AgS120S0100000_2(c67p, 15));
            o.LJIIIIZZ(LJIILL, "view in _stickerList) {\n…ull\n                    }");
            arrayList.add(LJIILL);
        }
        C10K<List<TextStickerCompileResult>> LJIJJLI = C10K.LJIJJLI(arrayList);
        o.LJIIIIZZ(LJIJJLI, "whenAllResult(tasks)");
        return LJIJJLI;
    }

    @Override // X.C63D
    public void S10(C67P c67p, Context context) {
        TextStickerData LJ;
        o.LJIIIZ(context, "context");
        if (c67p != null && (LJ = c67p.LJ()) != null) {
            List<C67P> list = this.LLLFFI;
            ArrayList arrayList = new ArrayList();
            for (C67P c67p2 : list) {
                C67P c67p3 = c67p2;
                if (C1JI.LJIL(c67p3) && !o.LJ(c67p3, c67p)) {
                    arrayList.add(c67p2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C67P c67p4 = (C67P) it.next();
                TextStickerData data = c67p4.getData();
                if (data != null) {
                    data.setFontSize(LJ.getFontSize());
                }
                c67p4.setFontSize(LJ.getFontSize());
                c67p4.LJJI(LJ.getBgMode(), LJ.getColor(), LJ.getAlign(), LJ.getFontType());
                TextStickerData captionData = c67p4.LJ();
                o.LJIIIIZZ(captionData, "captionData");
                c67p4.LJJIII(captionData.getEffectTextLayoutConfig(), C47261Igj.LJII(C68W.LIZJ(C68W.LJIILJJIL(captionData, context))));
            }
            List<TextStickerData> list2 = this.LLLF;
            ArrayList arrayList2 = new ArrayList();
            for (TextStickerData textStickerData : list2) {
                if (!textStickerData.getAddToLayout()) {
                    arrayList2.add(textStickerData);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                TextStickerData textStickerData2 = (TextStickerData) it2.next();
                textStickerData2.setBgMode(LJ.getBgMode());
                textStickerData2.setColor(LJ.getColor());
                textStickerData2.setAlign(LJ.getAlign());
                textStickerData2.setFontSize(LJ.getFontSize());
                textStickerData2.setFontType(LJ.getFontType());
                textStickerData2.setTextWrapList(C47261Igj.LJII(C68W.LIZJ(C68W.LJIILJJIL(textStickerData2, context))));
            }
        }
    }

    @Override // X.C63D
    public void aR(C67P c67p, Integer num) {
        LiveEvent<OSZ<C67P, Integer>> iX = iX();
        o.LJII(iX, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView?, kotlin.Int?>>");
        ((C29901Fi) iX).LJII(new OSZ(c67p, num));
    }

    @Override // X.C63D
    public void c8(TextStickerData stickerData, boolean z) {
        o.LJIIIZ(stickerData, "stickerData");
        LiveEvent<OSZ<TextStickerData, Boolean>> Ba0 = Ba0();
        o.LJII(Ba0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, kotlin.Boolean>>");
        ((C29901Fi) Ba0).LJII(new OSZ(stickerData, Boolean.valueOf(z)));
    }

    @Override // X.C63D
    public void fL(float f, boolean z) {
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            it.next().LJJ(f, z);
        }
        Iterator<TextStickerData> it2 = this.LLLF.iterator();
        while (it2.hasNext()) {
            it2.next().setAlpha(new TextStickerData.Pair<>(Float.valueOf(f), Boolean.valueOf(z)));
        }
    }

    @Override // X.C63D
    public C10K<List<TextStickerCompileResult>> kf(C1552367j compileParam, ViewGroup container) {
        o.LJIIIZ(compileParam, "compileParam");
        o.LJIIIZ(container, "container");
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditTextStickerComponent -> compile -> _stickerList.size = ");
        LIZ.append(this.LLLFFI.size());
        H7B.LIZ(X1D.LIZIZ(LIZ));
        int i = -1;
        for (C67P c67p : this.LLLFFI) {
            if (container.indexOfChild(c67p) > i) {
                i = container.indexOfChild(c67p);
            }
            C10K LJIILL = LJJLIIIJJIZ().LIZ(c67p, container, compileParam.LIZ, compileParam.LIZIZ, compileParam.LIZJ, compileParam.LIZLLL, compileParam.LJ).LJIILL(new AgS120S0100000_2(c67p, 16));
            o.LJIIIIZZ(LJIILL, "view in _stickerList) {\n…ull\n                    }");
            arrayList.add(LJIILL);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("EditTextStickerComponent -> _captionViewList.size = ");
        LIZ2.append(this.LLLFF.size());
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        LJJLIIIJJI().LIZIZ = i;
        for (C67P c67p2 : this.LLLFF) {
            C10K LJIILL2 = LJJLIIIJJI().LIZ(c67p2, container, compileParam.LIZ, compileParam.LIZIZ, compileParam.LIZJ, compileParam.LIZLLL, compileParam.LJ).LJIILL(new AgS120S0100000_2(c67p2, 17));
            o.LJIIIIZZ(LJIILL2, "captionView in _captionV…ull\n                    }");
            arrayList.add(LJIILL2);
        }
        C10K<List<TextStickerCompileResult>> LJIJJLI = C10K.LJIJJLI(arrayList);
        o.LJIIIIZZ(LJIJJLI, "whenAllResult(tasks)");
        return LJIJJLI;
    }

    @Override // X.C63D
    public void lp0(float f, boolean z) {
        LiveData<OSZ<Float, Boolean>> Jy = Jy();
        o.LJII(Jy, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Pair<kotlin.Float, kotlin.Boolean>>");
        Jy.setValue(new OSZ<>(Float.valueOf(f), Boolean.valueOf(z)));
    }

    @Override // X.C63D
    public void wk(TextStickerData data, String str) {
        o.LJIIIZ(data, "data");
        LiveEvent<OSZ<TextStickerData, String>> Np0 = Np0();
        o.LJII(Np0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, kotlin.String?>>");
        ((C29901Fi) Np0).LJII(new OSZ(data, str));
    }

    @Override // X.C63D
    public void xS(boolean z, C67P c67p) {
        this.LLLJIL.LJI(Boolean.valueOf(z));
        this.LLLJL.LJI(c67p);
    }

    @Override // X.C63D
    public void z4(String str, String str2) {
        this.LLJLILLLLZIIL.setValue(new OSZ<>(str, str2));
    }

    private final Utterance LJLZ(Context context, InteractStickerStruct interactStickerStruct, C67P c67p) {
        int i;
        List<TextStickerTextWrap> textWrapList = c67p.getTextWrapList();
        o.LJIIIIZZ(textWrapList, "textStickerView.textWrapList");
        try {
            interactStickerStruct.setTextStruct(((TextStickerTextWrap) ListProtector.get(textWrapList, 0)).getText());
        } catch (Exception e) {
            C6PB.LIZJ().LIZIZ(e);
        }
        String LLLZ = C16880lQ.LLLZ("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(c67p.LLFFF)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        String concat = "#".concat(LLLZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('#');
        String LLLZ2 = C16880lQ.LLLZ("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(c67p.LLFF)}, 1));
        o.LJIIIIZZ(LLLZ2, "format(format, *args)");
        LIZ.append(LLLZ2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        int i2 = c67p.LJLJJI.LIZLLL;
        if (i2 != 1) {
            if (i2 == 2 || i2 != 3) {
                i = 0;
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        PointF LJZI = LJZI(new PointF(c67p.getOriginWidth(), c67p.getOriginHeight()), context);
        return new Utterance(c67p.LJJII(-1), c67p.LJJJZ(-1), ((TextStickerTextWrap) ListProtector.get(textWrapList, 0)).getText(), LIZIZ, concat, LJZI.x, LJZI.y, 22, i);
    }

    @Override // X.C63D
    public C10K<List<TextStickerCompileResult>> Ar(C1552367j compileParam, ViewGroup container, boolean z) {
        o.LJIIIZ(compileParam, "compileParam");
        o.LJIIIZ(container, "container");
        LIZLLL();
        if (C138845ce.LIZ() && !z) {
            return LJJLIIIIJ(compileParam, container);
        }
        return kf(compileParam, container);
    }

    @Override // X.C63D
    public boolean LJJLIL(C82537WaL detector, float f, float f2) {
        o.LJIIIZ(detector, "detector");
        if (!this.LLLFZ) {
            return false;
        }
        for (C67P c67p : this.LLLFFI) {
            if (c67p.LJJIIZ()) {
                c67p.LLIIIJ = c67p.LJIIIIZZ(f, f2);
                c67p.LJZI.LIZIZ(f, f2);
                if (c67p.LLIIIL || c67p.LLIIIZ || c67p.LLIIIJ || c67p.LJZI.LJIIIZ == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C63D
    public List<InteractStickerStruct> S7(Context context, List<? extends StickerItemModel> stickerItemModelList, Gson gson) {
        boolean z;
        float stickerScale;
        int i;
        o.LJIIIZ(stickerItemModelList, "stickerItemModelList");
        o.LJIIIZ(gson, "gson");
        ArrayList arrayList = new ArrayList(qV());
        List<C67P> list = this.LLLFFI;
        ArrayList arrayList2 = new ArrayList();
        for (C67P c67p : list) {
            if (C1JI.LJJIFFI(c67p)) {
                arrayList2.add(c67p);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C67P c67p2 = (C67P) it.next();
            if (!c67p2.LJLLILLLL) {
                List<TextStickerTextWrap> textWrapList = c67p2.getTextWrapList();
                o.LJIIIIZZ(textWrapList, "textStickerView.textWrapList");
                InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                interactStickerStruct.setType(18);
                LinkedList linkedList = new LinkedList();
                NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                C1553967z c1553967z = LLLLII;
                float stickerRotate = c67p2.getStickerRotate();
                c1553967z.getClass();
                normalTrackTimeStamp.setRotation(C1553967z.LIZ(stickerRotate));
                if (c67p2.getStickerScale() == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    TextStickerData data = c67p2.getData();
                    if (data != null) {
                        stickerScale = data.getScale();
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    stickerScale = c67p2.getStickerScale();
                }
                normalTrackTimeStamp.setScale(Float.valueOf(stickerScale));
                PointF LJZI = LJZI(new PointF(c67p2.getCenterX(), c67p2.getTextMiddleLineCenterY()), context);
                normalTrackTimeStamp.setX(LJZI.x);
                normalTrackTimeStamp.setY(LJZI.y);
                PointF LJZI2 = LJZI(new PointF(c67p2.getContentViewWidth(), c67p2.getContentViewHeight()), context);
                normalTrackTimeStamp.setWidth(LJZI2.x);
                normalTrackTimeStamp.setHeight(LJZI2.y);
                int i2 = -1;
                normalTrackTimeStamp.setStartTime(c67p2.LJJII(-1));
                normalTrackTimeStamp.setEndTime(c67p2.LJJJZ(-1));
                linkedList.add(normalTrackTimeStamp);
                C78609UtB.LJJJLZIJ(interactStickerStruct, linkedList);
                try {
                    interactStickerStruct.setTextStruct(((TextStickerTextWrap) ListProtector.get(textWrapList, 0)).getText());
                } catch (Exception e) {
                    C6PB.LIZJ().LIZIZ(e);
                }
                int size = stickerItemModelList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (((StickerItemModel) ListProtector.get(stickerItemModelList, i3)).viewHash == c67p2.hashCode()) {
                        interactStickerStruct.setIndex(((StickerItemModel) ListProtector.get(stickerItemModelList, i3)).layerWeight);
                        HashMap hashMap = new HashMap();
                        String str = ((StickerItemModel) ListProtector.get(stickerItemModelList, i3)).stickerId;
                        o.LJIIIIZZ(str, "stickerItemModelList[j].stickerId");
                        hashMap.put("text_sticker_id", str);
                        interactStickerStruct.setAttr(GsonProtectorUtils.toJson(C6PB.LIZIZ(), hashMap));
                        break;
                    }
                    i3++;
                }
                int i4 = c67p2.LLFFF;
                int i5 = c67p2.LLFF;
                if (i4 == i5) {
                    i4 = -16777216;
                } else {
                    i2 = i5;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('#');
                String LLLZ = C16880lQ.LLLZ("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                LIZ.append(LLLZ);
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('#');
                String LLLZ2 = C16880lQ.LLLZ("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                LIZ2.append(LLLZ2);
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                int i6 = c67p2.LJLJJI.LIZLLL;
                if (i6 != 1) {
                    if (i6 == 2 || i6 != 3) {
                        i = 0;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
                PointF LJZI3 = LJZI(new PointF(c67p2.getOriginWidth(), c67p2.getOriginHeight()), context);
                interactStickerStruct.setTextInfo(new TextStickerInfo(LIZIZ2, LIZIZ, "", LJZI3.x, LJZI3.y, 28, i));
                arrayList.add(interactStickerStruct);
            }
        }
        return arrayList;
    }

    @Override // X.C63D
    public InteractStickerStruct wF(Context context, List<? extends StickerItemModel> stickerItemModelList, Gson gson) {
        C67P c67p;
        float stickerScale;
        o.LJIIIZ(stickerItemModelList, "stickerItemModelList");
        o.LJIIIZ(gson, "gson");
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(20);
        ArrayList arrayList = new ArrayList();
        Iterator<C67P> it = this.LLLFFI.iterator();
        do {
            c67p = null;
            if (!it.hasNext()) {
                break;
            }
            c67p = it.next();
        } while (!C1JI.LJIL(c67p));
        C67P c67p2 = c67p;
        if (c67p2 != null || (this.LLLFF.size() > 0 && (c67p2 = (C67P) ListProtector.get(this.LLLFF, 0)) != null)) {
            LinkedList linkedList = new LinkedList();
            NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            C1553967z c1553967z = LLLLII;
            float stickerRotate = c67p2.getStickerRotate();
            c1553967z.getClass();
            normalTrackTimeStamp.setRotation(C1553967z.LIZ(stickerRotate));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditTextStickerComponent -> getInlineCaptionStructList -> textStickerView.stickerScale = ");
            LIZ.append(c67p2.getStickerScale());
            H7B.LIZ(X1D.LIZIZ(LIZ));
            if (c67p2.getStickerScale() == 0.0f) {
                TextStickerData data = c67p2.getData();
                if (data != null) {
                    stickerScale = data.getScale();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                stickerScale = c67p2.getStickerScale();
            }
            normalTrackTimeStamp.setScale(Float.valueOf(stickerScale));
            PointF LJZI = LJZI(new PointF(c67p2.getCenterX(), c67p2.getTextMiddleLineCenterY()), context);
            normalTrackTimeStamp.setX(LJZI.x);
            normalTrackTimeStamp.setY(LJZI.y);
            PointF LJZI2 = LJZI(new PointF(c67p2.getContentViewWidth(), c67p2.getContentViewHeight()), context);
            normalTrackTimeStamp.setWidth(LJZI2.x);
            normalTrackTimeStamp.setHeight(LJZI2.y);
            linkedList.add(normalTrackTimeStamp);
            C78609UtB.LJJJLZIJ(interactStickerStruct, linkedList);
        }
        List<C67P> list = this.LLLFFI;
        ArrayList arrayList2 = new ArrayList();
        for (C67P c67p3 : list) {
            if (C1JI.LJIL(c67p3)) {
                arrayList2.add(c67p3);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJLZ(context, interactStickerStruct, (C67P) it2.next()));
        }
        Iterator<C67P> it3 = this.LLLFF.iterator();
        while (it3.hasNext()) {
            arrayList.add(LJLZ(context, interactStickerStruct, it3.next()));
        }
        H7B.LIZ("EditTextStickerComponent -> getInlineCaptionStructList = captionList.size = " + arrayList.size());
        interactStickerStruct.setCaptionStruct(new CaptionStruct(null, arrayList, 0, null, null, 0L, null, null, 253, null));
        return interactStickerStruct;
    }

    @Override // X.C63D
    public boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            if (it.next().LJZI.LJIIIZ != 2) {
                return true;
            }
        }
        if (!this.LLLIIL) {
            return false;
        }
        this.LLLIIL = false;
        return true;
    }

    @Override // X.C63D
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        Iterator<C67P> it = this.LLLFFI.iterator();
        while (it.hasNext()) {
            if (it.next().LJZI.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C67O(C82622Wbi diContainer, WMH wmh, int i, InterfaceC1541063a interfaceC1541063a, int i2, boolean z, InterfaceC65784Pro<? extends EnumC139385dW> textStickerGuidanceType, AnonymousClass642 anonymousClass642, TTSVoiceModel tTSVoiceModel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i3) {
        List<C67P> arrayList;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(textStickerGuidanceType, "textStickerGuidanceType");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = wmh;
        this.LJLJI = i;
        this.LJLJJI = interfaceC1541063a;
        this.LJLJJL = i2;
        this.LJLJJLL = z;
        this.LJLJL = textStickerGuidanceType;
        this.LJLJLJ = anonymousClass642;
        this.LJLJLLL = tTSVoiceModel;
        this.LJLL = interfaceC65784Pro;
        this.LJLLI = i3;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 702));
        Boolean bool = Boolean.FALSE;
        this.LJLLJ = new C40871j1(bool);
        this.LJLLL = new C29901Fi();
        this.LJLLLL = new C29901Fi();
        this.LJLLLLLL = new C29901Fi();
        this.LJLZ = new C29901Fi();
        this.LJZ = new C29901Fi();
        this.LJZI = new C29901Fi<>();
        this.LJZL = new C29901Fi();
        this.LL = new C29901Fi();
        this.LLFF = new C29901Fi();
        this.LLFFF = new C29901Fi();
        this.LLFII = new C29901Fi();
        this.LLFZ = new C29901Fi();
        this.LLI = new C29901Fi();
        this.LLIFFJFJJ = new C29901Fi();
        this.LLII = new C29901Fi();
        this.LLIIII = new C29901Fi();
        this.LLIIIILZ = new C29901Fi();
        this.LLIIIJ = new C29901Fi();
        this.LLIIIL = new C29901Fi();
        this.LLIIIZ = new C29901Fi();
        this.LLIIJI = new C29901Fi();
        this.LLIIJLIL = new C29901Fi();
        this.LLIIL = new C29901Fi();
        this.LLIILII = new C29901Fi();
        this.LLIILZL = new C29901Fi();
        this.LLIIZ = new C29901Fi();
        this.LLIL = new C29901Fi();
        this.LLILII = new C29901Fi();
        this.LLILIL = new C29901Fi();
        this.LLILL = new C29901Fi();
        this.LLILLIZIL = new C29901Fi();
        this.LLILLJJLI = new C29901Fi();
        this.LLILLL = new C29901Fi();
        this.LLILZ = new C29901Fi();
        this.LLILZIL = new C29901Fi();
        this.LLILZLL = new C29901Fi();
        this.LLIZ = new C29901Fi();
        this.LLIZLLLIL = new C29901Fi();
        this.LLJ = new C29901Fi();
        this.LLJI = new C29901Fi();
        C29901Fi<C67P> c29901Fi = new C29901Fi<>();
        this.LLJIJIL = c29901Fi;
        this.LLJILJIL = c29901Fi;
        this.LLJILJILJ = new C29901Fi();
        this.LLJILLL = new C29901Fi();
        this.LLJJ = new C29901Fi();
        this.LLJJI = new C29901Fi();
        this.LLJJIII = new C29901Fi();
        this.LLJJIJI = new C29901Fi();
        this.LLJJIJIIJIL = new C29901Fi();
        this.LLJJIJIL = new C29901Fi();
        this.LLJJJ = new C29901Fi();
        this.LLJJJIL = new C29901Fi();
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LLJJJJ = c29901Fi2;
        this.LLJJJJJIL = c29901Fi2;
        this.LLJLIL = new MutableLiveData<>();
        this.LLJLILLLLZIIL = new MutableLiveData<>();
        this.LLL = C221108m2.LIZIZ(C148885sq.LJLIL);
        this.LLLF = new ArrayList();
        this.LLLFF = new ArrayList();
        if (C00F.LIZ(31744, 0, "studio_use_thread_save_list_for_sticker", true) == 1) {
            arrayList = new CopyOnWriteArrayList<>();
        } else {
            arrayList = new ArrayList<>();
        }
        this.LLLFFI = arrayList;
        this.LLLFZ = true;
        this.LLLI = true;
        this.LLLII = true;
        this.LLLIIII = new C29901Fi<>();
        this.LLLIIIIL = new C29901Fi<>();
        this.LLLIIIL = new C29901Fi<>();
        this.LLLIL = C221108m2.LIZIZ(AnonymousClass681.LJLIL);
        this.LLLILZ = C221108m2.LIZIZ(AnonymousClass680.LJLIL);
        this.LLLILZJ = new C29901Fi<>();
        this.LLLILZLLLI = new C29901Fi<>();
        this.LLLIZZ = new C29901Fi<>();
        this.LLLJ = new C29901Fi<>();
        this.LLLJIL = new C40871j1<>(bool);
        this.LLLJL = new C40871j1<>(null);
    }

    public /* synthetic */ C67O(C82622Wbi c82622Wbi, WMH wmh, int i, InterfaceC1541063a interfaceC1541063a, int i2, boolean z, InterfaceC65784Pro interfaceC65784Pro, AnonymousClass642 anonymousClass642, TTSVoiceModel tTSVoiceModel, InterfaceC65784Pro interfaceC65784Pro2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i4 & 2) != 0 ? null : wmh, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? null : interfaceC1541063a, (i4 & 16) != 0 ? 30 : i2, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? C1542363n.LJLIL : interfaceC65784Pro, (i4 & 128) != 0 ? null : anonymousClass642, (i4 & 256) != 0 ? null : tTSVoiceModel, (i4 & 512) == 0 ? interfaceC65784Pro2 : null, (i4 & 1024) == 0 ? i3 : 0);
    }
}

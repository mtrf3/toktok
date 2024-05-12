package X;

import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5XF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XF extends AbstractC29891Fh<C5TD> implements C5TD, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final List<Integer> LJLJJI;
    public final List<C121634pz> LJLJJL;
    public final List<Integer> LJLJJLL;
    public final List<C121634pz> LJLJL;

    static {
        TBT tbt = new TBT(C5XF.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5XF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    public C5TD LJJLIIIIJ() {
        return this;
    }

    private final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLJI.LIZ(this, LJLJLJ[1]);
    }

    public final VideoPublishEditModel LJJLIIIJJI() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLJLJ[0]);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.5XH] */
    @Override // X.C5TD
    public void mf() {
        int[] iArr;
        if (LJJLIIIJJI().getOriginal() != 1 && LJJLIIIJJI().getOriginal() != 2 && !C79004UzY.LJJIIJ(LJJLIIIJJI().canvasVideoData)) {
            if (!LJJLIIIJJI().creativeModel.draftInfoModel.isDraft || !LJJLIIIJJI().creativeModel.loudnessBalanceModel.balanceTypes.contains(2)) {
                return;
            }
            LJJLIIIJJI().creativeModel.loudnessBalanceModel.balanceTypes.clear();
            LJJLIIIJJI().creativeModel.loudnessBalanceModel.balanceTypes.add(2);
        }
        LJJLI(this.LJLJJI, this.LJLJJL);
        InterfaceC153045zY value = LJJLIIIJILLIZJL().Kh().getValue();
        VideoPublishEditModel LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI().mIsFromDraft) {
            iArr = ORZ.LLJ(LJJLIIIJJI().creativeModel.loudnessBalanceModel.balanceTypes);
        } else {
            iArr = new int[]{0};
        }
        C5XI.LIZ(value, LJJLIIIJJI, iArr, new C5P7() { // from class: X.5XH
            @Override // X.C5P7
            public final void LIZ(C121634pz[] audioFiltersArray) {
                boolean z;
                o.LJIIIZ(audioFiltersArray, "audioFiltersArray");
                C5XF.this.LJLJJL.clear();
                ORS.LJJLIIIJJIZ(C5XF.this.LJLJJL, audioFiltersArray);
                AudioAlgorithmModel audioAlgorithmModel = C5XF.this.LJJLIIIJJI().creativeModel.audioAlgorithmModel;
                if (audioFiltersArray.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                audioAlgorithmModel.isLoudnessOn = !z;
            }
        });
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (!LJJLIIIJJI().mIsFromDraft) {
            LJJLIIIJJI().creativeModel.loudnessBalanceModel.balanceTypes.clear();
        }
        mf();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C5TD getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C5XF(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new ArrayList();
    }

    private final void LJJLI(List<Integer> list, List<C121634pz> list2) {
        InterfaceC153045zY value = LJJLIIIJILLIZJL().Kh().getValue();
        if (value != null) {
            C122034qd LJJI = C17N.LJJI(value);
            if (LJJI != null) {
                C121634pz[] audioFilters = (C121634pz[]) list2.toArray(new C121634pz[0]);
                o.LJIIIZ(audioFilters, "audioFilters");
                for (C121634pz c121634pz : audioFilters) {
                    LJJI.LJFF().LJII(c121634pz);
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C5TD
    public void fP(String audioUrl, int i, InterfaceC153045zY interfaceC153045zY) {
        C122034qd LJJI;
        InterfaceC123794tT LJFF;
        o.LJIIIZ(audioUrl, "audioUrl");
        LJJLI(this.LJLJJLL, this.LJLJL);
        ArrayList arrayList = new ArrayList();
        if (audioUrl.length() > 0) {
            arrayList.add(2);
        }
        if (interfaceC153045zY != null && (LJJI = C17N.LJJI(interfaceC153045zY)) != null && (LJFF = LJJI.LJFF()) != null && LJFF.LJ(EnumC122254qz.ORIGIN_VOICE_CONVERSION) != null) {
            arrayList.add(0);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        VideoPublishEditModel editModel = LJJLIIIJJI();
        int[] LLJ = ORZ.LLJ(arrayList);
        C5P7 c5p7 = new C5P7() { // from class: X.5XG
            @Override // X.C5P7
            public final void LIZ(C121634pz[] audioFiltersArray) {
                boolean z;
                o.LJIIIZ(audioFiltersArray, "audioFiltersArray");
                C5XF.this.LJLJL.clear();
                ORS.LJJLIIIJJIZ(C5XF.this.LJLJL, audioFiltersArray);
                AudioAlgorithmModel audioAlgorithmModel = C5XF.this.LJJLIIIJJI().creativeModel.audioAlgorithmModel;
                if (audioFiltersArray.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                audioAlgorithmModel.isLoudnessOn = !z;
            }
        };
        o.LJIIIZ(editModel, "editModel");
        if (interfaceC153045zY == null) {
            return;
        }
        C5P6 c5p6 = new C5P6();
        C5XI.LIZIZ(editModel, LLJ, new AqS91S0300000_2(c5p6, interfaceC153045zY, editModel, 5));
        Iterator it = ((ArrayList) c5p6.LIZIZ()).iterator();
        while (it.hasNext()) {
            C5XE c5xe = (C5XE) it.next();
            if (!editModel.creativeModel.loudnessBalanceModel.balanceTypes.contains(Integer.valueOf(c5xe.LJI))) {
                editModel.creativeModel.loudnessBalanceModel.balanceTypes.add(Integer.valueOf(c5xe.LJI));
            }
        }
        C79004UzY.LJIIZILJ(editModel.canvasVideoData);
        c5p6.LIZJ(editModel, interfaceC153045zY, c5p7);
    }
}

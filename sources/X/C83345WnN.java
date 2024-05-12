package X;

import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDrS51S0100000_13;
import android.animation.ObjectAnimator;
import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WnN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83345WnN extends AbstractC29891Fh<InterfaceC83370Wnm> implements InterfaceC83370Wnm, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public InterfaceC82134WLi LJLJJI;
    public final C5H3 LJLJJL;
    public AbstractC83369Wnl LJLJJLL;
    public final C29901Fi<AbstractC83369Wnl> LJLJL;
    public final C40871j1<Boolean> LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final HashMap<String, C83357WnZ> LJLLI;
    public boolean LJLLILLLL;
    public C83372Wno LJLLJ;
    public final C5H3 LJLLL;

    static {
        TBT tbt = new TBT(C83345WnN.class, "undoManagerApi", "getUndoManagerApi()Lcom/ss/android/ugc/aweme/actionai/undo/ActionUndoManagerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C83345WnN.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public InterfaceC83370Wnm LJJLIIIJILLIZJL() {
        return this;
    }

    private final InterfaceC137005Zg LJJLIIIJJIZ() {
        return (InterfaceC137005Zg) this.LJLJLLL.LIZ(this, LJLLLL[0]);
    }

    public final C83343WnL LJJLIIIIJ() {
        return (C83343WnL) this.LJLJJL.getValue();
    }

    public final C83367Wnj LJJLIIIJJI() {
        return (C83367Wnj) this.LJLLL.getValue();
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLL.LIZ(this, LJLLLL[1]);
    }

    private final void LJJLI() {
        if (LJJLIIIIJ().LJLZ() instanceof C83351WnT) {
            LJJLIIIIJ().notifyItemChanged(LJJLIIIIJ().getItemCount() - 1);
            if (!this.LJLLILLLL) {
                return;
            }
            if (C48203Ivv.LJ(C78688UuS.LJJIII(this))) {
                Activity LJIJJ = C45804HyK.LJIJJ(C78688UuS.LJJIII(this));
                if (LJIJJ != null) {
                    C26048AKe c26048AKe = new C26048AKe(LJIJJ);
                    c26048AKe.LJI(C78688UuS.LJJIII(this).getString(R.string.e18));
                    c26048AKe.LJII();
                    return;
                }
                return;
            }
            Activity LJIJJ2 = C45804HyK.LJIJJ(C78688UuS.LJJIII(this));
            if (LJIJJ2 == null) {
                return;
            }
            C26048AKe c26048AKe2 = new C26048AKe(LJIJJ2);
            c26048AKe2.LJI(C78688UuS.LJJIII(this).getString(R.string.e11));
            c26048AKe2.LJII();
        }
    }

    private final void LJJLIIIJLLLLLLLZ() {
        LJJLIIIJJI().LLJILJIL().setAdapter(LJJLIIIIJ());
        C51776KTs LLJILJIL = LJJLIIIJJI().LLJILJIL();
        C78688UuS.LJJIII(this);
        LLJILJIL.setLayoutManager(new LinearLayoutManager());
        LJJLIIIJJI().LLJILJIL().LJII(new C72762Sh4(Integer.valueOf(C173216qz.LIZJ(50.0d, C78688UuS.LJJIII(this))), C173216qz.LIZJ(16.0d, C78688UuS.LJJIII(this)), EnumC72764Sh6.DIRECTION_TOP), -1);
        LJJLIIIIJ().getClass();
        ObjectAnimator duration = ObjectAnimator.ofFloat(LJJLIIIJJI().LLJILJIL(), "alpha", 0.2f).setDuration(100L);
        o.LJIIIIZZ(duration, "ofFloat(scene.getRecycle…\", 0.2f).setDuration(100)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(LJJLIIIJJI().LLJILJIL(), "alpha", 1.0f).setDuration(100L);
        o.LJIIIIZZ(duration2, "ofFloat(scene.getRecycle…ha\", 1f).setDuration(100)");
        LJJLIIIJJI().LLJILJIL().LJIIJJI(new IDrS51S0100000_13(duration, 3));
        LJJLIIIJJI().LLJILJIL().LJIIJ(new UYN(duration, duration2));
        LJJLIIIJJIZ().Sq0().LIZIZ(this, new AObjectS89S0100000_14(this, 19));
    }

    @Override // X.InterfaceC83370Wnm
    public void IR() {
        C83351WnT c83351WnT;
        List<? extends AbstractC83320Wmy> list;
        LJJLIIIJJI().LLJILJIL().setAlpha(1.0f);
        AbstractC83369Wnl LJLZ = LJJLIIIIJ().LJLZ();
        if (!(LJLZ instanceof C83351WnT) || (list = (c83351WnT = (C83351WnT) LJLZ).LJI) == null || list.isEmpty() || c83351WnT.LJII < 0) {
            return;
        }
        RecyclerView.ViewHolder LJJIZ = LJJLIIIJJI().LLJILJIL().LJJIZ(LJJLIIIIJ().getItemCount() - 1);
        if (!(LJJIZ instanceof C83332WnA)) {
            return;
        }
        ((C83332WnA) LJJIZ).P(c83351WnT.LJII);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLJI, LJJLIIIJJI(), "ActionAIChatScene");
        C82622Wbi c82622Wbi = C44384HbQ.LJJJ(this.LJLILLLLZI).LJLLL;
        InterfaceC82134WLi interfaceC82134WLi = null;
        if (c82622Wbi != null) {
            interfaceC82134WLi = (InterfaceC82134WLi) c82622Wbi.LJIIIIZZ(null, InterfaceC82134WLi.class);
        }
        this.LJLJJI = interfaceC82134WLi;
        LJJLIIIJLLLLLLLZ();
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        this.LJLLILLLL = false;
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        this.LJLLILLLL = true;
    }

    @Override // X.InterfaceC83370Wnm
    public LiveEvent<AbstractC83369Wnl> Hx() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC83370Wnm
    public C0IB<Boolean> Ve0() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC83370Wnm getApiComponent() {
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC83370Wnm
    public void uU(int i) {
        LJJLIIIJJI().LLJILJIL().setMaxHeight(i);
        LJJLIIIJJI().LLJILJIL().post(new ARunnableS50S0100000_14(this, 54));
    }

    @Override // X.InterfaceC83370Wnm
    public void yT(AbstractC83369Wnl message) {
        EnumC83358Wna enumC83358Wna;
        C83355WnX c83355WnX;
        EnumC83354WnW enumC83354WnW;
        C83355WnX c83355WnX2;
        EnumC83358Wna enumC83358Wna2;
        C83355WnX c83355WnX3;
        EnumC83354WnW enumC83354WnW2;
        int i;
        o.LJIIIZ(message, "message");
        EnumC83358Wna enumC83358Wna3 = null;
        switch (C83353WnV.LIZJ[message.LIZ().ordinal()]) {
            case 1:
                LJJLIIJ(LLLLIL(), message);
                EnumC83354WnW enumC83354WnW3 = ((C83355WnX) message).LIZJ;
                int[] iArr = C83353WnV.LIZ;
                switch (iArr[enumC83354WnW3.ordinal()]) {
                    case 1:
                        AbstractC83369Wnl LJLZ = LJJLIIIIJ().LJLZ();
                        if (LJLZ != null) {
                            enumC83358Wna3 = LJLZ.LIZ();
                        }
                        if (enumC83358Wna3 != EnumC83358Wna.USER_TEXT) {
                            return;
                        }
                        LJJLIIIIJ().LJLLLLLL(message);
                        return;
                    case 2:
                    case 3:
                    case 4:
                        AbstractC83369Wnl LJLZ2 = LJJLIIIIJ().LJLZ();
                        if (LJLZ2 != null) {
                            enumC83358Wna2 = LJLZ2.LIZ();
                        } else {
                            enumC83358Wna2 = null;
                        }
                        if (enumC83358Wna2 == EnumC83358Wna.SYSTEM) {
                            AbstractC83369Wnl LJLZ3 = LJJLIIIIJ().LJLZ();
                            if ((LJLZ3 instanceof C83355WnX) && (c83355WnX3 = (C83355WnX) LJLZ3) != null && (enumC83354WnW2 = c83355WnX3.LIZJ) != null && ((i = iArr[enumC83354WnW2.ordinal()]) == 1 || i == 2 || i == 3)) {
                                C83343WnL LJJLIIIIJ = LJJLIIIIJ();
                                ORS.LJJLL(LJJLIIIIJ.LJLJJI);
                                LJJLIIIIJ.LJLLLLLL(message);
                                LJJLIIIIJ.LJZ();
                                this.LJLJJLL = null;
                                return;
                            }
                        }
                        LJJLIIIIJ().LJLLLLLL(message);
                        return;
                    case 5:
                    case 6:
                        AbstractC83369Wnl LJLZ4 = LJJLIIIIJ().LJLZ();
                        if (LJLZ4 != null) {
                            enumC83358Wna3 = LJLZ4.LIZ();
                        }
                        if (enumC83358Wna3 != EnumC83358Wna.SYSTEM) {
                            return;
                        }
                        ORS.LJJLL(LJJLIIIIJ().LJLJJI);
                        LJJLIIIIJ().LJLLLLLL(message);
                        return;
                    case 7:
                        C83343WnL LJJLIIIIJ2 = LJJLIIIIJ();
                        C61878OQg dataSet = C61878OQg.INSTANCE;
                        LJJLIIIIJ2.getClass();
                        o.LJIIIZ(dataSet, "dataSet");
                        ((ArrayList) LJJLIIIIJ2.LJLJJI).clear();
                        ((ArrayList) LJJLIIIIJ2.LJLJJI).addAll(dataSet);
                        LJJLIIIIJ2.LJZ();
                        return;
                    case 8:
                        this.LJLJLJ.LJI(Boolean.FALSE);
                        AbstractC83369Wnl LJLZ5 = LJJLIIIIJ().LJLZ();
                        if (!(LJLZ5 instanceof C83355WnX) || ((C83355WnX) LJLZ5).LIZJ != EnumC83354WnW.WAITING) {
                            return;
                        }
                        ORS.LJJLL(LJJLIIIIJ().LJLJJI);
                        LJJLIIIIJ().LJLLLLLL(message);
                        LJJLIIIIJ().notifyDataSetChanged();
                        return;
                    case 9:
                        this.LJLJLJ.LJI(Boolean.FALSE);
                        return;
                    default:
                        return;
                }
            case 2:
            case 3:
                boolean z = message instanceof C83357WnZ;
                if (z) {
                    this.LJLLI.put(message.LIZ, message);
                } else {
                    LJJLIIJ(LLLLIL(), message);
                }
                AbstractC83369Wnl LJLZ6 = LJJLIIIIJ().LJLZ();
                if (LJLZ6 != null) {
                    enumC83358Wna = LJLZ6.LIZ();
                } else {
                    enumC83358Wna = null;
                }
                if (enumC83358Wna == EnumC83358Wna.SYSTEM) {
                    AbstractC83369Wnl LJLZ7 = LJJLIIIIJ().LJLZ();
                    if ((LJLZ7 instanceof C83355WnX) && (c83355WnX = (C83355WnX) LJLZ7) != null && (enumC83354WnW = c83355WnX.LIZJ) != null) {
                        int i2 = C83353WnV.LIZ[enumC83354WnW.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2 && i2 != 3) {
                                if (i2 == 5 && z && ((C83357WnZ) message).LIZLLL == EnumC82847WfL.RETRY) {
                                    C83343WnL LJJLIIIIJ3 = LJJLIIIIJ();
                                    ORS.LJJLL(LJJLIIIIJ3.LJLJJI);
                                    LJJLIIIIJ3.LJLLLLLL(message);
                                    LJJLIIIIJ3.LJZ();
                                    this.LJLJJLL = null;
                                    return;
                                }
                            } else {
                                AbstractC83369Wnl LJLZ8 = LJJLIIIIJ().LJLZ();
                                if ((LJLZ8 instanceof C83355WnX) && (c83355WnX2 = (C83355WnX) LJLZ8) != null) {
                                    c83355WnX2.LJFF = false;
                                }
                                this.LJLJJLL = null;
                            }
                        } else {
                            C83343WnL LJJLIIIIJ4 = LJJLIIIIJ();
                            ORS.LJJLL(LJJLIIIIJ4.LJLJJI);
                            LJJLIIIIJ4.LJLLLLLL(message);
                            LJJLIIIIJ4.LJZ();
                            this.LJLJJLL = null;
                            C83348WnQ.LIZJ(LLLLIL(), message, 0, true);
                            return;
                        }
                    }
                }
                AbstractC83369Wnl abstractC83369Wnl = this.LJLJJLL;
                if (abstractC83369Wnl != null) {
                    C83343WnL LJJLIIIIJ5 = LJJLIIIIJ();
                    LJJLIIIIJ5.getClass();
                    int indexOf = ((ArrayList) LJJLIIIIJ5.LJLJJI).indexOf(abstractC83369Wnl);
                    if (indexOf != -1) {
                        ((ArrayList) LJJLIIIIJ5.LJLJJI).remove(abstractC83369Wnl);
                        LJJLIIIIJ5.notifyItemRemoved(indexOf);
                    }
                    this.LJLJJLL = null;
                }
                AbstractC83369Wnl LJLZ9 = LJJLIIIIJ().LJLZ();
                if ((LJLZ9 instanceof C83357WnZ) && o.LJ(LJLZ9.LIZ, message.LIZ)) {
                    return;
                }
                LJJLIIIIJ().LJLLLLLL(message);
                return;
            case 4:
            case 5:
                if (!(message instanceof C83356WnY) || !((C83356WnY) message).LJ) {
                    return;
                }
                C83343WnL LJJLIIIIJ6 = LJJLIIIIJ();
                LJJLIIIIJ6.LJLJJL = false;
                AbstractC83369Wnl LJLZ10 = LJJLIIIIJ6.LJLZ();
                if (LJLZ10 != null && (LJLZ10 instanceof C83351WnT)) {
                    ((C83351WnT) LJLZ10).LJII = -1;
                }
                LJJLIIIIJ6.LJLJJLL = -1;
                LJJLIIIIJ6.LJZ();
                this.LJLJLJ.LJI(Boolean.FALSE);
                return;
            case 6:
                if (!(message instanceof C83361Wnd)) {
                    return;
                }
                C83361Wnd c83361Wnd = (C83361Wnd) message;
                int i3 = C83353WnV.LIZIZ[c83361Wnd.LIZJ.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        AbstractC83369Wnl LJLZ11 = LJJLIIIIJ().LJLZ();
                        this.LJLJLJ.LJI(Boolean.TRUE);
                        if (!(LJLZ11 instanceof C83355WnX) || ((C83355WnX) LJLZ11).LIZJ != EnumC83354WnW.WAITING) {
                            return;
                        }
                        RecyclerView.ViewHolder LJJIZ = LJJLIIIJJI().LLJILJIL().LJJIZ(LJJLIIIIJ().getItemCount() - 1);
                        if (!(LJJIZ instanceof C83342WnK)) {
                            return;
                        }
                        C83342WnK c83342WnK = (C83342WnK) LJJIZ;
                        c83342WnK.LJLJJI.setVisibility(8);
                        c83342WnK.LJLJJL = EnumC83339WnH.CANCEL;
                        if (c83342WnK.LJLJL.getVisibility() == 0) {
                            return;
                        }
                        C8HE c8he = c83342WnK.LJLJL;
                        CharSequence text = c83342WnK.LJLILLLLZI.getContext().getText(R.string.e13);
                        o.LJIIIIZZ(text, "innerView.context.getTex…eparingVideoMessage_body)");
                        c8he.setOriginalText(text);
                        c83342WnK.LJLJL.postDelayed(new ARunnableS50S0100000_14(c83342WnK, 227), 2000L);
                        c83342WnK.LJLJL.setVisibility(0);
                        return;
                    }
                    C83343WnL LJJLIIIIJ7 = LJJLIIIIJ();
                    LJJLIIIIJ7.LJLJJL = false;
                    AbstractC83369Wnl LJLZ12 = LJJLIIIIJ7.LJLZ();
                    if (LJLZ12 != null && (LJLZ12 instanceof C83351WnT)) {
                        ((C83351WnT) LJLZ12).LJII = -1;
                    }
                    LJJLIIIIJ7.LJLJJLL = -1;
                    LJJLIIIIJ7.LJZ();
                    this.LJLJLJ.LJI(Boolean.FALSE);
                    LJJLI();
                    return;
                }
                C83343WnL LJJLIIIIJ8 = LJJLIIIIJ();
                int i4 = c83361Wnd.LIZLLL;
                LJJLIIIIJ8.LJLJJL = false;
                AbstractC83369Wnl LJLZ13 = LJJLIIIIJ8.LJLZ();
                if (LJLZ13 != null && (LJLZ13 instanceof C83351WnT)) {
                    ((C83351WnT) LJLZ13).LJII = i4;
                }
                LJJLIIIIJ8.LJLJJLL = -1;
                LJJLIIIIJ8.LJZ();
                this.LJLJLJ.LJI(Boolean.FALSE);
                return;
            default:
                return;
        }
    }

    private final void LJJLIIJ(VideoPublishEditModel model, AbstractC83369Wnl abstractC83369Wnl) {
        String str;
        int i;
        String str2;
        int i2;
        Class<?> cls = abstractC83369Wnl.getClass();
        int i3 = 0;
        EnumC82847WfL enumC82847WfL = null;
        if (o.LJ(cls, C83351WnT.class)) {
            if (!(abstractC83369Wnl instanceof C83351WnT)) {
                return;
            }
            C83351WnT c83351WnT = (C83351WnT) abstractC83369Wnl;
            int i4 = C83353WnV.LIZLLL[c83351WnT.LJIIJJI.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return;
                    }
                    String str3 = abstractC83369Wnl.LIZIZ;
                    o.LJIIIZ(model, "model");
                    C188727au c188727au = new C188727au();
                    C83348WnQ.LIZLLL(model, c188727au);
                    c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
                    c188727au.LJIIIZ("enter_method", "click_icon");
                    c188727au.LJI("process_id", str3);
                    FMX.LJIIL("tikbot_disclaimer_show", c188727au.LIZ);
                    return;
                }
                String str4 = abstractC83369Wnl.LIZIZ;
                String str5 = abstractC83369Wnl.LIZ;
                String str6 = c83351WnT.LJFF;
                String str7 = c83351WnT.LIZJ;
                if (c83351WnT.LIZLLL.isEmpty()) {
                    str2 = "text";
                } else {
                    str2 = "creation";
                }
                String LIZIZ = c83351WnT.LIZIZ();
                C83357WnZ c83357WnZ = this.LJLLI.get(c83351WnT.LJFF);
                if (c83357WnZ != null) {
                    enumC82847WfL = c83357WnZ.LIZLLL;
                }
                if (enumC82847WfL == EnumC82847WfL.RETRY) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                C83348WnQ.LJFF(model, str4, str5, str6, str7, str2, LIZIZ, "normal", "normal", i2);
                return;
            }
            String str8 = abstractC83369Wnl.LIZIZ;
            String str9 = abstractC83369Wnl.LIZ;
            String str10 = c83351WnT.LIZJ;
            String creationId = model.getCreationId();
            o.LJIIIIZZ(creationId, "model.creationId");
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "video_edit_page_tikbot");
            c188727au2.LJIIIZ("enter_method", "click_icon");
            c188727au2.LJIIIZ("process_id", str8);
            c188727au2.LJIIIZ("message_id", str9);
            c188727au2.LJIIIZ("message_content", str10);
            c188727au2.LJI("creation_id", creationId);
            FMX.LJIIL("receive_default_message", c188727au2.LIZ);
            return;
        }
        if (!o.LJ(cls, C83355WnX.class) || !(abstractC83369Wnl instanceof C83355WnX)) {
            return;
        }
        C83355WnX c83355WnX = (C83355WnX) abstractC83369Wnl;
        switch (C83353WnV.LIZ[c83355WnX.LIZJ.ordinal()]) {
            case 1:
            case 7:
            case 8:
            case 9:
            case 10:
                return;
            case 2:
                List<String> list = c83355WnX.LJ;
                if (list != null) {
                    for (String str11 : list) {
                        int i5 = i3 + 1;
                        if (i3 >= 0) {
                            String str12 = str11;
                            String str13 = abstractC83369Wnl.LIZIZ;
                            if (str13 == null) {
                                str13 = "null";
                            }
                            C83348WnQ.LJ(1, model, str13, c83355WnX.LJI, String.valueOf(i3), str12);
                            i3 = i5;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            case 3:
                List<String> list2 = c83355WnX.LJ;
                if (list2 != null) {
                    for (String str14 : list2) {
                        int i6 = i3 + 1;
                        if (i3 >= 0) {
                            C83348WnQ.LJ(0, model, "null", "null", String.valueOf(i3), str14);
                            i3 = i6;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            case 4:
                str = "no_network";
                break;
            case 5:
                str = "other_abnormal";
                break;
            case 6:
                str = "review_failed";
                break;
            default:
                throw new C162476Zf();
        }
        String str15 = abstractC83369Wnl.LIZIZ;
        String str16 = abstractC83369Wnl.LIZ;
        String str17 = c83355WnX.LJI;
        String str18 = c83355WnX.LIZLLL;
        C83357WnZ c83357WnZ2 = this.LJLLI.get(str17);
        if (c83357WnZ2 != null) {
            enumC82847WfL = c83357WnZ2.LIZLLL;
        }
        if (enumC82847WfL == EnumC82847WfL.RETRY) {
            i = 1;
        } else {
            i = 0;
        }
        C83348WnQ.LJFF(model, str15, str16, str17, str18, "abnormal", "null", "null", str, i);
    }

    public C83345WnN(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 54));
        this.LJLJL = new C29901Fi<>();
        this.LJLJLJ = new C40871j1<>(Boolean.FALSE);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC137005Zg.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLI = new HashMap<>();
        this.LJLLJ = new C83372Wno();
        this.LJLLL = C221108m2.LIZIZ(C83371Wnn.LJLIL);
    }
}

package X;

import Y.IDDListenerS146S0100000_7;
import Y.IDDListenerS22S0300000_7;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.streamedit.DefaultStreamEditSubPanelHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS29S0210000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.G9b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41047G9b extends AbstractC29891Fh<C6E7> implements C6E7, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final C6E7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final Boolean LJLJJI;
    public final boolean LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public final C5H3 LJLJLJ;
    public final MutableLiveData<Boolean> LJLJLLL;

    static {
        TBT tbt = new TBT(C41047G9b.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt};
    }

    private final DefaultStreamEditSubPanelHelper LJJLIIIJJIZ() {
        return (DefaultStreamEditSubPanelHelper) this.LJLJLJ.getValue();
    }

    public final VideoPublishEditModel LJJLI() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLL[0]);
    }

    public final void LJJLJ() {
        this.LJLJLLL.setValue(Boolean.TRUE);
        C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
        G9M.LJFF(LJJLI(), "video_edit_page", LJJLI().isPrivate(), new AqS173S0100000_7(this, 146));
        LJJLIIIJJIZ().LIZJ();
    }

    private final void LJJLL() {
        if (LJJLI().isPrivate == -1) {
            return;
        }
        if (LJJLI().creativeModel.commerceModel.getTcmModel().getTcmPreventSelfSee() == 2) {
            this.LJLJJLL = true;
            if (LJJLI().isPrivate == 1) {
                LJJLI().isPrivate = 0;
                Activity LJIJJ = C78688UuS.LJIJJ(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                String string = C78688UuS.LJIJJ(this).getString(R.string.tm5);
                o.LJIIIIZZ(string, "activity.getString(R.string.video_cannot_private)");
                creativeToastBuilder.message(string);
                creativeToastBuilder.acrossActivities(true);
                C78915Uy7.LJJIIZI(LJIJJ, 2031, creativeToastBuilder);
                return;
            }
            return;
        }
        this.LJLJJLL = false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.DialogFragment] */
    @Override // X.C6E7
    public void WQ() {
        ActivityC45651qj activityC45651qj;
        boolean z;
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        if ((LJIJJ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIJJ) != null && (!activityC45651qj.isFinishing())) {
            if (LJJLI().creativeModel.commerceModel.getTcmModel().getTcmPreventSelfSee() == 2) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJJLL = z;
            G9G LJJIIZI = C60903NvH.LJIIJJI().getPublishService().LJJIIZI();
            C68322mC c68322mC = new C68322mC();
            this.LJLJL = LJJLI().isPrivate;
            PublishDefaultPermissionFragment LIZLLL = LJJIIZI.LIZLLL(LJJLIIIJILLIZJL(this, false, false, 2, null), new AqS138S0200000_7(this, (C41047G9b) c68322mC, (C68322mC<TuxSheet>) 24), null);
            ASL asl = new ASL();
            asl.LIZIZ(LIZLLL);
            Integer LJI = C79045V0n.LJI(R.attr.c9, C78688UuS.LJJIII(this));
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLJL = LJI;
            tuxSheet.LJLILLLLZI = new IDDListenerS22S0300000_7(LJJIIZI, LIZLLL, this, 0);
            asl.LJI(1);
            ?? r2 = asl.LIZ;
            c68322mC.element = r2;
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            r2.show(supportFragmentManager, "PrivacySettingSheet");
            LJJLJ();
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        boolean z;
        super.onCreate();
        if (LJJLI().creativeModel.commerceModel.getTcmModel().getTcmPreventSelfSee() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJLL = z;
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        LJJLL();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C6E7 getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.C6E7
    public LiveData<Boolean> vw() {
        return this.LJLJLLL;
    }

    public C41047G9b(C82622Wbi diContainer) {
        boolean z;
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        C60903NvH.LJIIJJI().getRegionService();
        this.LJLJJI = C44296Ha0.LIZIZ();
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            z = LJ.LJIIJJI();
        } else {
            z = false;
        }
        this.LJLJJL = z;
        this.LJLJL = -1;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 277));
        this.LJLJLLL = new MutableLiveData<>(Boolean.FALSE);
    }

    private final void LJJLIIIJLLLLLLLZ(int i) {
        if (i != 0) {
            LJJLI().playlist_id = null;
            LJJLI().playlist_name = null;
        }
        ArrayList<InteractionTagUserInfo> arrayList = LJJLI().tagUserList;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (i != 1) {
            if (i == 2) {
                Iterator<InteractionTagUserInfo> it = LJJLI().tagUserList.iterator();
                o.LJIIIIZZ(it, "model.tagUserList.iterator()");
                while (it.hasNext()) {
                    InteractionTagUserInfo next = it.next();
                    String uniqueId = next.getUniqueId();
                    String nickname = next.getNickname();
                    if (next.getFollowStatus() != 2) {
                        Boolean isTiktokRegion = this.LJLJJI;
                        o.LJIIIIZZ(isTiktokRegion, "isTiktokRegion");
                        if (isTiktokRegion.booleanValue()) {
                            uniqueId = nickname;
                        }
                        arrayList2.add(uniqueId);
                        it.remove();
                    }
                }
            }
        } else {
            Iterator<InteractionTagUserInfo> it2 = LJJLI().tagUserList.iterator();
            while (it2.hasNext()) {
                InteractionTagUserInfo next2 = it2.next();
                String uniqueId2 = next2.getUniqueId();
                String nickname2 = next2.getNickname();
                Boolean isTiktokRegion2 = this.LJLJJI;
                o.LJIIIIZZ(isTiktokRegion2, "isTiktokRegion");
                if (isTiktokRegion2.booleanValue()) {
                    uniqueId2 = nickname2;
                }
                arrayList2.add(uniqueId2);
            }
            LJJLI().tagUserList.clear();
        }
        if (C79004UzY.LJJIFFI(arrayList2) || arrayList2.toString().length() < 2) {
            return;
        }
        String abstractCollection = arrayList2.toString();
        String string = C78688UuS.LJIJJ(this).getString(R.string.s2b);
        o.LJIIIIZZ(string, "activity.getString(strin…imiting_video_visibility)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{C58314Muc.LIZIZ(abstractCollection, 1, 1, "this as java.lang.String…ing(startIndex, endIndex)")}, 1, string, "format(format, *args)");
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(LIZIZ);
        C78915Uy7.LJJIIZI(LJIJJ, 2031, creativeToastBuilder);
    }

    public final int LJJLIIIJJI(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return R.string.p5s;
                }
                return R.string.p5u;
            }
            return R.string.p5v;
        }
        if (!this.LJLJJL) {
            return R.string.p5s;
        }
        return R.string.p5t;
    }

    public final void LJJLIIJ(DialogInterface dialogInterface) {
        AST LJIIIIZZ = ASQ.LJIIIIZZ(dialogInterface);
        LJJLIIIJJIZ().LIZIZ();
        this.LJLJLLL.setValue(Boolean.FALSE);
        C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
        int isPrivate = LJJLI().isPrivate();
        String str = LJJLI().creativeModel.transientPostPageModel.LJJIIJZLJL;
        if (str == null) {
            str = "";
        }
        G9M.LIZLLL(isPrivate, "video_edit_page", str, LJIIIIZZ);
    }

    public final void LJJLJLI(int i) {
        G9G LJJIIZI = C60903NvH.LJIIJJI().getPublishService().LJJIIZI();
        LJJLI().isPrivate = i;
        LJJLI().creativeModel.privacySettingModel.isSubscribeOnly = false;
        LJJLIIIJLLLLLLLZ(i);
        LJJIIZI.getClass();
        G9E.LIZ(C78688UuS.LJIJJ(this), i);
        C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
        G9M.LJ(LJJLI(), "video_edit_page", i, this.LJLJL, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PermissionConfigure LJJLIIIIJ(boolean z, boolean z2) {
        String str;
        int i = 0;
        int i2 = LJJLI().isPrivate;
        boolean z3 = this.LJLJJLL;
        VideoPublishEditModel LJJLI = LJJLI();
        if (z2) {
            str = C60903NvH.LJ.getResources().getString(R.string.rri);
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (isStory) CameraClien…quickpost_button) else \"\"");
        return new PermissionConfigure(i, i2, z3, LJJLI, new PostBtnConfigure(z, str), null, 33, 0 == true ? 1 : 0);
    }

    @Override // X.C6E7
    public AbstractC42152GgW<?> GE(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z) {
        boolean z2;
        if (!(C78688UuS.LJIJJ(this) instanceof ActivityC45651qj)) {
            return null;
        }
        if (LJJLI().creativeModel.commerceModel.getTcmModel().getTcmPreventSelfSee() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJLL = z2;
        return C60903NvH.LJIIJJI().getPublishService().LJJIIZI().LIZIZ((ActivityC45651qj) C78688UuS.LJIJJ(this), LJJLI(), LJJLIIIIJ(true, z), new IDDListenerS146S0100000_7(this, 6), new AqS154S0200000_7((InterfaceC65784Pro) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) this, (C41047G9b) 39), new AqS173S0100000_7(this, 145), z);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.DialogFragment] */
    @Override // X.C6E7
    public void wg(boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ActivityC45651qj activityC45651qj;
        boolean z2;
        PublishDefaultPermissionFragment LIZJ;
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        if ((LJIJJ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIJJ) != null && (!activityC45651qj.isFinishing())) {
            if (LJJLI().creativeModel.commerceModel.getTcmModel().getTcmPreventSelfSee() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLJJLL = z2;
            G9G LJJIIZI = C60903NvH.LJIIJJI().getPublishService().LJJIIZI();
            C68322mC c68322mC = new C68322mC();
            this.LJLJL = LJJLI().isPrivate;
            AqS29S0210000_7 aqS29S0210000_7 = new AqS29S0210000_7(this, (C41047G9b) z, (boolean) c68322mC, (C68322mC<TuxSheet>) 1);
            if (z) {
                LIZJ = LJJIIZI.LIZLLL(LJJLIIIIJ(true, true), aqS29S0210000_7, interfaceC65784Pro);
            } else {
                LIZJ = LJJIIZI.LIZJ(LJJLIIIJILLIZJL(this, false, false, 2, null), aqS29S0210000_7);
            }
            ASL asl = new ASL();
            asl.LIZIZ(LIZJ);
            Integer LJI = C79045V0n.LJI(R.attr.c9, C78688UuS.LJJIII(this));
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLJL = LJI;
            tuxSheet.LJLILLLLZI = new IDDListenerS22S0300000_7(LJJIIZI, LIZJ, this, 1);
            asl.LJI(1);
            ?? r2 = asl.LIZ;
            c68322mC.element = r2;
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            r2.show(supportFragmentManager, "PrivacySettingSheet");
            LJJLJ();
        }
    }

    public static /* synthetic */ PermissionConfigure LJJLIIIJILLIZJL(C41047G9b c41047G9b, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c41047G9b.LJJLIIIIJ(z, z2);
    }
}

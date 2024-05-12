package X;

import Y.AfS59S0100000_7;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GVj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41627GVj implements InterfaceC41631GVn {
    public static final java.util.Map<String, String> LJLJLLL = new HashMap();
    public final InterfaceC41630GVm LJLIL;
    public final String LJLILLLLZI;
    public final PublishModel LJLJI;
    public final boolean LJLJJI;
    public final C41625GVh LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    @Override // X.InterfaceC41605GUn
    public final void J6(String str) {
    }

    public final List<PublishModel> LIZIZ() {
        List<PublishModel> allProgressValidPublishModel = ((IAVPublishService) this.LJLJJLL.getValue()).getAllProgressValidPublishModel();
        o.LJIIIIZZ(allProgressValidPublishModel, "publishService.allProgressValidPublishModel");
        return allProgressValidPublishModel;
    }

    @Override // X.InterfaceC41605GUn
    public final void w8() {
        this.LJLJLJ = Math.max(this.LJLJLJ, this.LJLJL);
        this.LJLJL = 0;
    }

    public void LIZ(boolean z) {
        GUH.LJJ(this);
        Object obj = null;
        if (((IAVPublishService) this.LJLJJLL.getValue()).isParallelPublishTaskFinished()) {
            Object obj2 = this.LJLIL;
            if (obj2 instanceof ParallelPublishDialogFragment) {
                Fragment fragment = (Fragment) obj2;
                if (fragment.getFragmentManager() != null) {
                    FragmentManager fragmentManager = fragment.getFragmentManager();
                    o.LJI(fragmentManager);
                    C1B3 c1b3 = new C1B3(fragmentManager);
                    c1b3.LJJI(fragment);
                    c1b3.LJI();
                    return;
                }
                return;
            }
            C41620GVc.LIZLLL(null);
            return;
        }
        this.LJLJJL.LIZ.setValue(5);
        List LLJILJILJ = ORZ.LLJILJILJ(LIZIZ());
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        arrayList.remove(this.LJLJI);
        if (arrayList.size() <= 0) {
            return;
        }
        PublishModel publishModel = (PublishModel) ListProtector.get(LLJILJILJ, 0);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!LIZJ((PublishModel) next, publishModel)) {
                obj = next;
                break;
            }
        }
        PublishModel publishModel2 = (PublishModel) obj;
        if (publishModel2 == null) {
            LJ(publishModel);
            LIZLLL(publishModel, new AqS173S0100000_7(this, 330));
        } else {
            LJ(publishModel);
            LIZLLL(publishModel, new AqS138S0200000_7(this, publishModel2, 83));
        }
    }

    public final void LJ(PublishModel publishModel) {
        C41625GVh c41625GVh = this.LJLJJL;
        java.util.Map<String, String> map = LJLJLLL;
        c41625GVh.LJII.setValue(((HashMap) map).get(publishModel.creationId));
        C41625GVh c41625GVh2 = this.LJLJJL;
        BaseShortVideoContext model = publishModel.editModel;
        c41625GVh2.getClass();
        o.LJIIIZ(model, "model");
        c41625GVh2.LJIIIIZZ.setValue(model);
        ((HashMap) map).remove(publishModel.creationId);
    }

    public static boolean LIZJ(PublishModel publishModel, PublishModel publishModel2) {
        String str;
        String str2;
        if (publishModel2 == null) {
            return false;
        }
        StoryGroupPublishModel storyGroupPublishModel = publishModel.storyGroupPublishModel;
        if (storyGroupPublishModel == null || (str = storyGroupPublishModel.groupId) == null) {
            str = publishModel.creationId;
        }
        StoryGroupPublishModel storyGroupPublishModel2 = publishModel2.storyGroupPublishModel;
        if (storyGroupPublishModel2 == null || (str2 = storyGroupPublishModel2.groupId) == null) {
            str2 = publishModel2.creationId;
        }
        return o.LJ(str, str2);
    }

    public final void LIZLLL(PublishModel publishModel, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(publishModel, "publishModel");
        AbstractC73638SvC.LJI(new C41628GVk(this, publishModel)).LJIJJ(C73969T1h.LIZIZ()).LJJIIJ(T16.LIZ()).LJJIFFI(new AfS59S0100000_7(interfaceC88472Yns, 50));
    }

    @Override // X.InterfaceC41605GUn
    public void U9(int i, boolean z) {
        int i2 = this.LJLJLJ;
        if (i < i2) {
            this.LJLJJL.LIZ.setValue(Integer.valueOf(i2));
            C41620GVc.LJIIIIZZ.put(this.LJLILLLLZI, Integer.valueOf(this.LJLJLJ));
        } else {
            this.LJLJJL.LIZ.setValue(Integer.valueOf(i));
            this.LJLJL = i;
            C41620GVc.LJIIIIZZ.put(this.LJLILLLLZI, Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC41605GUn
    public final void Z3(C41759GaB c41759GaB, PublishModel publishModel) {
        LIZ(false);
    }

    public C41627GVj(InterfaceC41630GVm fragment, String publishId, PublishModel publishModel) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(publishModel, "publishModel");
        this.LJLIL = fragment;
        this.LJLILLLLZI = publishId;
        this.LJLJI = publishModel;
        C41625GVh state = fragment.getState();
        this.LJLJJL = state;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(GVT.LJLIL);
        this.LJLJJLL = LIZIZ;
        if (fragment.Ib(publishId)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishParallel ParallelPublishForUICallback ");
            LIZ.append(publishId);
            LIZ.append(" created");
            H7B.LJ(X1D.LIZIZ(LIZ));
            ((HashMap) LJLJLLL).put(publishModel.creationId, publishId);
            Object obj = null;
            if (o.LJ(((IAVPublishService) LIZIZ.getValue()).getCurrentPublishTaskId(), publishId) || LIZIZ().size() == 1) {
                state.LJFF.setValue(null);
                state.LJI.setValue(null);
                LJ(publishModel);
                LIZLLL(publishModel, new AqS173S0100000_7(this, 328));
                Iterator it = ((ArrayList) ORZ.LLJILJILJ(LIZIZ())).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    PublishModel publishModel2 = (PublishModel) next;
                    if (!o.LJ(publishModel2, this.LJLJI) && !LIZJ(publishModel2, this.LJLJI)) {
                        obj = next;
                        break;
                    }
                }
                PublishModel publishModel3 = (PublishModel) obj;
                if (publishModel3 != null) {
                    LIZLLL(publishModel3, new AqS173S0100000_7(this, 329));
                }
            } else {
                this.LJLJLJ = 5;
                List<PublishModel> LIZIZ2 = LIZIZ();
                if (LIZIZ2.size() >= 2 && state.LJFF.getValue() == null) {
                    Iterator<PublishModel> it2 = LIZIZ2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (!LIZJ((PublishModel) next2, (PublishModel) ORZ.LJLLLL(LIZIZ2))) {
                            obj = next2;
                            break;
                        }
                    }
                    PublishModel publishModel4 = (PublishModel) obj;
                    if (publishModel4 != null) {
                        LIZLLL(publishModel4, new AqS173S0100000_7(this, 327));
                    }
                }
            }
            this.LJLJJI = true;
        }
    }

    @Override // X.InterfaceC41605GUn
    public final void K6(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishParallel ParallelPublishForUICallback ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" onSuccess");
        H7B.LJ(X1D.LIZIZ(LIZ));
        LIZ(true);
    }
}

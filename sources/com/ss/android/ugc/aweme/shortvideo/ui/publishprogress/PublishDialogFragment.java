package com.ss.android.ugc.aweme.shortvideo.ui.publishprogress;

import X.AbstractC73638SvC;
import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C1B3;
import X.C1B6;
import X.C29S;
import X.C3C5;
import X.C41759GaB;
import X.C42040Gei;
import X.C42043Gel;
import X.C45804HyK;
import X.C57396Mfo;
import X.C60903NvH;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74040T4a;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.G8N;
import X.GVX;
import X.InterfaceC41605GUn;
import X.InterfaceC42037Gef;
import X.InterfaceC66992k3;
import X.LRD;
import X.T16;
import X.X1D;
import Y.AfS17S0001000_5;
import Y.AfS36S0101000_5;
import Y.IDAListenerS233S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishDialogFragment;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class PublishDialogFragment extends Fragment implements InterfaceC41605GUn<CreateBaseAwemeResponse>, View.OnClickListener, IAVPublishService.PublishProgressFragment {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public ImageView LJLIL;
    public Bitmap LJLILLLLZI;
    public String LJLJI;
    public TextView LJLJJI;
    public boolean LJLJJL;
    public C74040T4a LJLJJLL;
    public TextView LJLJL;
    public InterfaceC42037Gef LJLJLJ;
    public boolean LJLJLLL;
    public final C73318Sq2 LJLL = new C73318Sq2();
    public Activity LJLLI;

    @Override // X.InterfaceC41605GUn
    public final void J6(String str) {
    }

    @Override // X.InterfaceC41605GUn
    public final void w8() {
    }

    public final void dismissAllowingStateLoss() {
        if (getFragmentManager() != null) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(this);
            c1b3.LJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void dismissAllowingStateLossNow() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            try {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJJI(this);
                c1b3.LJII();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void hide() {
        FragmentManager requireFragmentManager = requireFragmentManager();
        requireFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(requireFragmentManager);
        c1b3.LJIIIZ(this);
        c1b3.LJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (mo49getActivity() != null) {
            LRD.LIZ(mo49getActivity()).LJIIIZ(false);
        }
        dismissAllowingStateLoss();
        super.onDestroy();
        this.LJLL.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (mo49getActivity() != null) {
            LRD.LIZ(mo49getActivity()).LJIIIZ(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        if (!(LJIJJ instanceof MainActivity)) {
            LJIJJ = null;
        }
        this.LJLLI = LJIJJ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (this.LJLLI != null && this.LJLJLJ != null) {
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            Activity activity = this.LJLLI;
            if (activity instanceof MainActivity) {
                str = ((MainActivity) activity).getEnterFrom();
            } else {
                str = null;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("creation_id", this.LJLJLJ.LIZIZ());
            c188727au.LIZLLL(this.LJLJLJ.LIZLLL(), "video_type");
            c188727au.LJIIIZ("enter_from", str);
            FMX.LJIIL("click_publishing_toast", c188727au.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bitmap bitmap = this.LJLILLLLZI;
        if (bitmap != null && !bitmap.isRecycled()) {
            bundle.putParcelable("cover_data", this.LJLILLLLZI);
        }
        String str = this.LJLJI;
        if (str != null) {
            bundle.putString("publish_id", str);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void setIsChangeAvatar(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void setPublishBinder(InterfaceC42037Gef interfaceC42037Gef) {
        this.LJLJLJ = interfaceC42037Gef;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void setPublishId(String str) {
        if (str != null) {
            this.LJLJI = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void show(boolean z) {
        FragmentManager requireFragmentManager = requireFragmentManager();
        C1B3 LIZ = C1B6.LIZ(requireFragmentManager, requireFragmentManager);
        if (z) {
            LIZ.LJIIJJI(R.anim.fx, R.anim.fy, 0, 0);
        }
        LIZ.LJIIL(this);
        LIZ.LJI();
    }

    @Override // X.InterfaceC41605GUn
    public final void U9(int i, boolean z) {
        C74040T4a c74040T4a = this.LJLJJLL;
        if (c74040T4a != null && this.LJLJL != null) {
            c74040T4a.setProgress(i);
            TextView textView = this.LJLJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("%");
            textView.setText(X1D.LIZIZ(LIZ));
        }
        if (z && !this.LJLJJL) {
            this.LJLJJL = true;
        }
    }

    @Override // X.InterfaceC41605GUn
    public final void Z3(C41759GaB c41759GaB, PublishModel publishModel) {
        this.LJLJJL = false;
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, final Bundle bundle) {
        this.LJLIL = (ImageView) view.findViewById(R.id.aj5);
        C74040T4a c74040T4a = (C74040T4a) view.findViewById(R.id.f6h);
        this.LJLJJLL = c74040T4a;
        c74040T4a.setIndeterminate(false);
        this.LJLJL = (TextView) view.findViewById(R.id.ia9);
        TextView textView = (TextView) view.findViewById(R.id.aa_);
        this.LJLJJI = textView;
        if (GVX.LIZIZ) {
            if (textView.getLineCount() <= 3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.j71);
                AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
                LIZ.LJIIIIZZ(this.LJLJJI.getId(), 4, this.LJLIL.getId(), 4);
                LIZ.LIZIZ(constraintLayout);
            }
            this.LJLJJI.setVisibility(0);
        }
        ImageView imageView = this.LJLIL;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new C42043Gel(this));
        View findViewById = view.findViewById(R.id.aj7);
        findViewById.setClipToOutline(true);
        findViewById.setOutlineProvider(new C42043Gel(this));
        if (bundle != null) {
            this.LJLJI = bundle.getString("publish_id");
        }
        this.LJLL.LIZ(AbstractC73638SvC.LJI(new InterfaceC66992k3() { // from class: X.Geg
            @Override // X.InterfaceC66992k3
            public final void subscribe(InterfaceC65052gv interfaceC65052gv) {
                InterfaceC42037Gef interfaceC42037Gef;
                PublishDialogFragment publishDialogFragment = PublishDialogFragment.this;
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    publishDialogFragment.getClass();
                    publishDialogFragment.LJLILLLLZI = (Bitmap) bundle2.getParcelable("cover_data");
                }
                if (publishDialogFragment.LJLILLLLZI == null && (interfaceC42037Gef = publishDialogFragment.LJLJLJ) != null) {
                    publishDialogFragment.LJLILLLLZI = interfaceC42037Gef.LJ();
                }
                Bitmap bitmap = publishDialogFragment.LJLILLLLZI;
                if (bitmap != null) {
                    ((C73578SuE) interfaceC65052gv).onSuccess(bitmap);
                } else {
                    ((C73578SuE) interfaceC65052gv).onError(new NullPointerException("coverBitmap is null"));
                }
            }
        }).LJIJJ(C73969T1h.LIZIZ()).LJJIIJ(T16.LIZ()).LJJII(new AfS36S0101000_5(3, this, 49), new AfS17S0001000_5(4, 2)));
        C16880lQ.LJIILLIIL(this.LJLIL, new Au2S16S0100000_7(this, 7));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void show(FragmentManager fragmentManager, String str) {
        boolean z = this.LJLJLLL;
        int i = R.anim.fx;
        if (z) {
            C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
            LIZ.LJIIIIZZ(R.id.kmk, 1, this, str);
            LIZ.LJIIJJI(R.anim.fx, R.anim.fy, 0, 0);
            LIZ.LJI();
            FragmentManager requireFragmentManager = requireFragmentManager();
            requireFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(requireFragmentManager);
            c1b3.LJIIIZ(this);
            c1b3.LJI();
            return;
        }
        C1B3 LIZ2 = C1B6.LIZ(fragmentManager, fragmentManager);
        if (GVX.LIZIZ) {
            i = R.anim.eu;
        }
        LIZ2.LJIIJJI(i, R.anim.fy, 0, 0);
        LIZ2.LJIIIIZZ(R.id.kmk, 1, this, str);
        LIZ2.LJI();
    }

    @Override // X.InterfaceC41605GUn
    public final void K6(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
        this.LJLJJL = false;
        if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
            G8N shareService = C60903NvH.LJIIJJI().getShareService();
            Aweme aweme = ((CreateAwemeResponse) createBaseAwemeResponse).aweme;
            shareService.getClass();
            C42040Gei c42040Gei = new C42040Gei(this);
            if (!SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (SharePrefCache.inst().getAutoSendTwitter().LIZ().booleanValue()) {
                        arrayList.add(2);
                        jSONArray.put("twitter");
                    }
                    jSONObject.put("platform", jSONArray);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(",");
                }
                if (arrayList.size() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                MobClick obtain = MobClick.obtain();
                obtain.setJsonObject(jSONObject);
                obtain.setEventName("sync_video");
                obtain.setLabelName("edit_page");
                FMX.onEvent(obtain);
                if (!TextUtils.isEmpty(sb)) {
                    c42040Gei.LJLIL.LJIILL(sb.toString(), aweme.getShareInfo().getShareUrl(), aweme.getShareInfo().getShareTitle(), SharePrefCache.inst().getFacebookAccessToken().LIZ(), SharePrefCache.inst().getTwitterAccessToken().LIZ(), SharePrefCache.inst().getTwitterSecret().LIZ(), SharePrefCache.inst().getGoogleServerAuthCode().LIZ(), aweme.getAid(), aweme.getShareInfo().getShareTitle(), "");
                }
                SharePrefCache.inst().getIsAwemePrivate().LIZLLL(Boolean.FALSE);
            }
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (!GVX.LIZIZ || i2 != R.anim.eu) {
            return super.onCreateAnimation(i, z, i2);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(mo49getActivity(), i2);
        loadAnimation.setAnimationListener(new IDAListenerS233S0100000_7(this, 1));
        return loadAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ax5, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressFragment
    public final void showInSpecificId(FragmentManager fragmentManager, String str, int i, boolean z) {
        boolean z2 = this.LJLJLLL;
        int i2 = R.anim.fx;
        if (z2) {
            C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
            LIZ.LJIIIIZZ(i, 1, this, str);
            LIZ.LJIIJJI(R.anim.fx, R.anim.fy, 0, 0);
            LIZ.LJI();
            FragmentManager requireFragmentManager = requireFragmentManager();
            requireFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(requireFragmentManager);
            c1b3.LJIIIZ(this);
            c1b3.LJI();
            return;
        }
        C1B3 LIZ2 = C1B6.LIZ(fragmentManager, fragmentManager);
        if (GVX.LIZIZ) {
            i2 = R.anim.eu;
        }
        LIZ2.LJIIJJI(i2, R.anim.fy, 0, 0);
        LIZ2.LJIIIIZZ(i, 1, this, str);
        LIZ2.LJI();
    }
}

package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.BroadcastUserApi;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.util.HashMap;
import o3.h0;

/* renamed from: X.BGn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC28501BGn implements View.OnClickListener {
    public static int LJLLILLLL = 1;
    public static int LJLLJ = 1;
    public static int LJLLL = 750;
    public static int LJLLLL = 750;
    public final C47061t0 LJLIL;
    public final TextView LJLILLLLZI;
    public final BaseFragment LJLJI;
    public C31870Cf4 LJLJJI;
    public String LJLJJL;
    public final C73318Sq2 LJLJJLL;
    public final DataChannel LJLJL;
    public boolean LJLJLJ;
    public CoverImageModel LJLJLLL;
    public final User LJLL;
    public final java.util.Map<LiveMode, ImageModel> LJLLI;

    public final LiveMode LIZIZ() {
        LiveMode liveMode = (LiveMode) C51029K0z.LJIILIIL(this.LJLJI).kv0(LiveModeChannel.class);
        if (liveMode == null) {
            return LiveMode.VIDEO;
        }
        return liveMode;
    }

    public final String LIZJ() {
        CoverImageModel coverImageModel;
        if (!this.LJLJLJ && (coverImageModel = this.LJLJLLL) != null) {
            String str = coverImageModel.uri;
            if (str != null) {
                return str;
            }
            if (!C79004UzY.LJJIFFI(coverImageModel.urlList)) {
                return UriProtector.parse((String) ListProtector.get(this.LJLJLLL.urlList, 0)).toString();
            }
        }
        return "";
    }

    public final String LIZLLL() {
        LiveMode liveMode = (LiveMode) C51029K0z.LJIILIIL(this.LJLJI).kv0(LiveModeChannel.class);
        if (liveMode != null && !liveMode.equals(LiveMode.VIDEO)) {
            if (liveMode.equals(LiveMode.THIRD_PARTY)) {
                return "third_party";
            }
            if (liveMode.equals(LiveMode.SCREEN_RECORD)) {
                return "screen_share";
            }
        }
        return "video_live";
    }

    public static CoverImageModel LIZ(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        CoverImageModel coverImageModel = new CoverImageModel();
        coverImageModel.uri = imageModel.mUri;
        coverImageModel.urlList = imageModel.mUrls;
        return coverImageModel;
    }

    public final void LJ(Throwable th) {
        String str;
        if (th instanceof C29401Dk) {
            str = ((C29401Dk) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = C15380j0.LJIILJJIL(R.string.t01);
        }
        this.LJLJJL = null;
        if (!this.LJLJI.isViewValid()) {
            return;
        }
        this.LJLJJI.LIZ();
        C30868C9o.LJFF(C15380j0.LIZLLL(), str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (view.getId() == R.id.fvr) {
            if (this.LJLJJL == null) {
                this.LJLJJI.LJI();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", LIZLLL());
            User user = this.LJLL;
            if (user != null) {
                hashMap.put("anchor_id", String.valueOf(user.getId()));
            }
            C0K2.LJIIIIZZ("ttlive_upload_cover_start", 0, null);
            if (LIZLLL().equals("video_live")) {
                if (LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2()) {
                    str = "settings";
                } else if (LivePreviewComponentsSimplifyTypeSetting.INSTANCE.inExperiment()) {
                    str = "live_detail";
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_cover_modify_click");
                LIZ.LJIILLIIL(this.LJLJL);
                LIZ.LJIIL("click");
                LIZ.LJIIIZ("live");
                LIZ.LJJIFFI(hashMap);
                LIZ.LJIJJ(str, "position");
                LIZ.LJJIIJZLJL();
            }
            str = "outside";
            BZI LIZ2 = C28787BRn.LIZ("livesdk_cover_modify_click");
            LIZ2.LJIILLIIL(this.LJLJL);
            LIZ2.LJIIL("click");
            LIZ2.LJIIIZ("live");
            LIZ2.LJJIFFI(hashMap);
            LIZ2.LJIJJ(str, "position");
            LIZ2.LJJIIJZLJL();
        }
    }

    public ViewOnClickListenerC28501BGn(View view, BaseFragment baseFragment, DataChannel dataChannel) {
        Object obj;
        int i = LJLLILLLL;
        int i2 = LJLLJ;
        this.LJLJJLL = new C73318Sq2();
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            obj = ((C29374Bfu) LIZIZ).LIZIZ;
        } else {
            obj = null;
        }
        this.LJLL = obj instanceof User ? (User) obj : null;
        this.LJLLI = new HashMap();
        this.LJLJL = dataChannel;
        LJLLILLLL = i;
        LJLLJ = i2;
        if (i > i2) {
            LJLLL = 480;
            LJLLLL = 270;
        } else if (i < i2) {
            LJLLL = 270;
            LJLLLL = 480;
        }
        int value = LiveCoverMinSizeSetting.INSTANCE.getValue();
        LJLLL = value;
        LJLLLL = value;
        this.LJLJI = baseFragment;
        C47061t0 c47061t0 = (C47061t0) view.findViewById(R.id.fvr);
        this.LJLIL = c47061t0;
        if (c47061t0 != null) {
            C16880lQ.LJJI(c47061t0, this);
            h0.LJIJI(c47061t0, new A93(C15380j0.LJIILJJIL(R.string.k21)));
        }
        TextView textView = (TextView) view.findViewById(R.id.ma3);
        this.LJLILLLLZI = textView;
        this.LJLJJI = new C31870Cf4(baseFragment.mo49getActivity(), baseFragment, LJLLILLLL, LJLLJ, LJLLL, LJLLLL, new InterfaceC28505BGr() { // from class: X.BOo
            @Override // X.InterfaceC28505BGr
            public final /* synthetic */ void LIZ() {
            }

            @Override // X.InterfaceC28505BGr
            public final void LIZIZ(String str, String str2) {
                ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn = ViewOnClickListenerC28501BGn.this;
                viewOnClickListenerC28501BGn.LJLJJL = str2;
                viewOnClickListenerC28501BGn.LJLJJI.LJII();
                File file = new File(str);
                if (!file.exists()) {
                    viewOnClickListenerC28501BGn.LJ(new Exception(i0.LJFF("avatar file don't exists in path ", str)));
                    return;
                }
                MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
                BP4 LIZ = C28718BOw.LIZ();
                LIZ.getClass();
                T28.LIZLLL(((BroadcastUserApi) LIZ.LIZIZ(BroadcastUserApi.class)).uploadAvatar(multipartTypedOutput)).LIZ(new C28502BGo(viewOnClickListenerC28501BGn, str));
                viewOnClickListenerC28501BGn.LJLJJL = str2;
            }
        }, true, true);
        if (!baseFragment.isViewValid() || textView == null) {
            return;
        }
        textView.setAlpha(0.64f);
    }
}

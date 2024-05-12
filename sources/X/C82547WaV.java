package X;

import Y.ARunnableS15S0101000_11;
import Y.ARunnableS16S0201000_13;
import Y.ARunnableS18S0101000_14;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.WaV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82547WaV extends UserVisibleHintGroupScene implements InterfaceC46304IFg {
    public static final /* synthetic */ int LJZL = 0;
    public W5X LJLIL;
    public C8ID LJLILLLLZI;
    public C74063T4x LJLJI;
    public TextView LJLJJI;
    public View LJLJJL;
    public boolean LJLJJLL;
    public ViewGroup LJLJL;
    public InterfaceC82548WaW LJLJLJ;
    public C82561Waj LJLJLLL;
    public Video LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public C82622Wbi LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public long LJLLLLLL;
    public InterfaceC46304IFg LJLZ;
    public boolean LJZ;
    public TextureView LJZI;

    public final void LLJILJIL() {
        C8ID c8id = this.LJLILLLLZI;
        if (c8id != null && c8id.getVisibility() == 0) {
            this.LJLILLLLZI.setVisibility(8);
            LLJILJILJ(false, 1302, EnumC42283Gid.DUAL_BALL);
        }
    }

    public final void LLJJ() {
        InterfaceC82548WaW interfaceC82548WaW;
        boolean z;
        if (this.LJLJLLL == null || (interfaceC82548WaW = this.LJLJLJ) == null || !interfaceC82548WaW.isValid()) {
            LLJJIII();
            return;
        }
        if (this.LJLL == null) {
            this.LJLL = C78840Uwu.LJIJJ(this.LJLJLJ);
        }
        if (!this.LJLLLL) {
            if (this.LJLJLLL.getCacheSize(this.LJLL) > 0) {
                z = true;
            } else {
                z = false;
            }
            this.LJZ = z;
        }
        InterfaceC82548WaW interfaceC82548WaW2 = this.LJLJLJ;
        if (interfaceC82548WaW2 != null && interfaceC82548WaW2.LJII() != EnumC43998HOo.MV_TEMPLATE && this.LJZI != null) {
            CutsameDataItem cutsameDataItem = (CutsameDataItem) this.LJLJLJ;
            cutsameDataItem.getClass();
            try {
                List LJLJJL = s.LJLJJL(cutsameDataItem.videoRatio, new String[]{":"}, 0, 6);
                if (LJLJJL.size() == 2) {
                    Integer width = CastIntegerProtector.valueOf((String) ListProtector.get(LJLJJL, 0));
                    float intValue = CastIntegerProtector.valueOf((String) ListProtector.get(LJLJJL, 1)).intValue();
                    o.LJIIIIZZ(width, "width");
                    float intValue2 = intValue / width.intValue();
                    if (intValue2 != 0.0f) {
                        int width2 = this.LJZI.getWidth();
                        float height = this.LJZI.getHeight();
                        float f = width2;
                        Matrix matrix = new Matrix();
                        matrix.setScale(1.0f, intValue2 / (height / f), f / 2.0f, height / 2.0f);
                        this.LJZI.setTransform(matrix);
                    }
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cutsame AspectRatio");
                LIZ.append(e.getMessage());
                H7B.LIZJ(X1D.LIZIZ(LIZ));
            }
        }
        this.LJLJLLL.tryResume(this.LJLL);
        this.LJLLLL = false;
        this.LJLLLLLL = System.currentTimeMillis();
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup != null) {
            viewGroup.postDelayed(new ARunnableS15S0101000_11(6, this, 14), 300L);
        }
    }

    public final void LLJJIII() {
        C8ID c8id;
        if ((!C41028G8i.LIZ() || C82550WaY.LJLJLLL == this.LJLLI) && (c8id = this.LJLILLLLZI) != null && c8id.getVisibility() != 0) {
            this.LJLILLLLZI.setVisibility(0);
            LLJILJILJ(true, 1302, EnumC42283Gid.DUAL_BALL);
        }
    }

    @Override // X.InterfaceC46304IFg
    public final void LJJIFFI(InterfaceC46305IFh interfaceC46305IFh) {
        LLJJIJI(0, 0, "");
        this.LJLLILLLL = true;
        LLJILJIL();
        W5X w5x = this.LJLIL;
        if (w5x != null) {
            w5x.setVisibility(8);
        }
        InterfaceC46304IFg interfaceC46304IFg = this.LJLZ;
        if (interfaceC46304IFg != null) {
            interfaceC46304IFg.LJJIFFI(interfaceC46305IFh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // X.InterfaceC46304IFg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJIZ(X.InterfaceC82549WaX r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L1c
            r2 = 0
        L4:
            java.lang.String r1 = ""
        L6:
            r0 = 1
            r4.LLJJIJI(r0, r2, r1)
            r4.LLJILJIL()
            X.W5X r0 = r4.LJLIL
            if (r0 == 0) goto L14
            r0.setVisibility(r3)
        L14:
            X.IFg r0 = r4.LJLZ
            if (r0 == 0) goto L1b
            r0.LJJLIIIJJIZ(r5)
        L1b:
            return
        L1c:
            int r2 = r5.getErrorCode()
            java.lang.Object r0 = r5.getExtraInfo()
            if (r0 != 0) goto L27
            goto L4
        L27:
            java.lang.Object r0 = r5.getExtraInfo()
            java.lang.String r1 = r0.toString()
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82547WaV.LJJLIIIJJIZ(X.WaX):void");
    }

    public final void LLJJI(boolean z) {
        int i;
        int i2;
        if (this.LJLJJLL == z) {
            return;
        }
        this.LJLJJLL = z;
        View view = this.LJLJJL;
        int i3 = 8;
        if (view != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        C74063T4x c74063T4x = this.LJLJI;
        if (c74063T4x != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c74063T4x.setVisibility(i);
        }
        TextView textView = this.LJLJJI;
        if (textView != null) {
            if (z) {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
        LLJILJILJ(z, 1303, EnumC42283Gid.PROGRESS);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C82561Waj c82561Waj = new C82561Waj(this.LJLLJ);
        this.LJLJLLL = c82561Waj;
        c82561Waj.addPlayerListener(this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.LJLLI = bundle2.getInt("position");
        }
    }

    @Override // X.InterfaceC46304IFg
    public final void onResumePlay(String str) {
        W5X w5x = this.LJLIL;
        if (w5x != null) {
            w5x.setVisibility(8);
        }
        InterfaceC46304IFg interfaceC46304IFg = this.LJLZ;
        if (interfaceC46304IFg != null) {
            interfaceC46304IFg.onResumePlay(str);
        }
    }

    public static void LLJILJILJ(boolean z, int i, EnumC42283Gid enumC42283Gid) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(i, ggo, enumC42283Gid, EnumC42282Gic.CLOSE_GONE, null);
    }

    public final void LLJJIJI(int i, int i2, String str) {
        String resUrl;
        String str2;
        String str3;
        String LIZIZ;
        ShortVideoContext shortVideoContext;
        if (!this.LJLLLL) {
            this.LJLLLL = true;
            Video video = this.LJLL;
            String str4 = "";
            if (video == null || video.getPlayAddr() == null || C78886Uxe.LJJIJ(this.LJLL.getPlayAddr().getUrlList())) {
                resUrl = "";
            } else {
                resUrl = (String) ListProtector.get(this.LJLL.getPlayAddr().getUrlList(), 0);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJLLLLLL;
            C82622Wbi c82622Wbi = this.LJLLJ;
            if (c82622Wbi == null || (shortVideoContext = (ShortVideoContext) c82622Wbi.LJ(ShortVideoContext.class, null)) == null) {
                str2 = "";
                str3 = "";
            } else {
                str2 = shortVideoContext.LJI();
                str3 = shortVideoContext.shootWay;
                if (str3 == null) {
                    str3 = "";
                }
            }
            InterfaceC82548WaW interfaceC82548WaW = this.LJLJLJ;
            if (interfaceC82548WaW == null) {
                LIZIZ = "";
            } else {
                LIZIZ = interfaceC82548WaW.LIZIZ();
            }
            C173166qu c173166qu = new C173166qu(currentTimeMillis, i, str, str2, str3, LIZIZ, i2);
            String str5 = C78855Ux9.LJLJL;
            boolean z = this.LJZ;
            o.LJIIIZ(resUrl, "resUrl");
            C145995oB LIZ = C173156qt.LIZ(c173166qu);
            LIZ.LJI("from", str5);
            LIZ.LJI("url", resUrl);
            LIZ.LIZ(z ? 1 : 0, "useCache");
            FMX.LJIIL("tool_performance_mv_cover_video_load_state", LIZ.LIZ);
            InterfaceC82548WaW interfaceC82548WaW2 = this.LJLJLJ;
            if (interfaceC82548WaW2 != null) {
                str4 = interfaceC82548WaW2.LIZIZ();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis);
            jSONObject.put("error_code", i2);
            jSONObject.put("error_msg", str);
            jSONObject.put("url", resUrl);
            jSONObject.put("template_id", str4);
            jSONObject.put("from", C78855Ux9.LJLJL);
            C43882HKc.LIZ.LIZLLL("mv_cover_video_load_state", i, jSONObject, null);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextureView textureView;
        if (this.LJLJL == null) {
            this.LJLJL = (ViewGroup) C16880lQ.LLLLIILL(layoutInflater, R.layout.bda, viewGroup, false);
        }
        this.LJLIL = (W5X) this.LJLJL.findViewById(R.id.f59);
        this.LJLILLLLZI = (C8ID) this.LJLJL.findViewById(R.id.g94);
        this.LJLJI = (C74063T4x) this.LJLJL.findViewById(R.id.f6h);
        this.LJLJJL = this.LJLJL.findViewById(R.id.g8o);
        this.LJLJJI = (TextView) this.LJLJL.findViewById(R.id.ia9);
        this.LJLJI.setVisibility(4);
        this.LJLJJI.setVisibility(4);
        this.LJLJI.setColor(-1);
        this.LJLJI.setThickness((int) KL2.LIZJ(this.LJLJL.getContext(), 2.0f));
        this.LJLJL.setOutlineProvider(new C74263TCp((int) KL2.LIZJ(this.LJLIL.getContext(), 8.0f)));
        this.LJLJL.setClipToOutline(true);
        ViewGroup viewGroup2 = (ViewGroup) this.LJLJL.findViewById(R.id.j7n);
        C82622Wbi c82622Wbi = this.LJLLJ;
        if (c82622Wbi != null) {
            this.LJZI = ((InterfaceC47196Ifg) c82622Wbi.LJ(InterfaceC47196Ifg.class, null)).getKeepSurfaceTextureViewFactory().create(requireActivity());
            this.LJZI.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            viewGroup2.addView(this.LJZI, 0);
            this.LJLJLLL.wrap(this.LJZI);
        }
        C5L7.LIZIZ();
        if (C52239Kep.LIZ() && this.LJLJLJ.LJII() == EnumC43998HOo.CUT_SAME && ((CutsameDataItem) this.LJLJLJ).author != null) {
            TuxIconView tuxIconView = new TuxIconView(getSceneContext());
            tuxIconView.setPadding(8, 8, 8, 8);
            tuxIconView.setIconRes(R.raw.icon_capcut);
            tuxIconView.setColorFilter(C79045V0n.LJI(R.attr.dj, getSceneContext()).intValue());
            tuxIconView.LIZIZ(true);
            tuxIconView.setIconWidth((int) KL2.LIZJ(getSceneContext(), 24.0f));
            tuxIconView.setIconHeight((int) KL2.LIZJ(getSceneContext(), 24.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            viewGroup2.addView(tuxIconView, layoutParams);
        }
        this.LJLJL.setTag(Integer.valueOf(this.LJLLI));
        this.LJLJL.post(new ARunnableS16S0201000_13(1, this, viewGroup, 13));
        InterfaceC82548WaW interfaceC82548WaW = this.LJLJLJ;
        if (interfaceC82548WaW != null && !TextUtils.isEmpty(interfaceC82548WaW.LIZ())) {
            C78764Uvg.LJIIIZ(this.LJLIL, this.LJLJLJ.LIZ(), 1, 1);
        }
        if (this.LJLLI == 0 && !this.LJLLL && (textureView = this.LJZI) != null) {
            textureView.post(new ARunnableS18S0101000_14(5, this, 23));
        }
        return this.LJLJL;
    }
}

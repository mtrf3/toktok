package com.bytedance.effectcreatormobile.objectselect;

import X.ActivityC45651qj;
import X.C04330Ez;
import X.C0CM;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C29S;
import X.C36636EZk;
import X.C3C5;
import X.C47261Igj;
import X.C48841JEv;
import X.C51029K0z;
import X.C76800UCe;
import X.C80217Ve1;
import X.C90903hW;
import X.C93410aQQ;
import X.C93635aU3;
import X.C93670aUc;
import X.C93671aUd;
import X.C93709aVF;
import X.C93723aVT;
import X.C93747aVr;
import X.C93748aVs;
import X.C93787aWV;
import X.C93800aWi;
import X.C93829aXB;
import X.C93887aY7;
import X.C93965aZN;
import X.C93970aZS;
import X.C93971aZT;
import X.C94014aaA;
import X.C94034aaU;
import X.C94037aaX;
import X.C94164aca;
import X.C94203adD;
import X.C94270aeI;
import X.C94354afe;
import X.C94397agL;
import X.C94398agM;
import X.C94399agN;
import X.C94400agO;
import X.C94401agP;
import X.C94758amA;
import X.C94961apR;
import X.EnumC93823aX5;
import X.InterfaceC93955aZD;
import X.InterfaceC94013aa9;
import X.OHQ;
import X.OSZ;
import X.X1D;
import X.XKX;
import Y.IDRunnableS92S0100000_42;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.effectcreatormobile.ckeapi.api.CameraApi;
import com.bytedance.effectcreatormobile.ckeapi.api.album.EditMedia;
import com.bytedance.effectcreatormobile.ckeapi.api.album.IAlbumService;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextAlign;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextStyle;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.news.common.service.manager.IService;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class AssetsFragment extends BottomDrawerFragment implements InterfaceC94013aa9<C93671aUd> {
    public static String LJLJL = "";
    public C94037aaX LJLILLLLZI;
    public boolean LJLJJI;
    public final C93748aVs LJLJI = new C93748aVs();
    public int LJLJJL = -1;
    public final Handler LJLJJLL = new Handler(C16880lQ.LLJJJJ());

    public final File Al() {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        o.LJIIIIZZ(format, "SimpleDateFormat(\"yyyyMMdd_HHmmss\").format(Date())");
        Context context = getContext();
        o.LJI(context);
        File LLIIIL = C16880lQ.LLIIIL(context);
        o.LJIIIIZZ(LLIIIL, "context!!.cacheDir");
        String absolutePath = LLIIIL.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "context!!.cacheDir.absolutePath");
        File file = new File(C93965aZN.LIZIZ(absolutePath, "cke"));
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JPEG_");
        LIZ.append(format);
        LIZ.append('_');
        File createTempFile = File.createTempFile(X1D.LIZIZ(LIZ), ".jpg", file);
        String absolutePath2 = createTempFile.getAbsolutePath();
        o.LJIIIIZZ(absolutePath2, "absolutePath");
        LJLJL = absolutePath2;
        return createTempFile;
    }

    public final void Ll() {
        this.LJLJJLL.removeCallbacksAndMessages(null);
        IMain LIZ = C93723aVT.LIZ();
        if (LIZ != null) {
            LIZ.mainLoading(false);
        }
    }

    public final String Dl() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("capabilities_key")) != null) {
            return string;
        }
        return "";
    }

    public final String Gl() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key_effect_category")) != null) {
            return string;
        }
        return "";
    }

    public final String Hl() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key_effect_path")) != null) {
            return string;
        }
        return "";
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Ll();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLJI.LIZ.set(false);
    }

    public final void xl() {
        CameraApi cameraApi;
        try {
            File Al = Al();
            if (Al != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start capture iamge: ");
                LIZ.append(Al.getAbsolutePath());
                LIZ.append('-');
                LIZ.append(Al.length());
                C94034aaU.LIZ("AssetsFragment", X1D.LIZIZ(LIZ));
                C93970aZS LIZ2 = C93971aZT.LIZ();
                if (LIZ2 != null && (cameraApi = (CameraApi) LIZ2.LIZ(CameraApi.class)) != null) {
                    cameraApi.takePhoto(this, Al, 1);
                }
            }
        } catch (IOException unused) {
        }
    }

    public static void Kl(AssetsFragment assetsFragment) {
        assetsFragment.getClass();
        IMain LIZ = C93723aVT.LIZ();
        if (LIZ != null) {
            LIZ.mainLoading(true);
        }
        assetsFragment.LJLJJLL.postDelayed(new IDRunnableS92S0100000_42(assetsFragment, 13), 2000L);
    }

    public static final /* synthetic */ C94037aaX wl(AssetsFragment assetsFragment) {
        C94037aaX c94037aaX = assetsFragment.LJLILLLLZI;
        if (c94037aaX != null) {
            return c94037aaX;
        }
        o.LJIJI("binding");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Il(X.InterfaceC67352kd<? super java.util.List<X.OSZ<java.lang.String, X.InterfaceC65784Pro<androidx.fragment.app.Fragment>>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C94541aif
            if (r0 == 0) goto Lac
            r6 = r8
            X.aif r6 = (X.C94541aif) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lac
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L73
            if (r0 != r5) goto Lb3
            java.lang.Object r3 = r6.LJLJJL
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r6.LJLJJI
            com.bytedance.effectcreatormobile.objectselect.AssetsFragment r4 = (com.bytedance.effectcreatormobile.objectselect.AssetsFragment) r4
            X.C141335gf.LIZJ(r1)
        L28:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != r5) goto L65
            r0 = 2131830813(0x7f11281d, float:1.9294634E38)
            java.lang.String r2 = r4.getString(r0)
            java.lang.String r0 = "getString(com.ugc.effect…ge.R.string.giphy_gs_tab)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r1 = r4.Gl()
            java.lang.String r0 = "background_sticker"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L66
            com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository r0 = X.C93817aWz.LIZ()
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.getBackgroundGifSource()
        L52:
            X.aig r1 = new X.aig
            r1.<init>(r0)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r1)
            r3.add(r0)
            int r0 = X.C47261Igj.LJJI(r3)
            r4.LJLJJL = r0
        L65:
            return r3
        L66:
            com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository r0 = X.C93817aWz.LIZ()
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.getNoBackgroundGifSource()
            goto L52
        L71:
            r0 = 0
            goto L52
        L73:
            X.C141335gf.LIZJ(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = 2131826335(0x7f11169f, float:1.9285551E38)
            java.lang.String r2 = r7.getString(r0)
            java.lang.String r0 = "getString(com.ugc.effect….com_mig_stickers_eym4co)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            kotlin.jvm.internal.IDqS423S0100000_42 r1 = new kotlin.jvm.internal.IDqS423S0100000_42
            r0 = 30
            r1.<init>(r7, r0)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r1)
            r3.add(r0)
            com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository r0 = X.C93817aWz.LIZ()
            if (r0 == 0) goto L65
            r6.LJLJJI = r7
            r6.LJLJJL = r3
            r6.LJLILLLLZI = r5
            java.lang.Object r1 = r0.isAvailable(r6)
            if (r1 != r4) goto La9
            return r4
        La9:
            r4 = r7
            goto L28
        Lac:
            X.aif r6 = new X.aif
            r6.<init>(r7, r8)
            goto L12
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.objectselect.AssetsFragment.Il(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC94013aa9
    /* renamed from: Ml, reason: merged with bridge method [inline-methods] */
    public final void U0(C93671aUd info) {
        String str;
        String str2;
        FragmentManager fragmentManager;
        Feature LJFF;
        long j;
        FragmentManager fragmentManager2;
        ILayer LIZ;
        String str3;
        String str4;
        o.LJIIIZ(info, "info");
        if (info instanceof C94399agN) {
            StatisticReporter LIZ2 = C93670aUc.LIZ();
            if (LIZ2 != null) {
                LIZ2.onEvent("asset_sheet_camera_click");
            }
            xl();
            return;
        }
        if (info instanceof C94397agL) {
            StatisticReporter LIZ3 = C93670aUc.LIZ();
            if (LIZ3 != null) {
                LIZ3.onEvent("asset_sheet_album_click");
            }
            IAlbumService iAlbumService = (IAlbumService) ((IService) C93971aZT.LIZ().LIZ(IAlbumService.class));
            if (iAlbumService == null) {
                return;
            }
            iAlbumService.startSelectMedia(this, 1001, new C94354afe());
            return;
        }
        if (info instanceof C94398agM) {
            C94398agM c94398agM = (C94398agM) info;
            String str5 = c94398agM.LIZJ;
            StatisticReporter LIZ4 = C93670aUc.LIZ();
            if (LIZ4 != null) {
                LIZ4.onEvent("library_asset_click", C51029K0z.LJJIIZI(new OSZ("asset_id", str5)));
            }
            Kl(this);
            String str6 = c94398agM.LIZIZ;
            Bundle arguments = getArguments();
            if (arguments == null || (str3 = arguments.getString("type_name")) == null) {
                str3 = "";
            }
            String Hl = Hl();
            String str7 = c94398agM.LIZ;
            EnumC93823aX5 enumC93823aX5 = EnumC93823aX5.ResourcePackage;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (str4 = arguments2.getString("key_effect_identity")) == null) {
                str4 = "";
            }
            Jl(new C94270aeI(str6, str3, Hl, str7, enumC93823aX5, str4, c94398agM.LIZJ, Gl(), Dl()), false);
            return;
        }
        if (info instanceof C94401agP) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null && (fragmentManager2 = parentFragment.getFragmentManager()) != null && (LIZ = C93709aVF.LIZ()) != null) {
                LIZ.hideLayerPage(fragmentManager2);
            }
            Fragment parentFragment2 = getParentFragment();
            if ((parentFragment2 instanceof ObjectSelectFragment) && parentFragment2 != null && (fragmentManager = parentFragment2.getFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJIIIZ(parentFragment2);
                c1b3.LJI();
            }
            MutableLiveData mutableLiveData = CKEffectEditorContext.LJIIIIZZ;
            Long l = (Long) mutableLiveData.getValue();
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                arguments3.putLong("key_text_edit_feature_id", j);
            }
            Long l2 = (Long) mutableLiveData.getValue();
            if (l2 != null) {
                long longValue = l2.longValue();
                C93829aXB LJI = CKEffectEditorContext.LJI();
                if (LJI != null && (LJFF = LJI.LJFF(longValue)) != null) {
                    LJFF.setVisible(false);
                }
            }
            CKEffectEditorContext.LJIILJJIL(null);
            ITextEdit LIZ5 = C93887aY7.LIZ();
            if (LIZ5 == null) {
                return;
            }
            LIZ5.openTextEditor(this, 1002, new TextModel("", "", "", TextStyle.TextColor, TextAlign.Center, null));
            return;
        }
        if (!(info instanceof C94400agO)) {
            return;
        }
        C94400agO c94400agO = (C94400agO) info;
        String str8 = c94400agO.LIZLLL;
        StatisticReporter LIZ6 = C93670aUc.LIZ();
        if (LIZ6 != null) {
            LIZ6.onEvent("library_asset_click", C51029K0z.LJJIIZI(new OSZ("asset_id", str8)));
        }
        Kl(this);
        String str9 = c94400agO.LIZIZ;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str = arguments4.getString("type_name")) == null) {
            str = "";
        }
        String Hl2 = Hl();
        String str10 = c94400agO.LIZJ;
        EnumC93823aX5 enumC93823aX52 = EnumC93823aX5.ThirdParty;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str2 = arguments5.getString("key_effect_identity")) == null) {
            str2 = "";
        }
        Jl(new C94270aeI(enumC93823aX52, new C93800aWi(c94400agO.LIZIZ, c94400agO.LJ), str9, str, Hl2, str10, str2, c94400agO.LIZLLL, Gl(), Dl()), false);
    }

    public final void Jl(C94270aeI c94270aeI, boolean z) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C94758amA(this, z, c94270aeI, null), 3);
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getBoolean("sub_page_style");
        }
        C94037aaX c94037aaX = this.LJLILLLLZI;
        if (c94037aaX != null) {
            ImageView imageView = c94037aaX.LJLJJI;
            o.LJIIIIZZ(imageView, "binding.iconBack");
            InterfaceC93955aZD interfaceC93955aZD = this.LJLIL;
            if (interfaceC93955aZD != null) {
                i = interfaceC93955aZD.getBackStackCount();
            } else {
                i = 0;
            }
            if (i > 1) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            C94037aaX c94037aaX2 = this.LJLILLLLZI;
            if (c94037aaX2 != null) {
                ImageView imageView2 = c94037aaX2.LJLJJI;
                o.LJIIIIZZ(imageView2, "binding.iconBack");
                C93747aVr.LIZIZ(imageView2, this.LJLJI, new IDqS419S0100000_42(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
                C94037aaX c94037aaX3 = this.LJLILLLLZI;
                if (c94037aaX3 != null) {
                    View childAt = c94037aaX3.LJLJLJ.getChildAt(0);
                    if (!(childAt instanceof RecyclerView)) {
                        childAt = null;
                    }
                    if (childAt != null) {
                        childAt.setOverScrollMode(2);
                    }
                    LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                    o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94961apR(this, null), 3);
                    Context context = getContext();
                    if (context != null) {
                        float LIZ = C93410aQQ.LIZ(10.0f);
                        Resources resources = context.getResources();
                        String string = resources.getString(R.string.fvi);
                        o.LJIIIIZZ(string, "resources.getString(effect_tool_canvas_camera)");
                        String string2 = resources.getString(R.string.fvo);
                        o.LJIIIIZZ(string2, "resources.getString(effect_tool_create_album)");
                        String string3 = resources.getString(R.string.fvv);
                        o.LJIIIIZZ(string3, "resources.getString(effect_tool_create_text)");
                        for (C94203adD c94203adD : C47261Igj.LJJIJIIJI(new C94203adD(R.drawable.dg0, string, new C94399agN()), new C94203adD(R.drawable.dfy, string2, new C94397agL()), new C94203adD(R.drawable.dg8, string3, new C94401agP()))) {
                            LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
                            C94037aaX c94037aaX4 = this.LJLILLLLZI;
                            if (c94037aaX4 != null) {
                                View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.dun, c94037aaX4.LJLJJL, false);
                                if (LLLLIILL != null) {
                                    TextView textView = (TextView) LLLLIILL;
                                    textView.setBackground(C93787aWV.LIZ(LIZ, LIZ, LIZ, LIZ, C04330Ez.LIZIZ(textView.getContext(), R.color.adm), C04330Ez.LIZIZ(textView.getContext(), R.color.ado)));
                                    textView.setText(c94203adD.LJLILLLLZI);
                                    textView.setCompoundDrawablesWithIntrinsicBounds(0, c94203adD.LJLIL, 0, 0);
                                    C93747aVr.LIZIZ(textView, this.LJLJI, new IDqS175S0200000_42(c94203adD, this, 19));
                                    C94037aaX c94037aaX5 = this.LJLILLLLZI;
                                    if (c94037aaX5 != null) {
                                        c94037aaX5.LJLJJL.addView(textView);
                                    } else {
                                        o.LJIJI("binding");
                                        throw null;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                }
                            } else {
                                o.LJIJI("binding");
                                throw null;
                            }
                        }
                    }
                    StatisticReporter LIZ2 = C93670aUc.LIZ();
                    if (LIZ2 != null) {
                        LIZ2.onEvent("asset_sheet_enter");
                        return;
                    }
                    return;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentManager fragmentManager;
        Feature LJFF;
        TextModel textModel;
        String str;
        List<EditMedia> parseIntentData;
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            IAlbumService iAlbumService = (IAlbumService) ((IService) C93971aZT.LIZ().LIZ(IAlbumService.class));
            if (iAlbumService != null && (parseIntentData = iAlbumService.parseIntentData(intent, null)) != null && (!parseIntentData.isEmpty())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("album select time: ");
                LIZ.append(System.currentTimeMillis());
                C94034aaU.LIZ("AssetsFragment", X1D.LIZIZ(LIZ));
                Kl(this);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SOURCE = ");
                LIZ2.append(((EditMedia) ListProtector.get(parseIntentData, 0)).getPath());
                LIZ2.append("  c");
                C94034aaU.LIZ("AssetsFragment", X1D.LIZIZ(LIZ2));
                C94014aaA.LIZ(((EditMedia) ListProtector.get(parseIntentData, 0)).getPath(), true, new IDqS419S0100000_42(this, 13));
                return;
            }
            return;
        }
        if (i == 1) {
            if (i2 != -1) {
                return;
            }
            try {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("capture image finish: ");
                LIZ3.append(LJLJL);
                LIZ3.append('-');
                LIZ3.append(new File(LJLJL).length());
                C94034aaU.LIZ("AssetsFragment", X1D.LIZIZ(LIZ3));
            } catch (Exception unused) {
            }
            Kl(this);
            C94014aaA.LIZ(LJLJL, false, new IDqS419S0100000_42(this, 14));
            return;
        }
        if (i != 1002) {
            return;
        }
        if (i2 == -1) {
            if (intent != null && (textModel = (TextModel) intent.getParcelableExtra("key_text_model")) != null && (str = textModel.textSticker) != null) {
                Kl(this);
                C94014aaA.LIZ(str, false, new IDqS175S0200000_42(this, textModel, 20));
            }
        } else {
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof ObjectSelectFragment) && parentFragment != null && (fragmentManager = parentFragment.getFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJIIL(parentFragment);
                c1b3.LJI();
            }
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        long j = arguments.getLong("key_text_edit_feature_id");
        C93829aXB c93829aXB = CKEffectEditorContext.LJIILL;
        if (c93829aXB != null && (LJFF = c93829aXB.LJFF(j)) != null) {
            LJFF.setVisible(true);
        }
        CKEffectEditorContext.LJIILJJIL(Long.valueOf(j));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dur, viewGroup, false);
        int i = R.id.a6m;
        C80217Ve1 c80217Ve1 = (C80217Ve1) LLLLIILL.findViewById(R.id.a6m);
        if (c80217Ve1 != null) {
            i = R.id.nn8;
            View findViewById = LLLLIILL.findViewById(R.id.nn8);
            if (findViewById != null) {
                i = R.id.ear;
                ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.ear);
                if (imageView != null) {
                    i = R.id.nnz;
                    LinearLayout linearLayout = (LinearLayout) LLLLIILL.findViewById(R.id.nnz);
                    if (linearLayout != null) {
                        i = R.id.g8a;
                        FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
                        if (frameLayout != null) {
                            i = R.id.kyt;
                            C93635aU3 c93635aU3 = (C93635aU3) LLLLIILL.findViewById(R.id.kyt);
                            if (c93635aU3 != null) {
                                i = R.id.mo6;
                                if (LLLLIILL.findViewById(R.id.mo6) != null) {
                                    i = R.id.nb6;
                                    C0CM c0cm = (C0CM) LLLLIILL.findViewById(R.id.nb6);
                                    if (c0cm != null) {
                                        C94164aca c94164aca = (C94164aca) LLLLIILL;
                                        this.LJLILLLLZI = new C94037aaX(c94164aca, c80217Ve1, findViewById, imageView, linearLayout, frameLayout, c93635aU3, c0cm);
                                        try {
                                            ViewTreeLifecycleOwner.set(c94164aca, getViewLifecycleOwner());
                                            ViewTreeViewModelStoreOwner.set(c94164aca, this);
                                            C10A.LIZIZ(c94164aca, this);
                                            ActivityC45651qj mo49getActivity = mo49getActivity();
                                            if (mo49getActivity instanceof C29S) {
                                                c29s = (C29S) mo49getActivity;
                                            } else {
                                                c29s = null;
                                            }
                                            C90903hW.LIZ(c29s);
                                            C3C5.m7constructorimpl(C76800UCe.LIZ);
                                        } catch (Throwable th) {
                                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                        }
                                        return c94164aca;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        if (i != 1 || grantResults.length == 0 || grantResults[0] != 0) {
            return;
        }
        xl();
    }
}

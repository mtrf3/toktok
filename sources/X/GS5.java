package X;

import Y.ACListenerS42S0200000_7;
import Y.ACallableS30S1100000_2;
import Y.AgS124S0100000_7;
import Y.IDCListenerS375S0100000_7;
import Y.IDObjectS179S0100000_7;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS56S0201000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GS5 {
    public VideoPublishEditModel LIZ;
    public final WM7 LIZIZ;
    public final View LIZJ;
    public final GSG LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;
    public final ActivityC45651qj LJFF;
    public boolean LJI;
    public ViewGroup LJII;
    public C42176Ggu LJIIIIZZ;
    public ExpandedTitleModule LJIIIZ;
    public View LJIIJ;
    public EditText LJIIJJI;
    public GSR LJIIL;
    public TextView LJIILIIL;
    public final boolean LJIILJJIL;
    public final List<RunnableC151315wl> LJIILL;
    public final LinkedBlockingQueue<Runnable> LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final HashMap<String, String> LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public final int LJIJJLI;
    public final GS6 LJIL;
    public final GSQ LJJ;

    public final String LIZ() {
        ExpandedTitleModule expandedTitleModule = this.LJIIIZ;
        if (expandedTitleModule != null) {
            return expandedTitleModule.LJLJLLL.getText().toString();
        }
        return null;
    }

    public final void LJI() {
        GSR gsr;
        GSR gsr2;
        if (this.LJIJJ) {
            return;
        }
        ViewGroup viewGroup = this.LJII;
        if (viewGroup != null) {
            gsr = (GSR) viewGroup.findViewById(R.id.cqu);
        } else {
            gsr = (GSR) this.LIZJ.findViewById(R.id.cqu);
        }
        this.LJIIL = gsr;
        if (GSI.LIZ() && (gsr2 = this.LJIIL) != null) {
            gsr2.setLineSpacing(0.0f, 1.4f);
        }
        GSR gsr3 = this.LJIIL;
        if (gsr3 != null) {
            gsr3.setFocusChangeListener(new IDCListenerS375S0100000_7(this, 2));
        }
        this.LJIJJ = true;
    }

    public final void LJII() {
        float f;
        ViewGroup viewGroup = this.LJII;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.a9d);
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.a9c);
            TextView textView3 = (TextView) viewGroup.findViewById(R.id.wd);
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd((int) viewGroup.getContext().getResources().getDimension(R.dimen.a65));
            textView2.setLayoutParams(marginLayoutParams);
            textView3.setVisibility(0);
            textView3.setCompoundDrawablesRelative(C41554GSo.LIZ(this.LJFF), null, null, null);
            if (C19N.LJ("photo_mode_publish_expand", false) || GSI.LIZ()) {
                f = 88.0f;
            } else {
                f = 52.0f;
            }
            int LJIIJJI = (KL2.LJIIJJI(viewGroup.getContext()) - ((int) KL2.LIZJ(viewGroup.getContext(), f))) / 3;
            textView3.setMaxWidth(LJIIJJI);
            textView.setMaxWidth(LJIIJJI);
            textView2.setMaxWidth(LJIIJJI);
        }
    }

    public final void LIZIZ(View rootView) {
        C42176Ggu c42176Ggu;
        List<PhotoModeImageUrlModel> list;
        View view;
        EditText editText;
        TextView textView;
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        View findViewById;
        UrlModel urlModel;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        o.LJIIIZ(rootView, "rootView");
        if (!C79004UzY.LJJIJ(this.LIZ)) {
            return;
        }
        C16880lQ.LJLLL(rootView.findViewById(R.id.n5t), (ViewGroup) rootView.findViewById(R.id.coe));
        ViewGroup viewGroup = (ViewGroup) ((ViewStub) rootView.findViewById(R.id.eh7)).inflate();
        this.LJII = viewGroup;
        if (viewGroup != null) {
            c42176Ggu = (C42176Ggu) viewGroup.findViewById(R.id.eim);
        } else {
            c42176Ggu = null;
        }
        this.LJIIIIZZ = c42176Ggu;
        EditPostModel editPostModel = this.LIZ.creativeModel.editPostModel;
        if (editPostModel != null) {
            list = editPostModel.getImageList();
        } else {
            list = null;
        }
        C42176Ggu c42176Ggu2 = this.LJIIIIZZ;
        if (c42176Ggu2 != null) {
            List<SingleImageData> imageList = this.LIZ.getImageAlbumData().getImageList();
            ArrayList arrayList = new ArrayList(C32I.LJJL(imageList, 10));
            int i2 = 0;
            for (SingleImageData singleImageData : imageList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    SingleImageData singleImageData2 = singleImageData;
                    String tempSynthesisPath = singleImageData2.getEditImageInfo().getTempSynthesisPath();
                    if (tempSynthesisPath == null) {
                        tempSynthesisPath = singleImageData2.getSrcImageInfo().getPath();
                    }
                    int bitmapWidth = singleImageData2.getEditImageInfo().getBitmapWidth();
                    int bitmapHeight = singleImageData2.getEditImageInfo().getBitmapHeight();
                    if (list != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) ORZ.LJLLLLLL(i2, list)) != null) {
                        urlModel = photoModeImageUrlModel.getThumbnail();
                    } else {
                        urlModel = null;
                    }
                    arrayList.add(new GZU(bitmapWidth, bitmapHeight, urlModel, tempSynthesisPath));
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c42176Ggu2.setThumbnailData(arrayList);
            c42176Ggu2.setOnItemClickListener(this.LIZLLL);
            c42176Ggu2.setOnChooseCoverBtnClickListener(new ACListenerS42S0200000_7(this, list, 26));
            c42176Ggu2.setOnItemSwapListener(new GS7(this));
            c42176Ggu2.setOnScrollEndListener(new AqS173S0100000_7(this, 295));
            c42176Ggu2.setCoverIndicator(this.LIZ.getCoverPublishModel().getImageCurrentIndex());
        }
        ViewGroup viewGroup2 = this.LJII;
        if (viewGroup2 != null) {
            this.LJIIIZ = new ExpandedTitleModule(this.LIZIZ, this.LIZ, viewGroup2, this.LIZJ);
        }
        ViewGroup viewGroup3 = this.LJII;
        if (viewGroup3 != null && (view = viewGroup3.findViewById(R.id.l_j)) != null) {
            C62822Ol8 c62822Ol8 = C41026G8g.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C26338AVi.LJI(view, null, AnonymousClass391.LIZJ(8), null, AnonymousClass391.LIZJ(16), false, 21);
            } else if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                C26338AVi.LJI(view, null, AnonymousClass391.LIZJ(8), null, AnonymousClass391.LIZJ(12), false, 21);
                ViewGroup viewGroup4 = this.LJII;
                if (viewGroup4 != null && (findViewById = viewGroup4.findViewById(R.id.cdw)) != null) {
                    findViewById.setVisibility(0);
                }
            }
        } else {
            view = null;
        }
        this.LJIIJ = view;
        ViewGroup viewGroup5 = this.LJII;
        if (viewGroup5 != null && (editText = (EditText) viewGroup5.findViewById(R.id.cqv)) != null) {
            editText.setHint(R.string.jk6);
        } else {
            editText = null;
        }
        this.LJIIJJI = editText;
        ViewGroup viewGroup6 = this.LJII;
        if (viewGroup6 != null) {
            textView = (TextView) viewGroup6.findViewById(R.id.l_f);
        } else {
            textView = null;
        }
        this.LJIILIIL = textView;
        int i4 = this.LJIJJLI;
        String str4 = this.LIZ.heading;
        if (str4 != null) {
            i = str4.length();
        } else {
            i = 0;
        }
        LJIIIIZZ(i4 - i);
        if ((this.LJIILJJIL && (str3 = this.LIZ.heading) != null && !ujb.o.LJJJJJL(str3)) || (C41535GRv.LIZ() && (str = this.LIZ.heading) != null && !ujb.o.LJJJJJL(str))) {
            View view2 = this.LJIIJ;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            TextView textView2 = this.LJIILIIL;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            EditText editText2 = this.LJIIJJI;
            if (editText2 != null) {
                editText2.setText(this.LIZ.heading);
            }
        }
        EditText editText3 = this.LJIIJJI;
        if (editText3 != null) {
            editText3.setOnFocusChangeListener(new IDCListenerS375S0100000_7(this, 1));
        }
        EditText editText4 = this.LJIIJJI;
        if (editText4 != null) {
            editText4.addTextChangedListener(new IDObjectS179S0100000_7(this, 1));
        }
        EditText editText5 = this.LJIIJJI;
        if (editText5 != null) {
            editText5.setFilters(new InputFilter[]{this.LJIL, this.LJJ});
        }
        ((IAZ) this.LIZJ.findViewById(R.id.ifg)).LJLIL = true;
        ViewGroup viewGroup7 = this.LJII;
        if (viewGroup7 != null) {
            viewGroup7.setOnTouchListener(ViewOnTouchListenerC41330GJy.LJLIL);
        }
        if (list == null) {
            this.LJIJI = this.LIZ.getCoverPublishModel().getEffectTextModel().getHasCoverText();
            ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
            o.LJI(imageAlbumData);
            int i5 = 0;
            for (SingleImageData singleImageData3 : imageAlbumData.getImageList()) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    SingleImageData singleImageData4 = singleImageData3;
                    if (!singleImageData4.getEditImageInfo().getNeedCompileLocalImage() && !singleImageData4.getFilterInfo().getNeedRender()) {
                        Iterator<StickerItemModel> it = singleImageData4.getStickerInfo().getStickers().iterator();
                        while (it.hasNext()) {
                            if (it.next().isTextSticker()) {
                            }
                        }
                        if (i5 == this.LIZ.getCoverPublishModel().getImageCurrentIndex()) {
                            String tempSynthesisPath2 = singleImageData4.getEditImageInfo().getTempSynthesisPath();
                            if (tempSynthesisPath2 == null) {
                                tempSynthesisPath2 = singleImageData4.getSrcImageInfo().getPath();
                            }
                            LJIIIZ(i5, singleImageData4.getEditImageInfo().getBitmapWidth(), singleImageData4.getEditImageInfo().getBitmapHeight(), tempSynthesisPath2);
                        }
                        i5 = i6;
                    }
                    ExecutorService executorService = (ExecutorService) this.LJIIZILJ.getValue();
                    ImageAlbumData imageAlbumData2 = this.LIZ.getImageAlbumData();
                    o.LJIIIIZZ(imageAlbumData2, "mModel.imageAlbumData");
                    String path = singleImageData4.getSrcImageInfo().getPath();
                    VideoPublishEditModel editModel = this.LIZ;
                    o.LJIIIZ(editModel, "editModel");
                    String path2 = V16.LJIIJJI(editModel, EnumC43650HBe.SYNTHESISE, "image_mode_synthesis").getPath();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C173376rF.LJI(path));
                    LIZ.append('_');
                    LIZ.append(System.currentTimeMillis());
                    LIZ.append("_cover_");
                    if (((Boolean) GSE.LIZ.getValue()).booleanValue()) {
                        str2 = ".webp";
                    } else {
                        str2 = ".jpeg";
                    }
                    LIZ.append(str2);
                    String path3 = new File(path2, X1D.LIZIZ(LIZ)).getPath();
                    o.LJIIIIZZ(path3, "File(\n            synthe…geFormat()\n        ).path");
                    RunnableC151315wl runnableC151315wl = new RunnableC151315wl(singleImageData4, imageAlbumData2, path3, null, new AqS56S0201000_7(this, singleImageData4, i5, 2), GS9.LJLIL, 8);
                    ((ArrayList) this.LJIILL).add(runnableC151315wl);
                    executorService.submit(runnableC151315wl);
                    i5 = i6;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        this.LJI = true;
    }

    public final void LIZLLL(boolean z) {
        ExpandedTitleModule expandedTitleModule = this.LJIIIZ;
        if (expandedTitleModule != null) {
            expandedTitleModule.LJI(z);
        }
    }

    public final void LJIIIIZZ(int i) {
        TextView textView = this.LJIILIIL;
        if (textView == null) {
            return;
        }
        textView.setText(C60903NvH.LJ.getResources().getString(R.string.jk7, Integer.valueOf(i)));
    }

    public final void LJ(Bitmap coverBitmap, VideoPublishEditModel model) {
        boolean z;
        ImageSynthesisResult synthesisData;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(coverBitmap, "coverBitmap");
        C42176Ggu c42176Ggu = this.LJIIIIZZ;
        if (c42176Ggu == null) {
            return;
        }
        this.LIZ = model;
        int currentCoverIndex = c42176Ggu.getCurrentCoverIndex();
        int imageCurrentIndex = this.LIZ.getCoverPublishModel().getImageCurrentIndex();
        if (this.LJIJI || this.LIZ.getCoverPublishModel().getEffectTextModel().getHasCoverText()) {
            z = true;
        } else {
            z = false;
        }
        if (currentCoverIndex != imageCurrentIndex) {
            SingleImageData singleImageData = (SingleImageData) ListProtector.get(this.LIZ.getImageAlbumData().getImageList(), currentCoverIndex);
            String str = this.LJIJ.get(singleImageData.getSrcImageInfo().getPath());
            if (str == null && (((synthesisData = singleImageData.getSynthesisData()) == null || (str = synthesisData.getPath()) == null) && (str = singleImageData.getEditImageInfo().getTempSynthesisPath()) == null)) {
                str = singleImageData.getSrcImageInfo().getPath();
            }
            o.LJIIIIZZ(str, "coverMap[imageData.srcIm…ageData.srcImageInfo.path");
            C42176Ggu c42176Ggu2 = this.LJIIIIZZ;
            if (c42176Ggu2 != null) {
                c42176Ggu2.LIZ(currentCoverIndex, new GZU(str, singleImageData.getEditImageInfo().getBitmapWidth(), singleImageData.getEditImageInfo().getBitmapHeight(), 8));
            }
            C42176Ggu c42176Ggu3 = this.LJIIIIZZ;
            if (c42176Ggu3 != null) {
                c42176Ggu3.setCoverIndicator(imageCurrentIndex);
            }
        }
        if (this.LIZ.getVideoCoverPath() != null && z) {
            InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
            CreativeInfo creativeInfo = this.LIZ.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
            String LJJLIIIJLJLI = LIZIZ.LJJLIIIJLJLI(creativeInfo, C43077GvR.LIZ("_cover.raw"));
            C10K.LIZJ(new ACallableS30S1100000_2(coverBitmap, LJJLIIIJLJLI, 4)).LJ(new GS8(this, imageCurrentIndex, LJJLIIIJLJLI, coverBitmap), C10K.LJIIIIZZ, null);
        }
        this.LJIJI = this.LIZ.getCoverPublishModel().getEffectTextModel().getHasCoverText();
    }

    public final void LJFF(int i, int i2) {
        ExpandedTitleModule expandedTitleModule = this.LJIIIZ;
        if (expandedTitleModule != null) {
            expandedTitleModule.LJII(i, i2);
        }
    }

    public final void LJIIIZ(int i, final int i2, final int i3, final String str) {
        if (this.LIZ.getCoverPublishModel().getEffectTextModel().getHasCoverText()) {
            C10K.LIZJ(new Callable() { // from class: X.5yN
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bitmap srcBmp;
                    if (ujb.o.LJJJJ(str, ".raw", false)) {
                        srcBmp = C151525x6.LIZIZ(str, i2, i3);
                        if (srcBmp == null) {
                            int i4 = i2;
                            int i5 = i3;
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            o.LJIIIZ(config, "config");
                            srcBmp = Bitmap.createBitmap(i4, i5, config);
                            o.LJIIIIZZ(srcBmp, "createBitmap(width, height, config)");
                        }
                    } else {
                        srcBmp = BitmapFactory.decodeFile(str);
                    }
                    EffectTextModel effectTextModel = this.LIZ.getCoverPublishModel().getEffectTextModel();
                    o.LJIIIIZZ(srcBmp, "srcBmp");
                    return effectTextModel.mergeCoverText(srcBmp);
                }
            }).LJ(new AgS124S0100000_7(this, 24), C10K.LJIIIIZZ, null);
            return;
        }
        C42176Ggu c42176Ggu = this.LJIIIIZZ;
        if (c42176Ggu == null) {
            return;
        }
        c42176Ggu.LIZ(i, new GZU(str, i2, i3, 8));
    }

    public GS5(VideoPublishEditModel mModel, WM7 rootScene, View fragmentRootView, GSG gsg, AqS157S0100000_7 aqS157S0100000_7) {
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(fragmentRootView, "fragmentRootView");
        this.LIZ = mModel;
        this.LIZIZ = rootScene;
        this.LIZJ = fragmentRootView;
        this.LIZLLL = gsg;
        this.LJ = aqS157S0100000_7;
        this.LJFF = SceneExtensionsKt.LIZLLL(rootScene);
        this.LJIILJJIL = C19N.LJ("photo_mode_publish_title", false);
        this.LJIILL = new ArrayList();
        this.LJIILLIIL = new LinkedBlockingQueue<>();
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 104));
        this.LJIJ = new HashMap<>();
        this.LJIJJLI = C00F.LIZ(31744, 50, "photo_mode_title_max_length", true);
        this.LJIL = new GS6(this);
        this.LJJ = new GSQ(this);
    }

    public static void LIZJ(GS5 gs5, String str, boolean z, InterfaceC88472Yns interfaceC88472Yns, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            interfaceC88472Yns = GSA.LJLIL;
        }
        C164236cV.LIZIZ(gs5.LIZ, str, z, new AqS168S0100000_2(interfaceC88472Yns, 480));
    }
}

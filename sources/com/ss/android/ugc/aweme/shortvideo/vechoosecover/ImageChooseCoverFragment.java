package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C152935zN;
import X.C1552667m;
import X.C1555068k;
import X.C157766Hc;
import X.C221108m2;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C43679HCh;
import X.C47261Igj;
import X.C60903NvH;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C67R;
import X.C67S;
import X.C6B2;
import X.C6VB;
import X.C6VR;
import X.C6VZ;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78496UrM;
import X.C78764Uvg;
import X.C81184Vtc;
import X.C90903hW;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.W5G;
import X.X1D;
import Y.ARunnableS21S0200000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageChooseCoverFragment extends Fragment {
    public RelativeLayout LJLIL;
    public ViewGroup LJLILLLLZI;
    public RecyclerView LJLJI;
    public FrameLayout LJLJJI;
    public W5G LJLJJL;
    public C6VZ LJLJJLL;
    public FrameLayout LJLJL;
    public FrameLayout LJLJLJ;
    public FrameLayout LJLJLLL;
    public C6B2 LJLL;
    public C6VB LJLLI;
    public C1555068k LJLLILLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public View LJZ;
    public View LJZI;
    public View LJZL;
    public View LL;
    public int LLD;
    public boolean LLFF;
    public C6VR LLFFF;
    public VideoPublishEditModel LLFII;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public final Map<Integer, ImageSynthesisResult> LJLLJ = new LinkedHashMap();
    public boolean LJLLL = true;
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 288));
    public final C73318Sq2 LLF = new C73318Sq2();
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 287));
    public float LLI = 1.0f;
    public float LLIFFJFJJ = 1.0f;

    public final C67R vl() {
        C6VB c6vb = this.LJLLI;
        if (c6vb != null) {
            int childCount = c6vb.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (c6vb.getChildAt(i) instanceof C67R) {
                    View childAt = c6vb.getChildAt(i);
                    o.LJII(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextStickerView");
                    return (C67R) childAt;
                }
            }
            return null;
        }
        o.LJIJI("gestureLayout");
        throw null;
    }

    public final void Gl() {
        C67R vl = vl();
        if (vl != null) {
            this.LLI = vl.getCenterX() / this.LJLLLLLL;
            this.LLIFFJFJJ = vl.getCenterY() / this.LJLZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mStickerViewUnifyX = ");
            LIZ.append(this.LLI);
            LIZ.append(" mStickerViewUnifyY = ");
            LIZ.append(this.LLIFFJFJJ);
            X1D.LIZIZ(LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLF.dispose();
        ((C152935zN) this.LJLLLL.getValue()).LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLII).clear();
    }

    public final void Al(List<ImageSynthesisResult> list) {
        int i = 0;
        for (ImageSynthesisResult imageSynthesisResult : list) {
            int i2 = i + 1;
            if (i >= 0) {
                this.LJLLJ.put(Integer.valueOf(i), imageSynthesisResult);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C6VZ c6vz = this.LJLJJLL;
        if (c6vz != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<ImageSynthesisResult> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getPath());
            }
            c6vz.LJLJI = ORZ.LLJILJILJ(arrayList);
            c6vz.notifyDataSetChanged();
            return;
        }
        o.LJIJI("mCoverAdapter");
        throw null;
    }

    public final void Dl(boolean z) {
        if (z) {
            if (this.LJLLLLLL / this.LJLZ < 0.75f) {
                View view = this.LJZ;
                if (view != null) {
                    view.setVisibility(0);
                    View view2 = this.LJZI;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        View view3 = this.LJZL;
                        if (view3 != null) {
                            view3.setVisibility(4);
                            View view4 = this.LL;
                            if (view4 != null) {
                                view4.setVisibility(4);
                                return;
                            } else {
                                o.LJIJI("rightMaskView");
                                throw null;
                            }
                        }
                        o.LJIJI("leftMaskView");
                        throw null;
                    }
                    o.LJIJI("bottomMaskView");
                    throw null;
                }
                o.LJIJI("topMaskView");
                throw null;
            }
            View view5 = this.LJZ;
            if (view5 != null) {
                view5.setVisibility(4);
                View view6 = this.LJZI;
                if (view6 != null) {
                    view6.setVisibility(4);
                    View view7 = this.LJZL;
                    if (view7 != null) {
                        view7.setVisibility(0);
                        View view8 = this.LL;
                        if (view8 != null) {
                            view8.setVisibility(0);
                            return;
                        } else {
                            o.LJIJI("rightMaskView");
                            throw null;
                        }
                    }
                    o.LJIJI("leftMaskView");
                    throw null;
                }
                o.LJIJI("bottomMaskView");
                throw null;
            }
            o.LJIJI("topMaskView");
            throw null;
        }
        View view9 = this.LJZ;
        if (view9 != null) {
            view9.setVisibility(4);
            View view10 = this.LJZI;
            if (view10 != null) {
                view10.setVisibility(4);
                View view11 = this.LJZL;
                if (view11 != null) {
                    view11.setVisibility(4);
                    View view12 = this.LL;
                    if (view12 != null) {
                        view12.setVisibility(4);
                        return;
                    } else {
                        o.LJIJI("rightMaskView");
                        throw null;
                    }
                }
                o.LJIJI("leftMaskView");
                throw null;
            }
            o.LJIJI("bottomMaskView");
            throw null;
        }
        o.LJIJI("topMaskView");
        throw null;
    }

    public final void Hl(int i) {
        int width;
        int height;
        boolean z;
        String path;
        C67S LJI;
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            int measuredHeight = frameLayout.getMeasuredHeight();
            int LJ = C81184Vtc.LJ(requireContext());
            if (((LinkedHashMap) this.LJLLJ).get(Integer.valueOf(this.LLD)) != null) {
                Object obj = ((LinkedHashMap) this.LJLLJ).get(Integer.valueOf(i));
                o.LJI(obj);
                width = ((ImageSynthesisResult) obj).getWidth();
                Object obj2 = ((LinkedHashMap) this.LJLLJ).get(Integer.valueOf(i));
                o.LJI(obj2);
                height = ((ImageSynthesisResult) obj2).getHeight();
            } else {
                VideoPublishEditModel videoPublishEditModel = this.LLFII;
                if (videoPublishEditModel != null) {
                    SrcImageInfo srcImageInfo = ((SingleImageData) ListProtector.get(videoPublishEditModel.getImageAlbumData().getImageList(), i)).getSrcImageInfo();
                    width = srcImageInfo.getWidth();
                    height = srcImageInfo.getHeight();
                } else {
                    o.LJIJI("model");
                    throw null;
                }
            }
            if (width < height) {
                z = true;
            } else {
                z = false;
            }
            this.LLFF = z;
            float f = LJ;
            float f2 = measuredHeight;
            float f3 = width;
            float f4 = height;
            if (f / f2 > f3 / f4) {
                this.LJLZ = f2;
                this.LJLLLLLL = (f3 * f2) / f4;
            } else {
                this.LJLLLLLL = f;
                this.LJLZ = (f4 * f) / f3;
            }
            FrameLayout frameLayout2 = this.LJLJLLL;
            if (frameLayout2 != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = (int) this.LJLLLLLL;
                layoutParams2.height = (int) this.LJLZ;
                FrameLayout frameLayout3 = this.LJLJLLL;
                if (frameLayout3 != null) {
                    frameLayout3.setLayoutParams(layoutParams2);
                    FrameLayout frameLayout4 = this.LJLJLLL;
                    if (frameLayout4 != null) {
                        frameLayout4.setTag(new C1552667m(1.0f, (int) this.LJLLLLLL, this.LLFF));
                        FrameLayout frameLayout5 = this.LJLJLLL;
                        if (frameLayout5 != null) {
                            frameLayout5.postDelayed(new ARunnableS21S0200000_2(layoutParams2, this, 1), 100L);
                            int LJ2 = C81184Vtc.LJ(requireContext());
                            FrameLayout frameLayout6 = this.LJLJJI;
                            if (frameLayout6 != null) {
                                int measuredHeight2 = frameLayout6.getMeasuredHeight();
                                float f5 = this.LJLLLLLL;
                                float f6 = this.LJLZ;
                                if (f5 / f6 < 0.75f) {
                                    int i2 = (int) f5;
                                    int i3 = (((int) f6) - ((i2 * 4) / 3)) / 2;
                                    View view = this.LJZ;
                                    if (view != null) {
                                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                        layoutParams3.width = i2;
                                        layoutParams3.height = i3;
                                        View view2 = this.LJZ;
                                        if (view2 != null) {
                                            view2.setLayoutParams(layoutParams3);
                                            View view3 = this.LJZ;
                                            if (view3 != null) {
                                                float f7 = (LJ2 - i2) / 2.0f;
                                                view3.setTranslationX(f7);
                                                View view4 = this.LJZI;
                                                if (view4 != null) {
                                                    ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                                                    layoutParams4.width = i2;
                                                    layoutParams4.height = i3;
                                                    View view5 = this.LJZI;
                                                    if (view5 != null) {
                                                        view5.setLayoutParams(layoutParams4);
                                                        View view6 = this.LJZI;
                                                        if (view6 != null) {
                                                            view6.setTranslationX(f7);
                                                        } else {
                                                            o.LJIJI("bottomMaskView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("bottomMaskView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("bottomMaskView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("topMaskView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("topMaskView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("topMaskView");
                                        throw null;
                                    }
                                } else {
                                    int i4 = (int) f6;
                                    int i5 = (((int) f5) - ((i4 * 3) / 4)) / 2;
                                    View view7 = this.LJZL;
                                    if (view7 != null) {
                                        ViewGroup.LayoutParams layoutParams5 = view7.getLayoutParams();
                                        layoutParams5.width = i5;
                                        layoutParams5.height = i4;
                                        View view8 = this.LJZL;
                                        if (view8 != null) {
                                            view8.setLayoutParams(layoutParams5);
                                            View view9 = this.LJZL;
                                            if (view9 != null) {
                                                float f8 = (measuredHeight2 - i4) / 2.0f;
                                                view9.setTranslationY(f8);
                                                View view10 = this.LL;
                                                if (view10 != null) {
                                                    ViewGroup.LayoutParams layoutParams6 = view10.getLayoutParams();
                                                    layoutParams6.width = i5;
                                                    layoutParams6.height = i4;
                                                    View view11 = this.LL;
                                                    if (view11 != null) {
                                                        view11.setLayoutParams(layoutParams6);
                                                        View view12 = this.LL;
                                                        if (view12 != null) {
                                                            view12.setTranslationY(f8);
                                                        } else {
                                                            o.LJIJI("rightMaskView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("rightMaskView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("rightMaskView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("leftMaskView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("leftMaskView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("leftMaskView");
                                        throw null;
                                    }
                                }
                                VideoPublishEditModel videoPublishEditModel2 = this.LLFII;
                                if (videoPublishEditModel2 != null) {
                                    if (videoPublishEditModel2.getCoverPublishModel().getEffectTextModel().getHasCoverText() && this.LJLLL) {
                                        this.LJLLL = false;
                                        Gl();
                                    }
                                    C67R vl = vl();
                                    C157766Hc LJ3 = C60903NvH.LJIIJJI().LJFF().LJ();
                                    if (LJ3 != null && (LJI = LJ3.LJI()) != null) {
                                        LJI.LLJJIII = 0;
                                        C1552667m c1552667m = new C1552667m(1.0f, C81184Vtc.LJ(requireActivity()), this.LLFF);
                                        if (!o.LJ(LJI.LLJJ, c1552667m)) {
                                            LJI.LLJJ = c1552667m;
                                            LJI.LLILZIL.setScaleInfo(c1552667m);
                                        }
                                        C1555068k c1555068k = this.LJLLILLLL;
                                        if (c1555068k != null) {
                                            Point editInputCenterPoint = c1555068k.getEditInputCenterPoint();
                                            if (vl != null) {
                                                float f9 = this.LLI * this.LJLLLLLL;
                                                float f10 = this.LLIFFJFJJ * this.LJLZ;
                                                vl.setCenterX(f9);
                                                vl.setCenterY(f10);
                                                vl.setVisibility(0);
                                                vl.post(new ARunnableS21S0200000_2(editInputCenterPoint, vl, 2));
                                            }
                                        } else {
                                            o.LJIJI("mEffectTextStickerInputLayout");
                                            throw null;
                                        }
                                    }
                                    if (((LinkedHashMap) this.LJLLJ).get(Integer.valueOf(i)) != null) {
                                        Object obj3 = ((LinkedHashMap) this.LJLLJ).get(Integer.valueOf(i));
                                        o.LJI(obj3);
                                        path = ((ImageSynthesisResult) obj3).getPath();
                                    } else {
                                        VideoPublishEditModel videoPublishEditModel3 = this.LLFII;
                                        if (videoPublishEditModel3 != null) {
                                            path = ((SingleImageData) ListProtector.get(videoPublishEditModel3.getImageAlbumData().getImageList(), i)).getSrcImageInfo().getPath();
                                        } else {
                                            o.LJIJI("model");
                                            throw null;
                                        }
                                    }
                                    W5G w5g = this.LJLJJL;
                                    if (w5g != null) {
                                        C78764Uvg.LJIIIZ(w5g, Uri.fromFile(new File(path)).toString(), -1, -1);
                                        return;
                                    } else {
                                        o.LJIJI("mPreviewImageView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("model");
                                throw null;
                            }
                            o.LJIJI("mImagePreviewContainer");
                            throw null;
                        }
                        o.LJIJI("mEffectTextPreviewContainer");
                        throw null;
                    }
                    o.LJIJI("mEffectTextPreviewContainer");
                    throw null;
                }
                o.LJIJI("mEffectTextPreviewContainer");
                throw null;
            }
            o.LJIJI("mEffectTextPreviewContainer");
            throw null;
        }
        o.LJIJI("mImagePreviewContainer");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        C6VR c6vr = (C6VR) context;
        this.LLFFF = c6vr;
        this.LLFII = c6vr.LIZLLL();
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("is_low_memory_machine_for_tools", false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C61713OJx LIZJ = C61712OJw.LIZJ(requireActivity);
        LIZJ.LJI(R.color.ak);
        LIZJ.LIZIZ.LJIIJ(true);
        LIZJ.LIZJ();
    }

    public final void xl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String path;
        if (((LinkedHashMap) this.LJLLJ).get(Integer.valueOf(this.LLD)) != null) {
            Object obj = ((LinkedHashMap) this.LJLLJ).get(Integer.valueOf(this.LLD));
            o.LJI(obj);
            path = ((ImageSynthesisResult) obj).getPath();
        } else {
            VideoPublishEditModel videoPublishEditModel = this.LLFII;
            if (videoPublishEditModel != null) {
                path = ((SingleImageData) ListProtector.get(videoPublishEditModel.getImageAlbumData().getImageList(), this.LLD)).getSrcImageInfo().getPath();
            } else {
                o.LJIJI("model");
                throw null;
            }
        }
        Bitmap bitmap = BitmapFactory.decodeFile(path);
        VideoPublishEditModel videoPublishEditModel2 = this.LLFII;
        if (videoPublishEditModel2 != null) {
            videoPublishEditModel2.setVideoCoverPath("");
            VideoPublishEditModel videoPublishEditModel3 = this.LLFII;
            if (videoPublishEditModel3 != null) {
                videoPublishEditModel3.generateVideoCoverPath();
                VideoPublishEditModel videoPublishEditModel4 = this.LLFII;
                if (videoPublishEditModel4 != null) {
                    EffectTextModel effectTextModel = videoPublishEditModel4.getCoverPublishModel().getEffectTextModel();
                    o.LJIIIIZZ(bitmap, "bitmap");
                    Bitmap mergeCoverText = effectTextModel.mergeCoverText(bitmap);
                    VideoPublishEditModel videoPublishEditModel5 = this.LLFII;
                    if (videoPublishEditModel5 != null) {
                        C43679HCh.LIZIZ(mergeCoverText, new ARunnableS21S0200000_2(mergeCoverText, bitmap, 18), videoPublishEditModel5.getVideoCoverPath());
                        interfaceC65784Pro.invoke();
                        return;
                    }
                    o.LJIJI("model");
                    throw null;
                }
                o.LJIJI("model");
                throw null;
            }
            o.LJIJI("model");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final View wl(ImageChooseCoverFragment imageChooseCoverFragment, int i) {
        View view = new View(imageChooseCoverFragment.requireContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
        view.setVisibility(4);
        view.setBackgroundColor(imageChooseCoverFragment.requireContext().getResources().getColor(R.color.ca));
        FrameLayout frameLayout = imageChooseCoverFragment.LJLJJI;
        if (frameLayout != null) {
            frameLayout.addView(view);
            return view;
        }
        o.LJIJI("mImagePreviewContainer");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0241, code lost:
    
        r0 = r10.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0245, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0247, code lost:
    
        r2 = r0.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x024b, code lost:
    
        if (r4 >= r2) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x024d, code lost:
    
        r0 = r10.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x024f, code lost:
    
        if (r0 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0257, code lost:
    
        if ((r0.getChildAt(r4) instanceof X.C6B2) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0259, code lost:
    
        r0 = r10.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x025b, code lost:
    
        if (r0 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x025d, code lost:
    
        r1 = r0.getChildAt(r4);
        kotlin.jvm.internal.o.LJII(r1, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.view.DMTBorderLineView");
        r10.LJLL = (X.C6B2) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x026a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0270, code lost:
    
        kotlin.jvm.internal.o.LJIJI("gestureLayout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0273, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0274, code lost:
    
        kotlin.jvm.internal.o.LJIJI("gestureLayout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0277, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0278, code lost:
    
        r0 = r10.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027a, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x027c, code lost:
    
        r2 = r0.getOnGestureListener();
        r1 = r10.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0282, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0284, code lost:
    
        r1.setOnGestureListener(new X.C6V5(r2, r10));
        r0 = X.C60903NvH.LJIIJJI().LJFF().LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0298, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x029a, code lost:
    
        r1 = r0.LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x029e, code lost:
    
        if (r1 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02a0, code lost:
    
        r1.LLJJIII = 4;
        r1.LLFF = new X.C6VQ(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02aa, code lost:
    
        r1 = o3.h0.LJIIZILJ(com.zhiliaoapp.musically.R.id.ddr, r11);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "requireViewById(view, R.…ext_sticker_input_layout)");
        r10.LJLLILLLL = (X.C1555068k) r1;
        r0 = r10.LLFII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02bc, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02be, code lost:
    
        r10.LLD = r0.getCoverPublishModel().getImageCurrentIndex();
        r2 = r10.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02ca, code lost:
    
        if (r2 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02cc, code lost:
    
        r2.post(new Y.ARunnableS38S0100000_2(r10, 82));
        r2 = r10.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d8, code lost:
    
        if (r2 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02da, code lost:
    
        X.C84363X9b.LIZ(r2, new kotlin.jvm.internal.AqS152S0100000_2(r10, 36));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02e5, code lost:
    
        kotlin.jvm.internal.o.LJIJI("viewRoot");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e9, code lost:
    
        kotlin.jvm.internal.o.LJIJI("mImagePreviewContainer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ee, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02ef, code lost:
    
        kotlin.jvm.internal.o.LJIJI("model");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02f3, code lost:
    
        kotlin.jvm.internal.o.LJIJI("gestureLayout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02f6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02f7, code lost:
    
        kotlin.jvm.internal.o.LJIJI("gestureLayout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02fa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02fb, code lost:
    
        kotlin.jvm.internal.o.LJIJI("gestureLayout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02fe, code lost:
    
        throw null;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.j1, viewGroup, false, "inflater.inflate(layoutRes, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
    }
}

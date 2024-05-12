package X;

import Y.IDCListenerS139S0100000_42;
import Y.IDCListenerS86S0200000_42;
import Y.IDRunnableS33S0200000_42;
import Y.IDUListenerS265S0100000_42;
import Y.IDrS54S0100000_42;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.ies.effectcreator.swig.EEIntegerList;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.IDqS21S0101000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.anj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94855anj extends AbstractC94715alT<AbstractC94471ahX<InterfaceC94376ag0>, C94389agD> implements InterfaceC94008aa4 {
    public final C93919aYd LJLJJLL;
    public final HandlerC93864aXk LJLJL;
    public InterfaceC93865aXl LJLJLJ;
    public final EnumC93711aVH[] LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public Boolean LJLLILLLL;
    public C93651aUJ<C94291aed> LJLLJ;
    public AbstractC94471ahX LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94855anj(List<? extends AbstractC94471ahX<InterfaceC94376ag0>> listData) {
        super(listData);
        o.LJIIIZ(listData, "listData");
        this.LJLJJLL = new C93919aYd(0.0f, 1.0f);
        this.LJLJL = new HandlerC93864aXk(this);
        this.LJLJLLL = new EnumC93711aVH[]{EnumC93711aVH.FeatureType_Filter, EnumC93711aVH.FeatureType_Makeup, EnumC93711aVH.FeatureType_FaceDistortion};
        this.LJLL = ViewConfiguration.getTouchSlop();
        ((SparseIntArray) this.LJLJJL.getValue()).put(0, R.layout.dw9);
        ((SparseIntArray) this.LJLJJL.getValue()).put(1, R.layout.dwa);
        C94007aa3 c94007aa3 = this.LJLILLLLZI;
        if (c94007aa3 != null) {
            ((C94288aea) c94007aa3).LJII = new C93867aXn(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.layer.LayerDraggableModule<com.ugc.effectcreator.foundation.expandablerecycleviewadapter.IExpandableMultiItem>");
    }

    @Override // X.AbstractC94375afz
    public final C94007aa3 LJLLLLLL(AbstractC94514aiE abstractC94514aiE) {
        return new C94288aea(this);
    }

    public final void LLIIIJ(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int LIZJ = C93742aVm.LIZJ(180.0f);
        int LIZJ2 = C93742aVm.LIZJ(100.0f);
        if (z) {
            RecyclerView recyclerView = LJZL().get();
            if (recyclerView != null && (layoutParams2 = recyclerView.getLayoutParams()) != null && layoutParams2.width == LIZJ) {
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(LIZJ2, LIZJ);
            o.LJIIIIZZ(ofInt, "ValueAnimator.ofInt(littleWidth, largeWidth)");
            ofInt.setInterpolator(C94010aa6.LIZ());
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new IDUListenerS265S0100000_42(this, 8));
            ofInt.start();
            RecyclerView recyclerView2 = LJZL().get();
            if (recyclerView2 != null) {
                recyclerView2.setBackgroundResource(R.drawable.dhu);
                return;
            }
            return;
        }
        RecyclerView recyclerView3 = LJZL().get();
        if (recyclerView3 != null && (layoutParams = recyclerView3.getLayoutParams()) != null && layoutParams.width == LIZJ2) {
            return;
        }
        ValueAnimator ofInt2 = ValueAnimator.ofInt(LIZJ, LIZJ2);
        o.LJIIIIZZ(ofInt2, "ValueAnimator.ofInt(largeWidth, littleWidth)");
        ofInt2.setInterpolator(C94010aa6.LIZ());
        ofInt2.setDuration(250L);
        ofInt2.addUpdateListener(new IDUListenerS265S0100000_42(this, 9));
        ofInt2.addListener(new C94294aeg(this));
        ofInt2.start();
    }

    @Override // X.AbstractC94375afz, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(context)");
        this.LJLL = viewConfiguration.getScaledTouchSlop();
        RecyclerView recyclerView2 = LJZL().get();
        if (recyclerView2 != null) {
            recyclerView2.LJIIJJI(new IDrS54S0100000_42(this, 2));
        }
    }

    public final void onEventLayerAction(String actionType) {
        o.LJIIIZ(actionType, "actionType");
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("layer_action", C51029K0z.LJJIIZI(new OSZ("action_type", actionType)));
        }
    }

    @Override // X.AbstractC94375afz
    public final void LJLZ(C94389agD helper, Object obj) {
        boolean z;
        float LIZJ;
        ICameraRender iCameraRender;
        LiveData<C94342afS> modelPathChangeData;
        C94342afS value;
        int i;
        C93970aZS LIZ;
        ICameraRender iCameraRender2;
        LiveData<C94342afS> modelPathChangeData2;
        C94342afS value2;
        boolean z2;
        int i2;
        int i3;
        AbstractC94471ahX item = (AbstractC94471ahX) obj;
        o.LJIIIZ(helper, "helper");
        o.LJIIIZ(item, "item");
        int itemViewType = helper.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                if (item.LJIIJJI()) {
                    View view = helper.itemView;
                    o.LJIIIIZZ(view, "helper.itemView");
                    view.setVisibility(4);
                } else {
                    View view2 = helper.itemView;
                    o.LJIIIIZZ(view2, "helper.itemView");
                    view2.setVisibility(0);
                }
                if (!item.LJIIIZ() && o.LJ(C93939aYx.LIZ().getRenderModeData().getValue(), C94339afP.LIZ)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                helper.N(R.id.fco, z2);
                C16880lQ.LJIILLIIL((ImageView) helper.L(R.id.fco), new IDCListenerS139S0100000_42(this, 16));
                ((TextView) helper.L(R.id.nq6)).setText(item.LJFF().LJLILLLLZI);
                ((TextView) helper.L(R.id.nq7)).setText(item.LJFF().LJLJI);
                View findViewById = helper.itemView.findViewById(R.id.nqc);
                if (item.LJIIJ()) {
                    findViewById.setBackgroundResource(R.drawable.dhv);
                } else {
                    findViewById.setBackground(null);
                }
                ImageView imageView = (ImageView) helper.itemView.findViewById(R.id.nns);
                if (item.LJFF().LJLJJLL) {
                    o.LJIIIIZZ(imageView, "this");
                    imageView.setAlpha(1.0f);
                } else {
                    o.LJIIIIZZ(imageView, "this");
                    imageView.setAlpha(0.4f);
                }
                if (TextUtils.isEmpty(item.LJFF().LJLJJL)) {
                    imageView.setImageResource(R.drawable.dhy);
                } else if (ujb.o.LJJJLIIL(item.LJFF().LJLJJL, "http", false)) {
                    ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
                    Context context = imageView.getContext();
                    o.LJIIIIZZ(context, "context");
                    String str = item.LJFF().LJLJJL;
                    C94019aaF c94019aaF = new C94019aaF();
                    c94019aaF.LJII = 0;
                    c94019aaF.LJFF = C93742aVm.LIZIZ(4);
                    c94019aaF.LIZIZ(ImageView.ScaleType.CENTER_CROP);
                    c94019aaF.LIZ(R.drawable.dfx);
                    imageLoaderService.compatLoadBitmap(context, str, imageView, new C94020aaG(c94019aaF), null);
                } else {
                    ImageLoaderService imageLoaderService2 = ImageLoaderService.INSTANCE;
                    Context context2 = imageView.getContext();
                    o.LJIIIIZZ(context2, "context");
                    String str2 = item.LJFF().LJLJJL;
                    C94019aaF c94019aaF2 = new C94019aaF();
                    c94019aaF2.LJII = 0;
                    c94019aaF2.LJFF = C93742aVm.LIZIZ(4);
                    c94019aaF2.LIZIZ(ImageView.ScaleType.CENTER_CROP);
                    c94019aaF2.LIZ(R.drawable.dfx);
                    imageLoaderService2.compatLoadBitmap(context2, str2, imageView, new C94020aaG(c94019aaF2), null);
                }
                if (item.LJFF().LJLJJLL) {
                    helper.M(R.id.nq6, R.color.adn);
                    helper.M(R.id.nq7, R.color.adp);
                } else {
                    helper.M(R.id.nq6, R.color.adr);
                    helper.M(R.id.nq7, R.color.adr);
                }
                View findViewById2 = helper.itemView.findViewById(R.id.non);
                if (item.LJIIIIZZ()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                findViewById2.setVisibility(i2);
                View findViewById3 = helper.itemView.findViewById(R.id.nb5);
                if (item.LJIIIIZZ()) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                findViewById3.setVisibility(i3);
                if (helper.getAdapterPosition() + 1 < this.LJLIL.size() && ((AbstractC94471ahX) ListProtector.get(this.LJLIL, helper.getAdapterPosition() + 1)).LJ() == 1 && !((AbstractC94471ahX) ListProtector.get(this.LJLIL, helper.getAdapterPosition() + 1)).LJIIJJI()) {
                    helper.itemView.findViewById(R.id.nnf).setBackgroundResource(R.drawable.div);
                } else {
                    helper.itemView.findViewById(R.id.nnf).setBackgroundResource(R.drawable.diu);
                }
                helper.itemView.setOnTouchListener(new ViewOnTouchListenerC93859aXf(this, helper, item));
                C16880lQ.LJIIJ(new IDCListenerS86S0200000_42(this, item, 2), helper.itemView);
            }
        } else {
            EditText editText = (EditText) helper.L(R.id.npq);
            EnumC93711aVH enumC93711aVH = item.LJFF().LJLJJI;
            EnumC93711aVH enumC93711aVH2 = EnumC93711aVH.FeatureType_Body;
            if (enumC93711aVH == enumC93711aVH2) {
                editText.setText(R.string.fx2);
                helper.L(R.id.npr).setVisibility(8);
                ImageView imageView2 = (ImageView) helper.itemView.findViewById(R.id.nnl);
                imageView2.setImageResource(R.drawable.di0);
                imageView2.setVisibility(0);
            } else {
                editText.setText(item.LJFF().LJLILLLLZI);
                helper.N(R.id.npr, true);
                ((TextView) helper.L(R.id.npr)).setText(item.LJFF().LJLJI);
                ImageView imageView3 = (ImageView) helper.itemView.findViewById(R.id.nnl);
                if (item.LJFF().LJLJL) {
                    imageView3.setImageResource(R.drawable.di6);
                    imageView3.setVisibility(0);
                } else {
                    imageView3.setImageResource(R.drawable.dia);
                    imageView3.setVisibility(8);
                }
            }
            if (item.LJFF().LJLJJLL) {
                helper.M(R.id.npq, R.color.adn);
                helper.M(R.id.npr, R.color.adp);
            } else {
                helper.M(R.id.npq, R.color.adr);
                helper.M(R.id.npr, R.color.adr);
            }
            if (!item.LJIIIZ() && o.LJ(C93939aYx.LIZ().getRenderModeData().getValue(), C94339afP.LIZ)) {
                z = true;
            } else {
                z = false;
            }
            helper.N(R.id.fco, z);
            C16880lQ.LJIILLIIL((ImageView) helper.L(R.id.fco), new IDCListenerS139S0100000_42(this, 17));
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
            editText.setActivated(false);
            editText.setSingleLine(true);
            editText.setKeyListener(null);
            editText.setEllipsize(TextUtils.TruncateAt.END);
            View findViewById4 = helper.itemView.findViewById(R.id.nop);
            if (item.LJFF().LJLJJLL) {
                o.LJIIIIZZ(findViewById4, "this");
                findViewById4.setAlpha(1.0f);
            } else {
                o.LJIIIIZZ(findViewById4, "this");
                findViewById4.setAlpha(0.4f);
            }
            if (item.LJFF().LJLJJI == enumC93711aVH2) {
                findViewById4.setPadding((int) KL2.LIZJ(findViewById4.getContext(), 4.0f), (int) KL2.LIZJ(findViewById4.getContext(), 4.0f), (int) KL2.LIZJ(findViewById4.getContext(), 4.0f), 0);
                findViewById4.setBackground(null);
            } else {
                if (item.LJIIJ()) {
                    findViewById4.setBackgroundResource(R.drawable.dhv);
                } else {
                    findViewById4.setBackground(null);
                }
                findViewById4.setPadding((int) KL2.LIZJ(findViewById4.getContext(), 4.0f), (int) KL2.LIZJ(findViewById4.getContext(), 4.0f), (int) KL2.LIZJ(findViewById4.getContext(), 4.0f), (int) KL2.LIZJ(findViewById4.getContext(), 4.0f));
            }
            ImageView imageView4 = (ImageView) helper.itemView.findViewById(R.id.nnh);
            if (TextUtils.isEmpty(item.LJFF().LJLJJL)) {
                imageView4.setLayoutParams(new RelativeLayout.LayoutParams((int) KL2.LIZJ(imageView4.getContext(), 44.0f), (int) KL2.LIZJ(imageView4.getContext(), 64.0f)));
                if (item.LJFF().LJLJJI == enumC93711aVH2 && (LIZ = C93971aZT.LIZ()) != null && (iCameraRender2 = (ICameraRender) LIZ.LIZ(ICameraRender.class)) != null && (modelPathChangeData2 = iCameraRender2.getModelPathChangeData()) != null && (value2 = modelPathChangeData2.getValue()) != null) {
                    imageView4.setPadding(0, 0, 0, 0);
                    ImageLoaderService imageLoaderService3 = ImageLoaderService.INSTANCE;
                    Context context3 = imageView4.getContext();
                    o.LJIIIIZZ(context3, "context");
                    File file = new File(value2.LJLIL);
                    C94019aaF c94019aaF3 = new C94019aaF();
                    c94019aaF3.LJII = 0;
                    c94019aaF3.LIZIZ(ImageView.ScaleType.CENTER_CROP);
                    c94019aaF3.LJFF = (int) KL2.LIZJ(imageView4.getContext(), 4.0f);
                    c94019aaF3.LIZ(R.drawable.dfx);
                    imageLoaderService3.loadFile(context3, file, imageView4, new C94020aaG(c94019aaF3));
                }
            } else if (item.LJFF().LJLJJI == enumC93711aVH2) {
                imageView4.setLayoutParams(new RelativeLayout.LayoutParams((int) KL2.LIZJ(imageView4.getContext(), 44.0f), (int) KL2.LIZJ(imageView4.getContext(), 64.0f)));
                imageView4.setPadding(0, 0, 0, 0);
                C93970aZS LIZ2 = C93971aZT.LIZ();
                if (LIZ2 != null && (iCameraRender = (ICameraRender) LIZ2.LIZ(ICameraRender.class)) != null && (modelPathChangeData = iCameraRender.getModelPathChangeData()) != null && (value = modelPathChangeData.getValue()) != null) {
                    ImageLoaderService imageLoaderService4 = ImageLoaderService.INSTANCE;
                    Context context4 = imageView4.getContext();
                    o.LJIIIIZZ(context4, "context");
                    File file2 = new File(value.LJLIL);
                    C94019aaF c94019aaF4 = new C94019aaF();
                    c94019aaF4.LIZIZ(ImageView.ScaleType.CENTER_INSIDE);
                    c94019aaF4.LJII = 0;
                    c94019aaF4.LJFF = (int) KL2.LIZJ(imageView4.getContext(), 4.0f);
                    c94019aaF4.LIZ(R.drawable.dfx);
                    imageLoaderService4.loadFile(context4, file2, imageView4, new C94020aaG(c94019aaF4));
                }
            } else {
                if (C93857aXd.LIZ[item.LJFF().LJLJJI.ordinal()] != 1) {
                    LIZJ = KL2.LIZJ(getContext(), 64.0f);
                } else {
                    LIZJ = KL2.LIZJ(getContext(), 44.0f);
                }
                imageView4.setLayoutParams(new RelativeLayout.LayoutParams((int) KL2.LIZJ(imageView4.getContext(), 44.0f), (int) LIZJ));
                imageView4.setPadding(0, 0, 0, 0);
                ImageLoaderService imageLoaderService5 = ImageLoaderService.INSTANCE;
                Context context5 = imageView4.getContext();
                o.LJIIIIZZ(context5, "context");
                String str3 = item.LJFF().LJLJJL;
                C94019aaF c94019aaF5 = new C94019aaF();
                c94019aaF5.LJII = 0;
                c94019aaF5.LIZIZ(ImageView.ScaleType.CENTER_INSIDE);
                c94019aaF5.LIZ(R.drawable.dfx);
                imageLoaderService5.compatLoadBitmap(context5, str3, imageView4, new C94020aaG(c94019aaF5), null);
            }
            View findViewById5 = helper.itemView.findViewById(R.id.non);
            if (item.LJIIIIZZ()) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById5.setVisibility(i);
            helper.itemView.setOnTouchListener(new ViewOnTouchListenerC93862aXi(this, helper));
            C16880lQ.LJIIJ(new IDCListenerS86S0200000_42(this, item, 3), helper.itemView);
        }
        AbstractC94471ahX abstractC94471ahX = this.LJLLL;
        if (abstractC94471ahX != null && o.LJ(item, abstractC94471ahX)) {
            LLIIIILZ(this, false, null, null, false, 24);
            LLFZ(true, helper);
            helper.itemView.postDelayed(new IDRunnableS33S0200000_42(this, helper, 4), 10L);
            this.LJLLL = null;
        }
    }

    @Override // X.AbstractC94715alT
    public final boolean LLF(int i, int i2) {
        Feature LJFF;
        int i3;
        FeatureManager featureManager;
        EEIntegerList askForAvailablePositionsToMoveFeatures;
        Integer num;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        Boolean bool = null;
        if (LJI != null && (LJFF = LJI.LJFF(((AbstractC94471ahX) ListProtector.get(this.LJLIL, i)).LJFF().LJLIL)) != null) {
            C93829aXB LJI2 = CKEffectEditorContext.LJI();
            if (LJI2 != null) {
                if (i < i2) {
                    i3 = i2 + 1;
                } else {
                    i3 = i2;
                }
                Model workingModel = LJI2.LIZJ.getWorkingModel();
                boolean z = true;
                if (workingModel == null || (featureManager = workingModel.featureManager()) == null || (askForAvailablePositionsToMoveFeatures = featureManager.askForAvailablePositionsToMoveFeatures(new EEStdFeatureList(new Feature[]{LJFF}), i3)) == null || askForAvailablePositionsToMoveFeatures.isEmpty() || (num = askForAvailablePositionsToMoveFeatures.get(0)) == null || num.intValue() != i3) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            Boolean bool2 = Boolean.FALSE;
            if (o.LJ(bool, bool2)) {
                this.LJLLILLLL = bool2;
                return false;
            }
        }
        this.LJLLILLLL = Boolean.TRUE;
        return o.LJ(((AbstractC94471ahX) ListProtector.get(this.LJLIL, i)).LIZ(), ((AbstractC94471ahX) ListProtector.get(this.LJLIL, i2)).LIZ());
    }

    public final void LLFII(boolean z, C94669akj c94669akj) {
        int i;
        List<InterfaceC93998aZu> list;
        List<InterfaceC93998aZu> LIZIZ;
        int i2 = 0;
        if (c94669akj != null && (LIZIZ = c94669akj.LIZIZ()) != null) {
            i = LIZIZ.size();
        } else {
            i = 0;
        }
        if (!z || i < 0) {
            for (AbstractC94471ahX abstractC94471ahX : ORZ.LLIILII(this.LJLIL)) {
                if ((abstractC94471ahX instanceof C94670akk) && abstractC94471ahX.LJIIJJI() && o.LJ(abstractC94471ahX.LJI(), "---")) {
                    this.LJLIL.remove(abstractC94471ahX);
                }
            }
            return;
        }
        while (true) {
            if (c94669akj != null) {
                list = c94669akj.LIZIZ();
            } else {
                list = null;
            }
            o.LJI(list);
            for (InterfaceC93998aZu interfaceC93998aZu : list) {
                if (interfaceC93998aZu != null) {
                    C94670akk c94670akk = (C94670akk) interfaceC93998aZu;
                    C94220adU layerFeature = c94670akk.LIZJ;
                    String pId = c94670akk.LIZLLL;
                    int i3 = c94670akk.LJ;
                    boolean z2 = c94670akk.LJFF;
                    boolean z3 = c94670akk.LJI;
                    boolean z4 = c94670akk.LJII;
                    boolean z5 = c94670akk.LJIIIIZZ;
                    o.LJIIIZ(layerFeature, "layerFeature");
                    o.LJIIIZ(pId, "pId");
                    C94670akk c94670akk2 = new C94670akk(layerFeature, pId, i3, z2, z3, z4, z5);
                    c94670akk2.LJII = true;
                    c94670akk2.LIZLLL = "---";
                    this.LJLIL.add(c94670akk2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.layer.LayerItemSubData");
                }
            }
            if (i2 != i) {
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r2.LJIIIIZZ() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(boolean r7, X.C94389agD r8) {
        /*
            r6 = this;
            java.util.List<T> r0 = r6.LJLIL
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            X.ahX r0 = (X.AbstractC94471ahX) r0
            r0.LJIILIIL(r7)
            goto L6
        L16:
            kotlin.jvm.internal.IDqS179S0200000_42 r1 = new kotlin.jvm.internal.IDqS179S0200000_42
            r0 = 11
            r1.<init>(r6, r8, r0)
            X.C93744aVo.LIZ(r1)
            if (r8 == 0) goto L57
            android.view.View r1 = r8.itemView
            r0 = 1711669374(0x6606007e, float:1.5820155E23)
            android.view.View r5 = r1.findViewById(r0)
            java.util.List<T> r1 = r6.LJLIL
            int r0 = r8.getAdapterPosition()
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            X.ahX r2 = (X.AbstractC94471ahX) r2
            int r0 = r5.getVisibility()
            r4 = 8
            if (r0 != r4) goto L46
            X.aYd r1 = r6.LJLJJLL
            X.akl r0 = X.C94671akl.LJLIL
            r1.LIZ(r5, r0)
        L46:
            int r0 = r2.LJ()
            r3 = 0
            if (r0 != 0) goto L58
            boolean r0 = r2.LJIIIIZZ()
            if (r0 == 0) goto L54
        L53:
            r4 = 0
        L54:
            r5.setVisibility(r4)
        L57:
            return
        L58:
            boolean r0 = r2.LJIIIIZZ()
            java.lang.String r2 = "helper.itemView.findView…<View>(R.id.view_padding)"
            r1 = 2131380669(0x7f0a49bd, float:1.8381633E38)
            if (r0 == 0) goto L70
            android.view.View r0 = r8.itemView
            android.view.View r0 = r0.findViewById(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            r0.setVisibility(r3)
            goto L53
        L70:
            android.view.View r0 = r8.itemView
            android.view.View r0 = r0.findViewById(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            r0.setVisibility(r4)
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94855anj.LLFZ(boolean, X.agD):void");
    }

    public final void LLIFFJFJJ(int i, boolean z) {
        AbstractC94471ahX abstractC94471ahX = (AbstractC94471ahX) ORZ.LJLLLLLL(i, this.LJLIL);
        if (abstractC94471ahX != null && abstractC94471ahX.LJIIIIZZ() != z) {
            abstractC94471ahX.LJIILIIL(z);
            C93744aVo.LIZ(new IDqS21S0101000_42(this, i, 1));
        }
    }

    public final boolean LLII(C94389agD c94389agD, AbstractC94471ahX<InterfaceC94376ag0> item) {
        o.LJIIIZ(item, "item");
        List<C94291aed> LJII = item.LJII();
        int[] iArr = new int[2];
        c94389agD.itemView.getLocationOnScreen(iArr);
        int i = iArr[1];
        View view = c94389agD.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        if (i + view.getHeight() + ((int) KL2.LIZJ(getContext(), LJII.size() * 44.0f)) > KL2.LJIIIZ(getContext())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC94375afz
    public final void LJZ(C94389agD helper, Object obj, List payloads) {
        int i;
        AbstractC94471ahX item = (AbstractC94471ahX) obj;
        o.LJIIIZ(helper, "helper");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        super.LJZ(helper, item, payloads);
        boolean z = true;
        if (payloads.contains("selectPayload")) {
            int itemViewType = helper.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    View findViewById = helper.itemView.findViewById(R.id.nqc);
                    if (item.LJIIJ()) {
                        findViewById.setBackgroundResource(R.drawable.dhv);
                    } else {
                        findViewById.setBackground(null);
                    }
                }
            } else {
                View findViewById2 = helper.itemView.findViewById(R.id.nop);
                if (item.LJFF().LJLJJI != EnumC93711aVH.FeatureType_Body) {
                    if (item.LJIIJ()) {
                        findViewById2.setBackgroundResource(R.drawable.dhv);
                    } else {
                        findViewById2.setBackground(null);
                    }
                }
            }
        }
        if (payloads.contains("tipsPayload")) {
            int itemViewType2 = helper.getItemViewType();
            int i2 = 8;
            if (itemViewType2 != 0) {
                if (itemViewType2 == 1) {
                    View findViewById3 = helper.itemView.findViewById(R.id.non);
                    if (item.LJIIIIZZ()) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    findViewById3.setVisibility(i);
                    this.LJLJJLL.LIZ(findViewById3, C94668aki.LJLIL);
                    View findViewById4 = helper.itemView.findViewById(R.id.nb5);
                    if (item.LJIIIIZZ()) {
                        i2 = 0;
                    }
                    findViewById4.setVisibility(i2);
                }
            } else {
                View findViewById5 = helper.itemView.findViewById(R.id.non);
                if (item.LJIIIIZZ()) {
                    i2 = 0;
                }
                findViewById5.setVisibility(i2);
                this.LJLJJLL.LIZ(findViewById5, C94667akh.LJLIL);
            }
        }
        if (payloads.contains("compatiblePayload")) {
            if (item.LJIIIZ() || !o.LJ(C93939aYx.LIZ().getRenderModeData().getValue(), C94339afP.LIZ)) {
                z = false;
            }
            helper.N(R.id.fco, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List, T] */
    public final void LLIIII(boolean z, AbstractC94471ahX<InterfaceC94376ag0> abstractC94471ahX, View view, boolean z2, boolean z3) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        if (abstractC94471ahX != null) {
            c68322mC.element = abstractC94471ahX.LJII();
        }
        if (z) {
            C93651aUJ<C94291aed> c93651aUJ = this.LJLLJ;
            if (c93651aUJ != null) {
                c93651aUJ.dismiss();
                this.LJLLJ = null;
            }
            List<? extends C94291aed> list = (List) c68322mC.element;
            if (list != null) {
                C93651aUJ<C94291aed> c93651aUJ2 = new C93651aUJ<>(-2, -2);
                this.LJLLJ = c93651aUJ2;
                c93651aUJ2.setOutsideTouchable(true);
                C93651aUJ<C94291aed> c93651aUJ3 = this.LJLLJ;
                if (c93651aUJ3 != null) {
                    c93651aUJ3.setFocusable(true);
                }
                C93651aUJ<C94291aed> c93651aUJ4 = this.LJLLJ;
                if (c93651aUJ4 != null) {
                    c93651aUJ4.setInputMethodMode(2);
                }
                C93651aUJ<C94291aed> c93651aUJ5 = this.LJLLJ;
                if (c93651aUJ5 != null) {
                    c93651aUJ5.setWidth((int) KL2.LIZJ(getContext(), 200.0f));
                }
                C93651aUJ<C94291aed> c93651aUJ6 = this.LJLLJ;
                if (c93651aUJ6 != null) {
                    c93651aUJ6.LIZ(getContext(), list);
                }
                C93651aUJ<C94291aed> c93651aUJ7 = this.LJLLJ;
                if (c93651aUJ7 != null) {
                    c93651aUJ7.LIZ = new C94293aef(this, abstractC94471ahX, view);
                }
                if (view != null) {
                    view.getLocationOnScreen(new int[2]);
                    if (z2) {
                        C93651aUJ<C94291aed> c93651aUJ8 = this.LJLLJ;
                        if (c93651aUJ8 != null) {
                            Context context = view.getContext();
                            o.LJI((List) c68322mC.element);
                            C16880lQ.LLJLILLLLZIIL(c93651aUJ8, view, 0, ((-((int) KL2.LIZJ(context, r0.size() * 45))) - view.getHeight()) - ((int) KL2.LIZJ(view.getContext(), 6.0f)));
                        }
                    } else {
                        C93651aUJ<C94291aed> c93651aUJ9 = this.LJLLJ;
                        if (c93651aUJ9 != null) {
                            C16880lQ.LLJLILLLLZIIL(c93651aUJ9, view, 0, (int) KL2.LIZJ(view.getContext(), 6.0f));
                        }
                    }
                }
                C93651aUJ<C94291aed> c93651aUJ10 = this.LJLLJ;
                if (c93651aUJ10 != null) {
                    c93651aUJ10.setOnDismissListener(new C93869aXp(this, view));
                    return;
                }
                return;
            }
            return;
        }
        C93651aUJ<C94291aed> c93651aUJ11 = this.LJLLJ;
        if (c93651aUJ11 == null) {
            return;
        }
        if (z3) {
            c93651aUJ11.setOnDismissListener(null);
        }
        C93651aUJ<C94291aed> c93651aUJ12 = this.LJLLJ;
        o.LJI(c93651aUJ12);
        c93651aUJ12.dismiss();
        this.LJLLJ = null;
    }

    public static /* synthetic */ void LLIIIILZ(C94855anj c94855anj, boolean z, AbstractC94471ahX abstractC94471ahX, View view, boolean z2, int i) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        c94855anj.LLIIII(z, abstractC94471ahX, view, z2, false);
    }
}

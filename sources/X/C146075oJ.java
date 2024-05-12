package X;

import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import fjb.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.newplayer.CutPlayerActivity$onCreate$5", f = "CutPlayerActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5oJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146075oJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractActivityC171766oe LJLIL;
    public final /* synthetic */ CutSource LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ AbstractBinderC172036p5 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C146075oJ(AbstractActivityC171766oe abstractActivityC171766oe, CutSource cutSource, String str, AbstractBinderC172036p5 abstractBinderC172036p5, InterfaceC67352kd<? super C146075oJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractActivityC171766oe;
        this.LJLILLLLZI = cutSource;
        this.LJLJI = str;
        this.LJLJJI = abstractBinderC172036p5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C146075oJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AbstractActivityC171766oe abstractActivityC171766oe = this.LJLIL;
        CutSource cutSource = this.LJLILLLLZI;
        o.LJIIIIZZ(cutSource, "cutSource");
        NLETemplateSource nLETemplateSource = new NLETemplateSource(abstractActivityC171766oe, cutSource, this.LJLJI);
        AbstractActivityC171766oe abstractActivityC171766oe2 = this.LJLIL;
        AbstractBinderC172036p5 abstractBinderC172036p5 = this.LJLJJI;
        nLETemplateSource.LJ(new C82876Wfo(new C82869Wfh(abstractActivityC171766oe2)));
        final WeakReference weakReference = new WeakReference(abstractActivityC171766oe2);
        nLETemplateSource.LIZ(new NLEPrepareListener(weakReference) { // from class: X.5UW
            public final WeakReference<AbstractActivityC171766oe> LIZ;

            public final AbstractActivityC171766oe LIZ() {
                AbstractActivityC171766oe abstractActivityC171766oe3 = this.LIZ.get();
                if (abstractActivityC171766oe3 == null || abstractActivityC171766oe3.isFinishing() || abstractActivityC171766oe3.isDestroyed()) {
                    return null;
                }
                return abstractActivityC171766oe3;
            }

            {
                this.LIZ = weakReference;
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                ArrayList<MediaItem> LIZ;
                ArrayList<TextItem> LIZIZ;
                VecNLETrackSlotSPtr mutableAssetItems;
                ArrayList<MediaItem> arrayList;
                ArrayList<TextItem> arrayList2;
                TextItem textItem;
                if (nLETemplateModel == null) {
                    LIZ = null;
                    LIZIZ = null;
                } else {
                    LIZ = C127334zB.LIZ(nLETemplateModel);
                    LIZIZ = C127334zB.LIZIZ(nLETemplateModel);
                }
                AbstractActivityC171766oe LIZ2 = LIZ();
                int i = 0;
                if (LIZ2 != null) {
                    if (nLETemplateModel == null || nLETemplateModel.getTemplateInfo() == null) {
                        LIZ2.finish();
                    }
                    if (nLETemplateModel == null || (mutableAssetItems = nLETemplateModel.getMutableAssetItems()) == null || mutableAssetItems.isEmpty()) {
                        LIZ2.finish();
                    }
                }
                AbstractActivityC171766oe LIZ3 = LIZ();
                if (LIZ3 == null) {
                    return;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onPreparePreSuccess : ");
                LIZ4.append(LIZ);
                LIZ4.append(", ");
                LIZ4.append(LIZIZ);
                C172586py.LIZJ("cutui.CutPlayerActivity", X1D.LIZIZ(LIZ4));
                if (LIZ != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<MediaItem> it = LIZ.iterator();
                    while (it.hasNext()) {
                        MediaItem next = it.next();
                        if (next.isMutable) {
                            arrayList3.add(next);
                        }
                    }
                    arrayList = new ArrayList<>(arrayList3);
                } else {
                    arrayList = null;
                }
                if (LIZIZ != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<TextItem> it2 = LIZIZ.iterator();
                    while (it2.hasNext()) {
                        TextItem next2 = it2.next();
                        if (next2.mutable) {
                            arrayList4.add(next2);
                        }
                    }
                    arrayList2 = new ArrayList<>(arrayList4);
                } else {
                    arrayList2 = null;
                }
                ArrayList<MediaItem> arrayList5 = LIZ3.LLD;
                if (arrayList != null && arrayList5 != null) {
                    AbstractActivityC171766oe.LLIIIJ(arrayList, arrayList5);
                }
                LIZ3.LLD = arrayList;
                ArrayList<TextItem> arrayList6 = LIZ3.LLF;
                if (arrayList2 != null && arrayList6 != null) {
                    Iterator<TextItem> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        TextItem next3 = it3.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            TextItem textItem2 = next3;
                            if (textItem2.mutable) {
                                Iterator<TextItem> it4 = arrayList6.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        textItem = it4.next();
                                        if (o.LJ(textItem.materialId, textItem2.materialId)) {
                                            break;
                                        }
                                    } else {
                                        textItem = null;
                                        break;
                                    }
                                }
                                TextItem textItem3 = textItem;
                                if (textItem3 != null) {
                                    TextItem textItem4 = (TextItem) ListProtector.get(arrayList2, i);
                                    String text = textItem3.text;
                                    long j = textItem4.duration;
                                    boolean z = textItem4.mutable;
                                    String materialId = textItem4.materialId;
                                    double d = textItem4.rotation;
                                    long j2 = textItem4.targetStartTime;
                                    o.LJIIIZ(materialId, "materialId");
                                    o.LJIIIZ(text, "text");
                                    ListProtector.set(arrayList2, i, new TextItem(j, z, materialId, d, j2, text));
                                }
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                LIZ3.LLF = arrayList2;
                if (LIZ3.LL || LIZ3.LJZL || LIZ3.LJZI) {
                    return;
                }
                LIZ3.LLFII();
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                ArrayList<MediaItem> LIZ;
                ArrayList<TextItem> arrayList = null;
                if (nLETemplateModel == null) {
                    LIZ = null;
                } else {
                    LIZ = C127334zB.LIZ(nLETemplateModel);
                    arrayList = C127334zB.LIZIZ(nLETemplateModel);
                }
                if (LIZ() == null) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onPrepareSuccess : ");
                LIZ2.append(LIZ);
                LIZ2.append(", ");
                LIZ2.append(arrayList);
                C172586py.LIZJ("cutui.CutPlayerActivity", X1D.LIZIZ(LIZ2));
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onError(int i, String str) {
                AbstractActivityC171766oe LIZ = LIZ();
                if (LIZ == null) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onPrepareError : ");
                LIZ2.append(i);
                LIZ2.append(", ");
                LIZ2.append((Object) str);
                C172586py.LIZIZ("cutui.CutPlayerActivity", X1D.LIZIZ(LIZ2), null);
                LIZ.overridePendingTransition(0, 0);
                LIZ.finish();
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onProgress(float f, String str) {
                LIZ();
            }
        });
        nLETemplateSource.LJFF(abstractBinderC172036p5);
        nLETemplateSource.LIZJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

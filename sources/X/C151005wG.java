package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5wG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151005wG extends AbstractC29891Fh<InterfaceC151215wb> implements InterfaceC151215wb {
    public final InterfaceC151215wb LJLIL = this;
    public C151055wL LJLILLLLZI;

    @Override // X.InterfaceC151215wb
    public void Xm() {
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL != null) {
            c151055wL.LLJLILLLLZIIL();
        }
    }

    @Override // X.InterfaceC151215wb
    public SingleImageData bJ() {
        SingleImageData singleImageData;
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL != null && (singleImageData = c151055wL.LJLIL) != null) {
            return singleImageData;
        }
        throw new IllegalArgumentException("image scene not exist");
    }

    @Override // X.InterfaceC151215wb
    public View gc() {
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL != null) {
            return c151055wL.mView;
        }
        return null;
    }

    @Override // X.InterfaceC151215wb
    public C151085wO h20() {
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL != null) {
            return c151055wL.LLJJ();
        }
        throw new IllegalArgumentException("image scene not exist");
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC151215wb getApiComponent() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC151215wb
    public void Cu0(boolean z) {
        TEImageInterface tEImageInterface;
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL != null) {
            if (z) {
                c151055wL.LLJJ().setCropRect(C151045wK.LIZ(c151055wL.LJLIL.getEditImageInfo().getRatio(), c151055wL.LJLIL.getSrcImageInfo().getWidth() / c151055wL.LJLIL.getSrcImageInfo().getHeight(), c151055wL.LJLLLL, c151055wL.LJLLLLLL + C151105wQ.LJ + C151105wQ.LIZLLL));
                ArrayList<StickerItemModel> arrayList = c151055wL.LJZI.LIZ;
                ArrayList arrayList2 = new ArrayList();
                Iterator<StickerItemModel> it = arrayList.iterator();
                while (it.hasNext()) {
                    StickerItemModel next = it.next();
                    if (!next.isTextSticker()) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    c151055wL.LL.LJI(((StickerItemModel) it2.next()).getId(), false);
                }
                C151325wm LIZIZ = c151055wL.LL.LIZ.LIZIZ();
                if (LIZIZ != null && (tEImageInterface = LIZIZ.LJII) != null) {
                    tEImageInterface.doRenderEffect(false);
                }
                View findViewById = c151055wL.LLJJI().findViewById(R.id.l5i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            } else {
                View findViewById2 = c151055wL.LLJJI().findViewById(R.id.l5i);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                c151055wL.LJLIL.getEditImageInfo().isFullScreen();
                c151055wL.LLJJLIIIJLLLLLLLZ(true);
            }
            InterfaceC150885w4 interfaceC150885w4 = (InterfaceC150885w4) c151055wL.LLIIIILZ.getValue();
            if (interfaceC150885w4 != null) {
                interfaceC150885w4.LLFII(!z);
            }
            InterfaceC150895w5 interfaceC150895w5 = (InterfaceC150895w5) c151055wL.LJLLJ.LIZ(c151055wL, C151055wL.LLIILZL[0]);
            if (interfaceC150895w5 != null) {
                interfaceC150895w5.LLFII(!z);
            }
        }
    }

    @Override // X.InterfaceC151215wb
    public void LN(C151055wL scene) {
        o.LJIIIZ(scene, "scene");
        this.LJLILLLLZI = scene;
    }

    @Override // X.InterfaceC151215wb
    public void YV(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL != null) {
            c151055wL.LLJJJJ();
        }
    }

    @Override // X.InterfaceC151215wb
    public <T> T br0(Class<T> className) {
        C82622Wbi LJJLIIIJJI;
        o.LJIIIZ(className, "className");
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL == null || (LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(c151055wL)) == null) {
            return null;
        }
        return (T) LJJLIIIJJI.LJIIIIZZ(null, className);
    }

    @Override // X.InterfaceC151215wb
    public <T extends WM7> T ei0(String tag) {
        o.LJIIIZ(tag, "tag");
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL != null) {
            return (T) c151055wL.findSceneByTag(tag);
        }
        return null;
    }

    @Override // X.InterfaceC151215wb
    public Rect Ha0(boolean z, float f) {
        int i;
        C151055wL c151055wL = this.LJLILLLLZI;
        if (c151055wL != null) {
            C151535x7 c151535x7 = C151535x7.LIZ;
            float f2 = c151055wL.LJLLLL;
            float f3 = f2 / c151055wL.LJLLLLLL;
            c151535x7.getClass();
            if (f == f3) {
                i = 0;
            } else {
                i = (int) ((((1.0f / f3) - (1.0f / f)) * f2) / 2.0f);
            }
            return new Rect(0, i, c151055wL.LJLLLL, c151055wL.LJLLLLLL - i);
        }
        return new Rect();
    }
}

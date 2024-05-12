package X;

import com.bytedance.effectcreatormobile.behaviour.viewmodel.EditViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.aRD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93459aRD {
    public final EnumC93441aQv LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;
    public final /* synthetic */ EditViewModel LIZLLL;

    public final C93459aRD LIZ() {
        int i;
        int i2;
        if (!this.LIZJ && this.LIZ == this.LIZLLL.LJLJI.LIZ.getValue() && o.LJ(this.LIZIZ, this.LIZLLL.LJLJJI.LIZ.getValue())) {
            return new C93459aRD(this.LIZLLL, this.LIZ, this.LIZIZ, false);
        }
        AbstractC94370afu value = this.LIZLLL.LJLILLLLZI.LIZ.getValue();
        if (value != null) {
            EnumC93441aQv enumC93441aQv = this.LIZ;
            if (enumC93441aQv != null) {
                int i3 = C93852aXY.LIZ[enumC93441aQv.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                Integer num = this.LIZIZ;
                                if (num != null) {
                                    i2 = num.intValue();
                                } else {
                                    i2 = 0;
                                }
                                int i4 = i2 + 1;
                                if (value.LJI().size() <= i4) {
                                    if (value.LJII().LJIIIZ()) {
                                        return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_TRIGGER, -1, false);
                                    }
                                    return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_TRIGGER, -1, false).LIZ();
                                }
                                if (((AbstractC94372afw) ListProtector.get(value.LJI(), i4)).LJ().isEmpty()) {
                                    return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_OBJECT, Integer.valueOf(i4), false);
                                }
                                return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_OBJECT, Integer.valueOf(i4), false).LIZ();
                            }
                        } else {
                            Integer num2 = this.LIZIZ;
                            if (num2 != null) {
                                i = num2.intValue();
                            } else {
                                i = 0;
                            }
                            if (((AbstractC94372afw) ListProtector.get(value.LJI(), i)).LIZLLL().LJII()) {
                                return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_ACTION, Integer.valueOf(i), false);
                            }
                            return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_ACTION, Integer.valueOf(i), false).LIZ();
                        }
                    } else {
                        if (value.LJI().isEmpty()) {
                            return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_TRIGGER, this.LIZIZ, false);
                        }
                        if (((AbstractC94372afw) ListProtector.get(value.LJI(), 0)).LJ().isEmpty()) {
                            return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_OBJECT, 0, false);
                        }
                        return new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_OBJECT, 0, false).LIZ();
                    }
                } else {
                    C93459aRD c93459aRD = new C93459aRD(this.LIZLLL, EnumC93441aQv.VIEW_TYPE_TRIGGER_EXTRA, this.LIZIZ, false);
                    if (C93852aXY.LIZIZ[value.LJII().LJII().ordinal()] != 1) {
                        return c93459aRD.LIZ();
                    }
                    if (value.LJII().LJFF() == null) {
                        return c93459aRD;
                    }
                    return c93459aRD.LIZ();
                }
            }
            return new C93459aRD(this.LIZLLL, this.LIZ, this.LIZIZ, false);
        }
        EditViewModel editViewModel = this.LIZLLL;
        return new C93459aRD(editViewModel, editViewModel.LJLJI.LIZ.getValue(), this.LIZLLL.LJLJJI.LIZ.getValue(), false);
    }

    public C93459aRD(EditViewModel editViewModel, EnumC93441aQv enumC93441aQv, Integer num, boolean z) {
        this.LIZLLL = editViewModel;
        this.LIZ = enumC93441aQv;
        this.LIZIZ = num;
        this.LIZJ = z;
    }
}

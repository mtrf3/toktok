package X;

import java.util.Stack;

/* renamed from: X.0Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07600Ro {
    public final C07560Rk LIZ;
    public final Stack<EnumC07550Rj> LIZIZ = new Stack<>();

    public final EnumC21150sJ LIZJ() {
        if (this.LIZIZ.isEmpty()) {
            return EnumC21150sJ.OTHER;
        }
        EnumC07550Rj peek = this.LIZIZ.peek();
        if (peek != null) {
            int i = C07590Rn.LIZ[peek.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return EnumC21150sJ.REQUESTS;
                    }
                } else {
                    return EnumC21150sJ.SEARCH;
                }
            } else {
                return EnumC21150sJ.NORMAL;
            }
        }
        return EnumC21150sJ.OTHER;
    }

    public C07600Ro(C07560Rk c07560Rk) {
        this.LIZ = c07560Rk;
    }

    public final Object LIZ(C31241Km c31241Km, C3CS c3cs) {
        EnumC07550Rj peek;
        Object LIZ;
        Object obj;
        Object LIZIZ;
        Object LIZIZ2;
        Object LIZIZ3;
        if (c31241Km instanceof C41901kg) {
            EnumC07540Ri enumC07540Ri = ((C41901kg) c31241Km).LIZ;
            this.LIZIZ.push(EnumC07550Rj.LIBRARY);
            int i = C07590Rn.LIZIZ[enumC07540Ri.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    this.LIZIZ.push(EnumC07550Rj.PLAYLIST);
                }
            } else {
                this.LIZIZ.push(EnumC07550Rj.SETTING);
            }
            Object LIZ2 = this.LIZ.LIZ(new C1LZ(enumC07540Ri), c3cs);
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
            if (LIZ2 != enumC58928NAu) {
                LIZ2 = C76800UCe.LIZ;
            }
            if (LIZ2 == enumC58928NAu) {
                return LIZ2;
            }
            return C76800UCe.LIZ;
        }
        if (c31241Km instanceof C41911kh) {
            if (this.LIZIZ.contains(EnumC07550Rj.CONTAINER)) {
                Stack<EnumC07550Rj> stack = this.LIZIZ;
                EnumC07550Rj enumC07550Rj = EnumC07550Rj.LIBRARY;
                if (!stack.contains(enumC07550Rj)) {
                    this.LIZIZ.push(enumC07550Rj);
                    LIZIZ3 = this.LIZ.LIZ(C31381La.LIZ, c3cs);
                    if (LIZIZ3 != EnumC58928NAu.COROUTINE_SUSPENDED) {
                        LIZIZ3 = C76800UCe.LIZ;
                    }
                } else {
                    LIZIZ3 = C76800UCe.LIZ;
                }
            } else {
                LIZIZ3 = LIZIZ(EnumC07540Ri.LIBRARY, c3cs);
                if (LIZIZ3 != EnumC58928NAu.COROUTINE_SUSPENDED) {
                    LIZIZ3 = C76800UCe.LIZ;
                }
            }
            if (LIZIZ3 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LIZIZ3;
            }
            return C76800UCe.LIZ;
        }
        if (c31241Km instanceof C41941kk) {
            if (this.LIZIZ.contains(EnumC07550Rj.LIBRARY)) {
                Stack<EnumC07550Rj> stack2 = this.LIZIZ;
                EnumC07550Rj enumC07550Rj2 = EnumC07550Rj.SETTING;
                if (!stack2.contains(enumC07550Rj2)) {
                    this.LIZIZ.push(enumC07550Rj2);
                    LIZIZ2 = this.LIZ.LIZ(C1L1.LIZ, c3cs);
                    if (LIZIZ2 != EnumC58928NAu.COROUTINE_SUSPENDED) {
                        LIZIZ2 = C76800UCe.LIZ;
                    }
                } else {
                    LIZIZ2 = C76800UCe.LIZ;
                }
            } else {
                LIZIZ2 = LIZIZ(EnumC07540Ri.SETTING, c3cs);
                if (LIZIZ2 != EnumC58928NAu.COROUTINE_SUSPENDED) {
                    LIZIZ2 = C76800UCe.LIZ;
                }
            }
            if (LIZIZ2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LIZIZ2;
            }
            return C76800UCe.LIZ;
        }
        if (c31241Km instanceof C41921ki) {
            EnumC07540Ri enumC07540Ri2 = ((C41921ki) c31241Km).LIZ;
            if (this.LIZIZ.contains(EnumC07550Rj.LIBRARY)) {
                Stack<EnumC07550Rj> stack3 = this.LIZIZ;
                EnumC07550Rj enumC07550Rj3 = EnumC07550Rj.PLAYLIST;
                if (!stack3.contains(enumC07550Rj3)) {
                    this.LIZIZ.push(enumC07550Rj3);
                    LIZIZ = this.LIZ.LIZ(new C31391Lb(enumC07540Ri2), c3cs);
                    if (LIZIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                        LIZIZ = C76800UCe.LIZ;
                    }
                } else {
                    LIZIZ = C76800UCe.LIZ;
                }
            } else {
                LIZIZ = LIZIZ(enumC07540Ri2, c3cs);
                if (LIZIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                    LIZIZ = C76800UCe.LIZ;
                }
            }
            if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LIZIZ;
            }
            return C76800UCe.LIZ;
        }
        if (c31241Km instanceof C41931kj) {
            Stack<EnumC07550Rj> stack4 = this.LIZIZ;
            EnumC07550Rj enumC07550Rj4 = EnumC07550Rj.SEARCH;
            if (!stack4.contains(enumC07550Rj4)) {
                this.LIZIZ.push(enumC07550Rj4);
                obj = this.LIZ.LIZ(C31401Lc.LIZ, c3cs);
                if (obj != EnumC58928NAu.COROUTINE_SUSPENDED) {
                    obj = C76800UCe.LIZ;
                }
            } else {
                obj = C76800UCe.LIZ;
            }
            if (obj == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return obj;
            }
            return C76800UCe.LIZ;
        }
        if (c31241Km instanceof C41821kY) {
            boolean z = ((C41821kY) c31241Km).LIZ;
            if (this.LIZIZ.isEmpty()) {
                LIZ = this.LIZ.LIZ(C31341Kw.LIZ, c3cs);
                if (LIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                    LIZ = C76800UCe.LIZ;
                }
            } else {
                EnumC07550Rj pop = this.LIZIZ.pop();
                if (this.LIZIZ.isEmpty() || (peek = this.LIZIZ.peek()) == null || peek == EnumC07550Rj.CONTAINER) {
                    this.LIZIZ.clear();
                    LIZ = this.LIZ.LIZ(C31341Kw.LIZ, c3cs);
                    if (LIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                        LIZ = C76800UCe.LIZ;
                    }
                } else {
                    if (pop != null) {
                        int i2 = C07590Rn.LIZ[pop.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 == 4) {
                                        if (z) {
                                            this.LIZIZ.clear();
                                            LIZ = this.LIZ.LIZ(C31341Kw.LIZ, c3cs);
                                            if (LIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                                                LIZ = C76800UCe.LIZ;
                                            }
                                        } else {
                                            LIZ = this.LIZ.LIZ(C1LC.LIZ, c3cs);
                                            if (LIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                                                LIZ = C76800UCe.LIZ;
                                            }
                                        }
                                    }
                                } else if (z) {
                                    this.LIZIZ.clear();
                                    LIZ = this.LIZ.LIZ(C31341Kw.LIZ, c3cs);
                                    if (LIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                                        LIZ = C76800UCe.LIZ;
                                    }
                                } else {
                                    LIZ = this.LIZ.LIZ(C1L8.LIZ, c3cs);
                                    if (LIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                                        LIZ = C76800UCe.LIZ;
                                    }
                                }
                            } else {
                                LIZ = this.LIZ.LIZ(C1LA.LIZ, c3cs);
                                if (LIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                                    LIZ = C76800UCe.LIZ;
                                }
                            }
                        } else {
                            this.LIZIZ.clear();
                            LIZ = this.LIZ.LIZ(C31341Kw.LIZ, c3cs);
                            if (LIZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                                LIZ = C76800UCe.LIZ;
                            }
                        }
                    }
                    LIZ = C76800UCe.LIZ;
                }
            }
            if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LIZ;
            }
            return C76800UCe.LIZ;
        }
        if (c31241Km instanceof C41841ka) {
            this.LIZIZ.clear();
            Object LIZ3 = this.LIZ.LIZ(C31341Kw.LIZ, c3cs);
            EnumC58928NAu enumC58928NAu2 = EnumC58928NAu.COROUTINE_SUSPENDED;
            if (LIZ3 != enumC58928NAu2) {
                LIZ3 = C76800UCe.LIZ;
            }
            if (LIZ3 == enumC58928NAu2) {
                return LIZ3;
            }
            return C76800UCe.LIZ;
        }
        if (c31241Km instanceof C41891kf) {
            Object LIZ4 = this.LIZ.LIZ(C1L6.LIZ, c3cs);
            if (LIZ4 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LIZ4;
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    public final Object LIZIZ(EnumC07540Ri enumC07540Ri, C3CS c3cs) {
        Stack<EnumC07550Rj> stack = this.LIZIZ;
        EnumC07550Rj enumC07550Rj = EnumC07550Rj.CONTAINER;
        if (!stack.contains(enumC07550Rj)) {
            this.LIZIZ.push(enumC07550Rj);
            Object LIZ = this.LIZ.LIZ(new C1LM(enumC07540Ri), c3cs);
            if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LIZ;
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }
}

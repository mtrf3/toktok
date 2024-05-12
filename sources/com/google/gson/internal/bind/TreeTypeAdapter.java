package com.google.gson.internal.bind;

import X.C65385PlN;
import X.C65403Plf;
import X.C77119UOl;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.p;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.lang.reflect.Type;

/* loaded from: classes12.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    public final r<T> LIZ;
    public final i<T> LIZIZ;
    public final Gson LIZJ;
    public final TypeToken<T> LIZLLL;
    public final u LJ;
    public final TreeTypeAdapter<T>.a LJFF = new a();
    public TypeAdapter<T> LJI;

    /* loaded from: classes12.dex */
    public final class a implements q, h {
        public a() {
        }

        public final <R> R LIZ(j jVar, Type type) {
            return (R) TreeTypeAdapter.this.LIZJ.LIZLLL(jVar, type);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(C65385PlN c65385PlN) {
        if (this.LIZIZ == null) {
            TypeAdapter<T> typeAdapter = this.LJI;
            if (typeAdapter == null) {
                typeAdapter = this.LIZJ.LJIIJJI(this.LJ, this.LIZLLL);
                this.LJI = typeAdapter;
            }
            return typeAdapter.read(c65385PlN);
        }
        j LIZ = p.LIZ(c65385PlN);
        LIZ.getClass();
        if (LIZ instanceof l) {
            return null;
        }
        return this.LIZIZ.deserialize(LIZ, this.LIZLLL.getType(), this.LJFF);
    }

    /* loaded from: classes12.dex */
    public static final class SingleTypeFactory implements u {
        public final TypeToken<?> LJLIL;
        public final boolean LJLILLLLZI;
        public final Class<?> LJLJI;
        public final r<?> LJLJJI;
        public final i<?> LJLJJL;

        @Override // com.google.gson.u
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.LJLIL;
            if (typeToken2 == null ? this.LJLJI.isAssignableFrom(typeToken.getRawType()) : !(!typeToken2.equals(typeToken) && (!this.LJLILLLLZI || this.LJLIL.getType() != typeToken.getRawType()))) {
                return new TreeTypeAdapter(this.LJLJJI, this.LJLJJL, gson, typeToken, this);
            }
            return null;
        }

        public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            r<?> rVar;
            boolean z2;
            if (obj instanceof r) {
                rVar = (r) obj;
            } else {
                rVar = null;
            }
            this.LJLJJI = rVar;
            i<?> iVar = obj instanceof i ? (i) obj : null;
            this.LJLJJL = iVar;
            if (rVar != null || iVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C77119UOl.LIZJ(z2);
            this.LJLIL = typeToken;
            this.LJLILLLLZI = z;
            this.LJLJI = cls;
        }
    }

    public static u LIZ(TypeToken<?> typeToken, Object obj) {
        boolean z;
        if (typeToken.getType() == typeToken.getRawType()) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, typeToken, z, null);
    }

    public static u LIZIZ(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, T t) {
        r<T> rVar = this.LIZ;
        if (rVar == null) {
            TypeAdapter<T> typeAdapter = this.LJI;
            if (typeAdapter == null) {
                typeAdapter = this.LIZJ.LJIIJJI(this.LJ, this.LIZLLL);
                this.LJI = typeAdapter;
            }
            typeAdapter.write(c65403Plf, t);
            return;
        }
        if (t == null) {
            c65403Plf.LJIIJJI();
        } else {
            p.LIZIZ(rVar.serialize(t, this.LIZLLL.getType(), this.LJFF), c65403Plf);
        }
    }

    public TreeTypeAdapter(r<T> rVar, i<T> iVar, Gson gson, TypeToken<T> typeToken, u uVar) {
        this.LIZ = rVar;
        this.LIZIZ = iVar;
        this.LIZJ = gson;
        this.LIZLLL = typeToken;
        this.LJ = uVar;
    }
}

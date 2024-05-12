package com.google.gson.internal.bind;

import X.C65385PlN;
import X.C65403Plf;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;

/* loaded from: classes12.dex */
public final class c extends ReflectiveTypeAdapterFactory.a {
    public final /* synthetic */ Field LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ TypeAdapter LJFF;
    public final /* synthetic */ Gson LJI;
    public final /* synthetic */ TypeToken LJII;
    public final /* synthetic */ boolean LJIIIIZZ;

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final boolean LIZJ(Object obj) {
        if (!this.LIZIZ || this.LIZLLL.get(obj) == obj) {
            return false;
        }
        return true;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void LIZ(C65385PlN c65385PlN, Object obj) {
        Object read = this.LJFF.read(c65385PlN);
        if (read != null || !this.LJIIIIZZ) {
            this.LIZLLL.set(obj, read);
        }
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void LIZIZ(C65403Plf c65403Plf, Object obj) {
        TypeAdapter typeAdapterRuntimeTypeWrapper;
        Object obj2 = this.LIZLLL.get(obj);
        if (this.LJ) {
            typeAdapterRuntimeTypeWrapper = this.LJFF;
        } else {
            typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(this.LJI, this.LJFF, this.LJII.getType());
        }
        typeAdapterRuntimeTypeWrapper.write(c65403Plf, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z, boolean z2, Field field, boolean z3, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean z4) {
        super(str, z, z2);
        this.LIZLLL = field;
        this.LJ = z3;
        this.LJFF = typeAdapter;
        this.LJI = gson;
        this.LJII = typeToken;
        this.LJIIIIZZ = z4;
    }
}
